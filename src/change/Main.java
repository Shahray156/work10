package change;

public class Main {

    public static void main(String[] args) {

        Transport[] transportsAtServiceStation = new Transport[] {
        new Bicycle("Bicycle1", 2),
                new Bicycle("Bicycle2", 2),
                new Car("Car1", 4),
                new Car("Car2", 4),
                new Truck("Truck1", 4),
                new Truck("Truck2", 4),
        };

        ServiceStation station = new ServiceStation();
        for(Transport transport : transportsAtServiceStation) {
            station.check(transport);
        }
    }
    }