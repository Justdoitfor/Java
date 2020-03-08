package practice.Computer_USB_Keyboard_MouseCase;

public class Mouse implements USB{
    @Override
    public void turnOn() {
        System.out.println("鼠标已连接！");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标已断开！");
    }
}
