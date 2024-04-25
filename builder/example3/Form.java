package patterns.builder.example3;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public class Form {

    private final int id;
    private final String name;
    private final String description;
    private final FormCategory category;
    private final String prefix;


    public static class Builder {
        private final int id;
        private final String name;
        private String description;
        private FormCategory category;
        private String prefix;


        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setDescription(String description) {
            this.description = description;

            return this;
        }

        public Builder setCategory(FormCategory category) {
            this.category = category;

            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = prefix;

            return this;
        }


        public Form build() {
            return new Form(this);
        }
    }

    public Form(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.category = builder.category;
        this.prefix = builder.prefix;
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\": " + id
                + ", \"name\": \"" + name + "\""
                + ", \"category\": \"" + (category != null ? category.name() : "") + "\""
                + ", \"prefix\": \"" + (prefix != null ? prefix : "") + "\""
                + ", \"description\": \"" + (description != null ? description : "") + "\""
                + "}";
    }
}
