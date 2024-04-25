package patterns.builder.example3;

/**
 * @author vahe.marikyan
 * @since 24.04.24
 */
public class FormManagement {
    public static void main(String[] args) {
        Form projectForm = new Form.Builder(1, "Project form")
                .setCategory(FormCategory.PROJECT)
                .setPrefix("de-service")
                .build();

        Form indicatorForm = new Form.Builder(2, "Indicator form")
                .setCategory(FormCategory.INDICATOR)
                .setPrefix("me")
                .setDescription("Indicator description")
                .build();

        System.out.println(projectForm.toString());
        System.out.println(indicatorForm.toString());
    }
}
