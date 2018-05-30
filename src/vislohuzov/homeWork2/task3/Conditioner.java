package vislohuzov.homeWork2.task3;

/**
 * Created by Ivan
 */
public class Conditioner {
    /**
     * temperature conditioner
     */
    private Integer temperature;
    /**
     * on off conditioner
     */
    private Boolean isActive;

    /**
     * get temperature conditioner
     */
    public Integer getTemperature() {
        return temperature;
    }

    /**
     * set temperature conditioner
     */
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    /**
     * get on off conditioner
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * get on off conditioner
     */
    public void setActive(Boolean active) {
        isActive = active;
    }
}
