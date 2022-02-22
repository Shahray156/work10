package change;

public abstract class Transport {

    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {this.modelName = modelName;}

    public void setWheelsCount(int wheelsCount) {this.wheelsCount = wheelsCount;}

    public void updateTyre() {
        for(int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрушку");
        }
    }
}