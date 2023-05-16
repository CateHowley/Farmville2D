import  java.util.*;

public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList(){
        System.out.println(" my farm using array list ");


        //for(Plot a : row){


        //System.out.println(row.size());
        //arr[0] = new Plot();
       // arr[0].printPlot();
       // row.add(new Plot());
         //a.printPlot();


        for( int p = 0; p < 10; p++) {

            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();


        }
        row.add(new Plot());

        System.out.println(row.size());

        totalPlants();
    }

    public void totalPlants(){

        int total = 0;

        for(Plot a : row){
            total+= a.numberOfPlant;
        }

        System.out.println("total plant in my farm is " + total);

    }
}
