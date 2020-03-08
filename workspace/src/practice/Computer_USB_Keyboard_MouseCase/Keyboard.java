package practice.Computer_USB_Keyboard_MouseCase;

public class Keyboard implements USB{
    @Override
    public void turnOn() {
        System.out.println("键盘已连接！");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘已断开！");
    }
}
