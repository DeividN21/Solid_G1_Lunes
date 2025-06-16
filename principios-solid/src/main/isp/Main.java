package isp;

public class Main {
    public static void main(String[] args) {
        Switchable phone = new Phone();
        Switchable camera = new DisposableCamera();
 
        phone.turnOn();
        phone.turnOff();
 
        if (phone instanceof Rechargeable) {
            ((Rechargeable) phone).charge();
        }
 
        camera.turnOn();
        camera.turnOff();
        // Ya no se llama charge() en camera, y no se lanza excepción.
    }
}