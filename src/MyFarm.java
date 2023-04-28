public class MyFarm {
    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
    }

    public  Plot[][] grid;
    public MyFarm() {
        System.out.println("Hello form my Farm!");
        Plot ryan = new Plot();
        ryan.printPlot();

        grid = new Plot[4][3];

        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] =new Plot();
                grid[p][h].printPlot();
            }
        }



        //call methods here
        totalPlants();
        printPlantNames();

    }
    public void totalPlants() {
        // how many total plants are there in the grid?
        int sumOfpLants = 0;

        for(int e=0; e<grid.length; e++){
            for(int c= 0; c< grid[e].length; c++){
                sumOfpLants += grid[e][c].numberOfPlant;
            }
        }
        System.out.println(sumOfpLants);

    }

    public void printPlantNames() {

        for(int r=0; r<grid.length; r++){
            for(int c= 0; c< grid[r].length; c++) {
                System.out.println("row: " + r + "col: "+c+" "+ grid[r][c].plantName);
            }

    }

}}
