package Lesson_2.Exceptions;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
    }

}