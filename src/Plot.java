public class Plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;

    public Plot(){
       // plantName = "sunflower";
        needsWater = false;
        numberOfPlant = (int)(Math.random() * 100) + 10;//random num 10 110
        int num = (int)(Math.random() * 5);//0-4
        if(num == 0){
            plantName = "sunflower";
        } else if (num == 1) {
            plantName = "corn";
        }else if (num == 2) {
            plantName = "carrot";
        }else if (num == 3) {
            plantName = "tomato";
        } else{
            plantName = "empty";
            numberOfPlant = 0;
        }
    }

    public void printPlot(){
        System.out.println("the plot has " + numberOfPlant+ " of " +plantName + " and it is " +needsWater+" that it needs water");
    }
}
