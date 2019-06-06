package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_1_2;

public enum EnumWithIntegers {
    INT_1(111),
    INT_2(211),
    INT_3(311),
    INT_4(411),
    INT_5(511),
    INT_6(611),
    INT_7(711),
    INT_8(811),
    INT_9(911),
    INT_10(1011),
    INT_11(1111),
    INT_12(1211),
    INT_13(1311),
    INT_14(1411),
    INT_15(1511),
    INT_16(1611),
    INT_17(1711),
    INT_18(1811),
    INT_19(1911),
    INT_20(2011),
    INT_21(2111),
    INT_22(2211),
    INT_23(2311),
    INT_24(2411),
    INT_25(2511),
    INT_26(2611),
    INT_27(2711),
    INT_28(2811),
    INT_29(2911),
    INT_30(3011);

   public int myValue;

    EnumWithIntegers(int value) {
        this.myValue = value;
    }


    public int getMyValue() {
        return myValue;
    }


}
