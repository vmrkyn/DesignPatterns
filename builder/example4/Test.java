package patterns.builder.example4;

/**
 * @author vahe.marikyan
 * @since 25.04.24
 */
public class Test {
    public static void main(String[] args) {
        Transaction trOne = new Transaction.Builder("0x1a2...22", "0x22s...2s", 0.22)
                .build();
        Transaction trTwo = new Transaction.Builder("0x69a...22", "0x22s...2s", 1.1)
                .build();

        System.out.println(trOne.toString());
        System.out.println(trTwo.toString());
    }
}
