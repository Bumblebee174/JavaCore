package Lesson1.Obstacles;

import Lesson1.Teamrace.People;
import Lesson1.Teamrace.Swimable;

public class Water implements Let {
    private int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(People people) {
        if (people instanceof Swimable)
            return ((Swimable) people).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}