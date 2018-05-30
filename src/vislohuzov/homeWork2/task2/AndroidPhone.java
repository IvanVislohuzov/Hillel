package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan
 */
public abstract class AndroidPhone extends Phone {
    /**
     * operatingSystem
     */
    private OperatingSystem operatingSystem=new OperatingSystem("Android",1.0);

    @Override
    public abstract void writeSms(String sms);

    @Override
    public abstract void makeCall(String conversation);

    /**
     * instal operating System
     */
    @Override
    public void inslallOS(OperatingSystem operatingSystem){
        this.operatingSystem=operatingSystem;
    }

    /**
     * get operating System
     */
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * set operating System
     */
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
