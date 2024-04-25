package patterns.builder.example4;

import java.time.Instant;

/**
 * @author vahe.marikyan
 * @since 25.04.24
 */
public class Transaction {

    private final String sender;
    private final String recipient;
    private final double amount;
    private final Instant timestamp;

    private Transaction(Builder builder) {
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.amount = builder.amount;
        this.timestamp = builder.timestamp;
    }

    public static class Builder {
        private final String sender;
        private final String recipient;
        private final double amount;

        private Instant timestamp = Instant.now();

        public Builder(String sender, String recipient, double amount) {
            this.sender = sender;
            this.recipient = recipient;
            this.amount = amount;
        }

        public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;

            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

    @Override
    public String toString() {
        return "{"
                + "\"sender\": " + sender
                + ", \"recipient\": \"" + recipient + "\""
                + ", \"amount\": \"" + amount + "\""
                + ", \"timestamp\": \"" + timestamp + "\""
                + "}";
    }
}
