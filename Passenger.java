public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar=new Car();
    private double cost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public abstract void setReservedCarAndCost (Car car,boolean hasDiscount)throws Exception;
    public  String  info(){
        return "";
    };

}
