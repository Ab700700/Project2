public class NonSubscribersPassengers extends Passenger {

    public NonSubscribersPassengers(String name, String id) {

        super(name, id);
    }

    @Override
    public void setReservedCarAndCost (Car car, boolean hasDiscount) throws Exception{
        if(hasDiscount){
            try{
                if(car.getMaximumCapacity()<=0){
                    throw new Exception();
                }else{
                    super.setReservedCar(car);
                    super.setCost(car.getFixedRoute().getTripPrice()-(car.getFixedRoute().getTripPrice()*0.1));
                    car.setMaximumCapacity(car.getMaximumCapacity()-1);
                }
            }catch (Exception e){
                System.out.println("Car is full");
            }
        }else{
            try{
                if(car.getMaximumCapacity()<=0){
                    throw new Exception();
                }else{
                    super.setReservedCar(car);
                    super.setCost(car.getFixedRoute().getTripPrice());
                    car.setMaximumCapacity(car.getMaximumCapacity()-1);
                }
            }catch (Exception e){
                System.out.println("Car is full");
            }

        }
    }

    public String  info(){
        return "Name: "+getName()+"\nId: "+getId()+"\nCar Code: "+getReservedCar().getCode()+"\nCost: "+getCost();
    }
}
