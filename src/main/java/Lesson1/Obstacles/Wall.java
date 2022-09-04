package Lesson1.Obstacles;

import Lesson1.Teamrace.Jumpable;
import Lesson1.Teamrace.People;

public class Wall implements Let {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean doIt(People people) {
        if (people instanceof Jumpable)
            return ((Jumpable) people).jump(height);
        else
            return false;
    }

    public float getHeight() {
        return height;
    }
}