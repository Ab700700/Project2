import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main {

    public static void main(String[] args) throws Exception {

        Route r1 = new Route("home","work",50);
        Route r2 = new Route("work","home",45);

        Car c1= new Car("A100",0,r1);
        Car c2= new Car("A102",2,r2);
        Car c3= new Car("A103",1,r1);

        List<Passenger> passengers = new ArrayList<>();
        Passenger p1 = new SubscribersPassengers("Ab","1001001");
        Passenger p2 =new NonSubscribersPassengers("Ad","100100");
        Passenger p3 = new SubscribersPassengers("name3","1001003");
        Passenger p4= new SubscribersPassengers("name4","1001004");
        Passenger p5= new SubscribersPassengers("name5","1001005");
        p1.setReservedCarAndCost(c1,false);
        p2.setReservedCarAndCost(c2,true);
        p3.setReservedCarAndCost(c2,false);
        p4.setReservedCarAndCost(c2,false);
        p5.setReservedCarAndCost(c3,false);
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        passengers.add(p4);
        passengers.add(p5);
        for(Passenger p : passengers){
            System.out.println(p.info());
        }
        System.out.println(c2.getMaximumCapacity());

    }






    



}