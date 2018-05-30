package vislohuzov.homeWork2.task3;

/**
 * Created by Ivan
 */
public class Engine {
    /**
     * power engine
     */
    private Integer power;
    /**
     * capacity engine
     */
    private Double capacity;
    /**
     * on off engine
     */
    private Boolean isActive;

    public Engine(Integer power, Double capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    /**
     * get active engine
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * set active engine
     */
    public void setActive(Boolean active) {
        isActive = active;
    }
}
