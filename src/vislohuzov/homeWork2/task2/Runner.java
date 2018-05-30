package vislohuzov.homeWork2.task2;

/**
 * Created by Ivan
 */
public class Runner {
    public static void main(String[] args) {
        PhoneOne phoneOne=new PhoneOne(3.2,2.2);
        phoneOne.getInformation();
        phoneOne.makeCall("hello someone");
        phoneOne.writeSms("hello");

        PhoneTwo phoneTwo=new PhoneTwo(3.2,2.2);
        phoneTwo.getInformation();
        phoneTwo.makeCall("hi someone");
        phoneTwo.writeSms("hi");
    }
}
