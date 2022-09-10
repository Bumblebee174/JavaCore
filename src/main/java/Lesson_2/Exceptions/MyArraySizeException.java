package Lesson_2.Exceptions;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String msg) {
        super("Ошибка размерности массива.\n" + " " + msg);
    }

}