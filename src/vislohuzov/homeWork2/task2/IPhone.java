package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan
 */
public abstract class IPhone extends Phone {
    /**
     * operating System
     */
    private OperatingSystem operatingSystem = new OperatingSystem("IOS", 1.0);

    @Override
    public abstract void writeSms(String sms);

    @Override
    public abstract void makeCall(String conversation);

    /**
     * install operating System
     */
    @Override
    public void inslallOS(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * get operating System
     */
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
}
