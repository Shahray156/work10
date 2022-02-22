package change;

public class ServiceStation {

    public void check(Transport transport) {
        if (transport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) transport;
            System.out.println("Обслуживаем " + bicycle.getModelName());
             bicycle.updateTyre();
            }

          if (transport instanceof Car) {
        Car car = (Car) transport;
        System.out.println("Обслуживаем " + car.getModelName());
        car.updateTyre();
        car.checkEngie();

              if (transport instanceof Truck) {
                  Truck truck = (Truck) transport;
                  System.out.println("Обслуживаем " + truck.getModelName());
                  truck.updateTyre();
                  truck.checkEngie();
                  truck.checkTrailer();
              }
            }
        }
    }
