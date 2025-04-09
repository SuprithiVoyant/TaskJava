package designpatterns.adapterpattern;

public class Computer {
    public void readDataFromUSB(USB usb){
        System.out.println(usb.connectWithUsb());
    }
}
