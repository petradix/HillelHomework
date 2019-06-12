package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_4;

class ResumerException extends Exception {}

class Resumer {
    static int count = 3;
    void f() throws ResumerException {
        if(--count > 0)
            throw new ResumerException();
    }
}
