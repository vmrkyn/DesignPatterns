package patterns.builder.example2;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public class Director {

    Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        this.builder.setIsBluetoothEnabled(false);
        this.builder.setHDD("Computer HDD");
        this.builder.setRAM("Computer RAM");
//        builder.setIsGraphicsCardEnabled(true);
    }

    /*public void constructComputer(ComputerBuilder builder) {
        builder.setIsBluetoothEnabled(false);
        builder.setHDD("Computer HDD");
        builder.setRAM("Computer RAM");
//        builder.setIsGraphicsCardEnabled(true);
    }

    public void constructPhone(PhoneBuilder builder) {
        builder.setHDD("Phone HDD");
        builder.setRAM("Phone RAM");
        builder.setIsBluetoothEnabled(true);
        builder.setIsGraphicsCardEnabled(false);
    }*/

}
