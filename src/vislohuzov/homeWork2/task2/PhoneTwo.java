package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan on 30.05.2018.
 */
public class PhoneTwo extends IPhone{
    public PhoneTwo(double screenSize, double bodysize){
        setScreenSize(screenSize);
        setBodySize(bodysize);
    }

    /**
     * write sms
     */
    @Override
    public void writeSms(String sms) {
        System.out.println("PhoneTwo"+sms);
    }

    /**
     * make conversation
     */
    @Override
    public void makeCall(String conversation) {
        System.out.println("PhoneTwo"+conversation);
    }

    /**
     * get information
     */

    public  void getInformation(){
        System.out.println("PhoneTwo");
        System.out.println("screen size - "+getScreenSize());
        System.out.println("body size - "+ getBodySize());
        System.out.println("version "+getOperatingSystem().getNameOperatingSystem()+" "+getOperatingSystem().getVersion());
    }
}
