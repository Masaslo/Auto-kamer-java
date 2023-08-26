import Server.ServerController;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Main {
    public static void main(String[] args) throws MqttException {
        System.out.println("initializing MQTT connection");
        try{
            ServerController serverTest = new ServerController();
            System.out.println("initialized");
        } catch (Exception e){
            System.out.println("Error:  " + e);
        }
    }
}