package Bridge;


public class SmartRemote extends BasicRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl() {
        System.out.println("Voice control activated on SmartRemote");
    }
}