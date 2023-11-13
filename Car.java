public class Car {
    private String code;
    private int maximumCapacity;

    private Route fixedRoute;

    public Car() {
    }

    public Car(String code, int maximumCapacity, Route fixedRoute) {
        this.code = code;
        this.maximumCapacity = maximumCapacity;
        this.fixedRoute = fixedRoute;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }
}
