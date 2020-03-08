package practice.Computer_USB_Keyboard_MouseCase;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();  // 创建一个computer对象
        computer.powerOn();  // computer开机
        USB mouse = new Mouse(); // 创建一个mouse对象
        USB keyboard = new Keyboard(); // 创建一个keyboard对象
        computer.useDevice(mouse,true);  // 使用鼠标
        computer.useDevice(keyboard,true);  // 使用键盘
        computer.useDevice(mouse,false);  // 断开鼠标
        computer.useDevice(keyboard,false);  // 断开键盘
        computer.powerOff();  // computer关机

    }
}
