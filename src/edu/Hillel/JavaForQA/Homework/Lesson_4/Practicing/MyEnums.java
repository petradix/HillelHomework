package edu.Hillel.JavaForQA.Homework.Lesson_4.Practicing;

public class MyEnums {
    public static final int low = 0;
     public static final int medium = 1;
     public static final int high = 2;

    public static void main(String[] args) {
        if (0 == MyEnums.high){
            System.out.println("First is " + YoureLevels.JUNIOR.value);
        }

        if (1 == YoureLevels.MIDDLE.value){
            System.out.println("Second is " + YoureLevels.MIDDLE.name());
        }

        for (YoureLevels levels: YoureLevels.values()){
            System.out.println(levels.ordinal());

        }
    }
}


 enum YoureLevels {
    JUNIOR(0),
     MIDDLE(1),
    SENIOR(2);

    public int value;

     YoureLevels(int value) {
         this.value = value;
     }
 }
