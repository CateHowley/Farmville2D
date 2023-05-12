public class MyFarm {


    public Plot[][] grid;


    public MyFarm() {
        System.out.println("Hello form my Farm!");
        Plot ryan = new Plot();
        ryan.printPlot();

        grid = new Plot[4][3];

        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new Plot();
                grid[p][h].printPlot();
            }
        }


        //call methods here
        totalPlants();
        printPlantNames();
        totalCarrots();
        plotWithMaxNumber();


    }

    public void totalPlants() {
        // how many total plants are there in the grid?
        int sumOfpLants = 0;

        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                sumOfpLants += grid[e][c].numberOfPlant;
            }
        }
        System.out.println(sumOfpLants);

    }

    public void printPlantNames() {

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.println("row: " + r + "col: " + c + " " + grid[r][c].plantName);
            }

        }

    }

    public void totalCarrots() {
        int sumofCarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantName.equals("carrot")) {
                    sumofCarrots += grid[h][k].numberOfPlant;

                }
            }
        }
        System.out.println("The total amount of carrots are " + sumofCarrots);
    }

    public void plotWithMaxNumber() {
        int maxNumber = grid[0][0].numberOfPlant;
        String name = grid[0][0].plantName;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                if (grid[b][g].numberOfPlant>maxNumber) {
                    maxNumber = grid[b][g].numberOfPlant;
                    name = grid[b][g].plantName;
                }

            }
        }
        System.out.println(name + " has the most plants with a total of "+ maxNumber + " plants ");

    }
    public void plantWithMaxNumber(){
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;

        for(int b = 0; b< grid.length; b++){
            for(int g = 0; g<grid[b].length; g++){
                switch(grid[b][g].plantName){
                    case "corn":
                        numCorn += grid[b][g].numberOfPlant;
                        break;
                    case "sunflower":
                        numSunflower += grid[b][g].numberOfPlant;
                        break;
                    case "tomato":
                            numTomato += grid[b][g].numberOfPlant;
                        break;
                    default:
                        numCarrot += grid[b][g].numberOfPlant;
                        break;
                }
            }
        }
        if(numCorn>numCarrot && numCorn>numSunflower && numCorn>numTomato){
            System.out.println(" Corn has the most plants with "+ numCorn + " plants ");
        }
        if(numTomato>numCarrot && numTomato>numSunflower && numTomato>numCorn){
            System.out.println(" Corn has the most plants with "+ numTomato + " plants ");

    }
        if(numCarrot>numTomato && numCarrot>numSunflower && numCarrot>numCorn){
            System.out.println(" Corn has the most plants with "+ numCarrot + " plants ");

        }
        if(numSunflower>numCarrot && numSunflower>numTomato && numSunflower>numCorn){
            System.out.println(" Corn has the most plants with "+ numSunflower + " plants ");

        }
    else{
        System.out.println("idk");

}

    }
}
