package patterns.builder.example2;

import patterns.builder.example3.Form;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public class Demo {
    public static void main(String[] args) {

        ComputerBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director(computerBuilder);
        director.constructComputer();
        Computer computer = computerBuilder.build();

        /*Director director = new Director();

        ComputerBuilder computerBuilder = new ComputerBuilder();
        director.constructComputer(computerBuilder);
        Computer computer = computerBuilder.build();
        System.out.println(computer.toString());

        PhoneBuilder phoneBuilder = new PhoneBuilder();
        director.constructPhone(phoneBuilder);
        Phone phone = phoneBuilder.build();
        System.out.println(phone.toString());*/
    }
}
