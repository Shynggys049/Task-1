public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void assignTaxi(String driver) {
        System.out.println("Passenger " + name + " has been assigned to driver " + driver);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}