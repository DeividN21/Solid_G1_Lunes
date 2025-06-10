import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();
        NotificationService notifier = new NotificationService();

        UserManager userManager = new UserManager(validator, repository, notifier);
        userManager.addUser("example@domain.com", "password123");
        userManager.addUser("invalid-email", "1234");
    }
}