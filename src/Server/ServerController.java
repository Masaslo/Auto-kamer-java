package Server;

import org.eclipse.paho.client.mqttv3.*;

public class ServerController {

    public static String MQTT_HOST = "tcp://mqtt.hva-robots.nl:1883";
    public static String MQTT_CLIENT_ID = "javaClass";
    public static String MQTT_USERNAME = "boersfm";
    public static String MQTT_PASSWORD = "P6Kv9Kakc5VcGPBu6FVr";
    public static String Topic = "boersfm/thuis";

    MqttClient client;
    MqttConnectOptions options;

    public ServerController() throws MqttException {

        client = new MqttClient(MQTT_HOST, MQTT_CLIENT_ID);
        options = new MqttConnectOptions();
        options.setUserName(MQTT_USERNAME);
        options.setPassword(MQTT_PASSWORD.toCharArray());
        client.connect(options);

        //check if client connected
        if(client.isConnected()) {
            System.out.printf("Connect mqtt to: %s\n", MQTT_HOST);
        }
        //do things based on the callback
        client.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable throwable) {
                System.out.println("connection lost");
            }

            @Override
            public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
                checkMessage(topic, mqttMessage);
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

            }
        });

        client.subscribe(Topic);
    }

    public void checkMessage(String topic, MqttMessage mqttMessage){
        String messageString = mqttMessage.toString();
        System.out.println(messageString);
    }
}
