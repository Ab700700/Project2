public class Route {
    private String startAddress;
    private String destnationAddress;
    private double tripPrice;

    public Route(String startAddress, String destnationAddress, double tripPrice) {
        this.startAddress = startAddress;
        this.destnationAddress = destnationAddress;
        this.tripPrice = tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestnationAddress() {
        return destnationAddress;
    }

    public void setDestnationAddress(String destnationAddress) {
        this.destnationAddress = destnationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
