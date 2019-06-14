package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_4;

class Resumer {
    static int amountOfExceptions = 5;

    void goThroughExeptions() throws MyException {
        if (amountOfExceptions-- > 0)
            throw new MyException();
    }
}

class MyException extends Exception {
}