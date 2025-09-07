import javax.validation.Valid;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, start...");
        @Valid
        User user = new User();

        user.setEmail("invalidEmail");
        user.setName("null");
        user.setAge(75);

        System.out.println("Hello, end...");
    }
}
