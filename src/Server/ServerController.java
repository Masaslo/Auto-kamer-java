package Server;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

public class ServerController {

    public static String MQTT_HOST = "tcp://mqtt.hva-robots.nl:1883";
    public static String MQTT_CLIENT_ID = "javaClass";
    public static String MQTT_USERNAME = "boersfm";
    public static String MQTT_PASSWORD = "P6Kv9Kakc5VcGPBu6FVr";
    public static String Topic = "boersfm/#";
    public final String[] Topics = {"boersfm/on", "boersfm/restart/robot"};


    public ServerController(){
        MqttClient client;
        MqttConnectOptions options;




    }
}
