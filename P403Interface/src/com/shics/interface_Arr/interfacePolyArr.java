package com.shics.interface_Arr;

public class interfacePolyArr {
    public static void main(String[] args) {
        // 多态数组
        Usb[] usbs = new Usb[2];

        usbs[0] = new Phone();
        usbs[1] = new Camera();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();

            if (usbs[i] instanceof Phone) {
                ((Phone) usbs[i]).call();
            }
        }
    }
}

interface Usb{
    void work();
}

class Phone implements Usb {
    public void call() {
        System.out.println("phone is call");
    }


    @Override
    public void work() {
        System.out.println("phone is work");
    }
}
class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("camera is work");
    }
}
