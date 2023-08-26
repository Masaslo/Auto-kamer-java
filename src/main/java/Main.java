//import Server.ServerController;
//import org.eclipse.paho.client.mqttv3.MqttException;

import Server.TestClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("initializing MQTT connection");
        try{
            TestClass serverTest = new TestClass();
            System.out.println("initialized");
        } catch (Exception e){
            System.out.println("Error:  " + e);
        }
    }
}