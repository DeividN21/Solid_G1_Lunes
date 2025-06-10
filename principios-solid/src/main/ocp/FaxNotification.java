package ocp;
import java.util.regex.Pattern;

public class FaxNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Fax: " + message);

    }

}
