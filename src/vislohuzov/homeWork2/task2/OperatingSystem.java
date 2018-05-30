package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan
 */
public class OperatingSystem {
    /**
     * version
     */
    private double version;
    /**
     * name operating system
     */
    private  String nameOperatingSystem;
    public OperatingSystem(String nameOperatingSystem,double version){
        this.nameOperatingSystem=nameOperatingSystem;
        this.version=version;
    }

    /**
     * get version
     */
    public double getVersion() {
        return version;
    }

    /**
     * get name operating system
     */
    public String getNameOperatingSystem() {
        return nameOperatingSystem;
    }

}
