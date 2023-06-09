import java.util.*;

public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];

    public MyFarmArrayList() {
        System.out.println(" my farm using array list ");


        //for(Plot a : row){


        //System.out.println(row.size());
        //arr[0] = new Plot();
        // arr[0].printPlot();
        // row.add(new Plot());
        //a.printPlot();


        for (int p = 0; p < 10; p++) {

            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();


        }
        row.add(new Plot());

        System.out.println(row.size());

        totalPlants();

        addSunflower();
        printPlantNames();
        addCorn();
        printPlantNames();
        totatlCarrots();
        averageNumberOfPlants();
        printRowInfo();
        everyOtherNeedsWater();
        printRowInfo();
        plantWithMaxNumber();
    }

    public void totalPlants() {

        int total = 0;

        for (Plot a : row) {
            total += a.numberOfPlant;
        }

        System.out.println("total plant in my farm is " + total);

    }

    public void printPlantNames() {

        for (int k = 0; k < row.size(); k++) {
            System.out.print(k + ":" + row.get(k).plantName + " \t ");
        }
        System.out.println();
    }

    public void printRowInfo() {
        for (Plot a : row)
        a.printPlot();
    }


    public void addSunflower() {
        Plot sunflower = new Plot();
        sunflower.plantName = "sunflower";
        sunflower.numberOfPlant = 42;
        sunflower.needsWater = true;

        row.add(sunflower);
        sunflower.printPlot();
    }

    public void addCorn() {
        Plot corn = new Plot();
        corn.plantName = "corn";
        corn.numberOfPlant = 70;
        corn.needsWater = false;

        row.add(3, corn);


    }

    public void totatlCarrots() {
        int numberOfCarrots = 0;
        for (Plot b : row) {
            if (b.plantName.equals("carrot")) {
                numberOfCarrots += b.numberOfPlant;
            }
        }

        System.out.println(" total number of carrots is " + numberOfCarrots);
    }

    public void averageNumberOfPlants() {
        int Total = 0;


    }

    public void everyOtherNeedsWater() {
        for (int n = 0; n < row.size(); n++) {
            if (n % 2 == 1)
            {
                row.get(n).needsWater = false;
            }else{
                row.get(n).needsWater = true;
            }

        }
    }
    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

        for (int d = 0; d < row.size(); d++) {
            if(d < row.size());
        }
    }


}


