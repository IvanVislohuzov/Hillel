package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan
 */
public class PhoneOne extends AndroidPhone {
    public PhoneOne(double screenSize, double bodysize){
        setScreenSize(screenSize);
        setBodySize(bodysize);
    }

    /**
     * write sms
     */
    @Override
    public void writeSms(String sms) {
        System.out.println("PhoneOne"+sms);
    }

    /**
     * make call
     */
    @Override
    public void makeCall(String conversation) {
        System.out.println("PhoneOne"+conversation);
    }

    /**
     * get information
     */
    public  void getInformation(){
        System.out.println("PhoneOne");
        System.out.println("screen size - "+getScreenSize());
        System.out.println("body size - "+ getBodySize());
        System.out.println("version "+getOperatingSystem().getNameOperatingSystem()+" "+getOperatingSystem().getVersion());
    }
}
