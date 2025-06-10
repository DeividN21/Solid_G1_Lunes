package ocp;
import java.util.regex.Pattern;

class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}