package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_1_2;

public enum BaseIntegers {
    INT_1(1),
    INT_2(2),
    INT_3(3),
    INT_4(4),
    INT_5(5),
    INT_6(6),
    INT_7(7),
    INT_8(8),
    INT_9(9),
    INT_10(10),
    INT_11(11),
    INT_12(12),
    INT_13(13),
    INT_14(14),
    INT_15(15),
    INT_16(16),
    INT_17(17),
    INT_18(18),
    INT_19(19),
    INT_20(20);
//    INT_21,
//    INT_22,
//    INT_23,
//    INT_24,
//    INT_25,
//    INT_26,
//    INT_27,
//    INT_28,
//    INT_29,
//    INT_30;

   public int myValue;

    BaseIntegers(int value) {
        this.myValue = value;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue(int i) {
        return myValue;
    }
}
