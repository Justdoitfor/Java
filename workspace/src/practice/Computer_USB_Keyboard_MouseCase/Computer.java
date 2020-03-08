package practice.Computer_USB_Keyboard_MouseCase;


public class Computer {
    public void powerOn() {
        System.out.println("电脑已打开！");
    }

    public void powerOff() {
        System.out.println("电脑已关闭！");
    }

    public void useDevice(USB usb, boolean status) { // status 代表进行的操作，true 为连接； false 为断开
        if (status == true) {
            usb.turnOn();
        }

        if (status == false) {
            usb.turnOff();
        }
    }

}
