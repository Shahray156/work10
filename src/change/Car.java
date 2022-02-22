package change;


    public class Car extends Transport {

        public Car(String modelName, int wheelsCount) {
            super(modelName, wheelsCount);
        }

        public void checkEngie() {
            System.out.println("Проверяем двигатель");
        }

    }

