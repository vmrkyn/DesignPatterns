package patterns.builder.example2;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public class ComputerBuilder implements Builder {

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    @Override
    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setIsBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public void setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
    }

    public Computer build() {
        return new Computer(HDD, RAM, isGraphicsCardEnabled, isBluetoothEnabled);
    }
}
