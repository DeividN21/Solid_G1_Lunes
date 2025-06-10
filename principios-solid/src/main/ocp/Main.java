package ocp;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification(new EmailNotification(), "Hello via Email!");
        service.sendNotification(new PushNotification(), "Hello via Push!");
        service.sendNotification(new SMSNotification(), "Hello via SMS!");

    }

}

 