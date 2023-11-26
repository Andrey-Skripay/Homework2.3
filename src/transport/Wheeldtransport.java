package transport;

public abstract class Wheeldtransport extends Transport {
    private final String modelName;
    private final int wheelsCount;

    public Wheeldtransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {return modelName;}

    public int getWheelsCount() {return wheelsCount;}

    public void updateTyre() {

        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}


