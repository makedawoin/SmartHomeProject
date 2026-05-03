final class SecuritySystem {
    void arm() {
        System.out.println("Security system is now ACTIVE.");
    }
}
class Device {
    protected String name;

    Device(String name) {
        this.name = name;
    }

    static void category(){
        System.out.println("Category: General Home Device");
    }

    void turnOn() {
        System.out.println("Starting the " + name + "");
    }

    final void powerInfo() {
        System.out.println("Power: 220V Standard");
    }
}

class Lamp extends Device {
    int brightness;

    Lamp(String n, int b) {
        super(n);
        this.brightness = b;
    }
    void turnOn() {
        super.turnOn();
        System.out.println("Brightness is set to " + brightness + "%");
    }
}
class KitchenAppliance extends Device {
    KitchenAppliance(String n) { super(n); }
}

class SmartFridge extends KitchenAppliance {
    SmartFridge(String n) { super(n); }
}
class Fan extends Device {
    Fan(String n) { super(n); }
}
public class SmartHomeProject {
    public static void main(String[] args) {

        System.out.println("Mini Project 2");
        Lamp myLamp = new Lamp("Desk Lamp", 90);
        myLamp.turnOn();

        SmartFridge fridge = new SmartFridge("Smart Fridge");
        fridge.turnOn();

        SecuritySystem alarm = new SecuritySystem();
        alarm.arm();
    }
}