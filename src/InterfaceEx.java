
interface PhoneInterface{ //인터페이스 선언
    public static final int TIMEOUT = 10000; //인터페이스 내에 상수 필드 선언 가능
    //public static 생략 가능
    void sendCall(); // 인터페이스 내에 추상 메서드 선언
    //public abstract 생략가능
    void receiveCall();
    default void printLogo(){ //public 생략 가능
        System.out.println("** Phone **");  
    } // 인터페이스 내에 생성된 디폴트 메서드
}
interface MobilePhoneInerface extends PhoneInterface{
    void sendSMS(); // 인터페이스 내에 추상 메서드 선언
    //public abstract 생략가능
    void receiveSMS();
    //public abstract 생략가능
}

class PDA{
    public int calculate(int x, int y){
        return x + y;
    }
}
interface MP3Inerface{
    public void play(); // 추상메서드 (abstract 생략)
    public void stop();
}

// SmartPhone 클래스는 PDA를 상속받고, MobilePhoneInterface와 MP3Inerface를 구현한다.
class SmartPhone extends PDA implements MobilePhoneInerface, MP3Inerface{   // 인터페이스 다중 구현
    // 인터페이스에 있는 추상메서드 재정의
    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요~~");
    }

    @Override
    public void sendSMS() {
        System.out.println("자니...?");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자 왔슈 (꺼져)");
    }

    @Override
    public void play() {
        System.out.println("start music");
    }

    @Override
    public void stop() {
        System.out.println("음악 멈춰!!!");
    }
    //추가로 smartPhone 클래스의 메서드 작성
    public void schedule(){
        System.out.println("난 니가 지난 여름에 한일을 알고 있다.");
    }
}
class SamsungPhone implements  PhoneInterface{ //인터페이스 구현
//PhoneInterface의 모든 추상 메서드 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다");
    }

    //삼성퐆ㄴ만의 메서드 작성
    public void flash(){
        System.out.println("전화기에 불이 들어와유");
}

}
public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();

        SmartPhone sPhone = new SmartPhone();
        sPhone.printLogo();
        sPhone.sendCall();
        sPhone.play();
        sPhone.stop();
        System.out.println("3과 5를 더하면: " + sPhone.calculate(3,5));
        sPhone.schedule();
    }
}
