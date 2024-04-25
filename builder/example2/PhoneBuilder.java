package patterns.builder.example2;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public class PhoneBuilder implements Builder {

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

    public Phone build() {
        return new Phone(HDD, RAM, isGraphicsCardEnabled, isBluetoothEnabled);
    }
}
