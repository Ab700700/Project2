public class SubscribersPassengers extends Passenger{


    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    @Override
    public void setReservedCarAndCost(Car car,boolean hasDiscount) throws Exception{
       try{
           if(car.getMaximumCapacity()<=0) {
               throw new Exception();
           }else{
               super.setReservedCar(car);
               super.setCost(car.getFixedRoute().getTripPrice()-(car.getFixedRoute().getTripPrice()*0.5));
               car.setMaximumCapacity(car.getMaximumCapacity()-1);
           }
       }catch(Exception e){
           System.out.println("Car: "+car.getCode()+" is full");
       }





    }

   public String  info(){
        return "Name: "+getName()+"\nId: "+getId()+"\nCar Code: "+super.getReservedCar().getCode()+"\nCost: "+super.getCost();
   }

}
