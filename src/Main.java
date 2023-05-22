import Server.ServerController;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Main {
    public static void main(String[] args) throws MqttException {
        System.out.println("Hello world!");
        ServerController serverTest = new ServerController();
    }
}