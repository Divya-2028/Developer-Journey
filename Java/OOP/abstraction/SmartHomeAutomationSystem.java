package abstraction;
interface Switchable{
     void turnOn();
     void turnOff();
}
interface Connectable{
     void connect();
     void disconnect();
}
interface MusicPlayable{
     void playMusic();
     void stopMusic();
}
class Light implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Light turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off.");
    }
}
class Fan implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Fan turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off.");
    }
}
class AC implements Switchable,Connectable{
    @Override
    public void turnOn() {
        System.out.println("AC turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC turned off.");
    }

    @Override
    public void connect() {
        System.out.println("AC connected to Wi-Fi.");
    }

    @Override
    public void disconnect() {
        System.out.println("AC disconnected from Wi-Fi.");
    }
}
class SmartSpeaker implements Switchable,Connectable,MusicPlayable{
    @Override
    public void turnOn() {
        System.out.println("Speaker turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker turned off.");
    }

    @Override
    public void connect() {
        System.out.println("Speaker connected via Bluetooth.");
    }

    @Override
    public void disconnect() {
        System.out.println("Speaker disconnected from Bluetooth.");
    }

    @Override
    public void playMusic() {
        System.out.println("Music playing.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}
public class SmartHomeAutomationSystem {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switchable fan = new Fan();
        Switchable ac = new AC();
        Switchable speaker = new SmartSpeaker();

        Connectable wifiAC = (Connectable) ac;
        Connectable bluetoothSpeaker = (Connectable) speaker;

        MusicPlayable music = (MusicPlayable) speaker;

        System.out.println("\n----- Light -----");
        light.turnOn();
        light.turnOff();

        System.out.println("\n----- Fan -----");
        fan.turnOn();
        fan.turnOff();

        System.out.println("\n----- AC -----");
        ac.turnOn();
        wifiAC.connect();
        wifiAC.disconnect();
        ac.turnOff();

        System.out.println("\n----- Smart Speaker -----");
        speaker.turnOn();
        bluetoothSpeaker.connect();
        music.playMusic();
        music.stopMusic();
        bluetoothSpeaker.disconnect();
        speaker.turnOff();

        System.out.println("\nSmart Home Automation Demo Completed.");
    }
}
