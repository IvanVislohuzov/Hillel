package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan
 */
public abstract class Phone {
    /**
     * screen Size
     */
    private double screenSize;
    /**
     * body Size
     */
    private double bodySize;

    /**
     * write sms
     */
    public abstract void writeSms(String sms);

    /**
     * make call
     */
    public abstract void makeCall(String conversation);

    /**
     * get screen Size
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     * get screen Size
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * get body Size
     */
    public double getBodySize() {
        return bodySize;
    }

    /**
     * set body Size
     */
    public void setBodySize(double bodySize) {
        this.bodySize = bodySize;
    }

    /**
     * install operating system
     */
    public abstract void inslallOS(OperatingSystem operatingSystem);

    }
