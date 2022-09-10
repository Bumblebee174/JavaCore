package Lesson1.Obstacles;

import Lesson1.Teamrace.People;

public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(People people) {
        return people.run(length);
    }
    public int getLength(){
        return length;
    }
}