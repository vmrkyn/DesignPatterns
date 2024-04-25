package patterns.builder.example2;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public interface Builder {

    void setHDD(String HDD);
    void setRAM(String RAM);
    void setIsBluetoothEnabled(boolean isBluetoothEnabled);
    void setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled);
}
