package com.wrapperExercise01;

public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); // F

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4); // F

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6); // T

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8); // F

        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10); // F

        Integer i11 = 127;
        int i12 = 127;
        System.out.println(i11 == i12); // int 类型对比的是值 T

        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14); // T
    }
}
