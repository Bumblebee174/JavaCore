package Lesson1.Teamrace;

public abstract class People {
    public String run_limit;
    boolean passing;

    public People(String jon) {
    }

    public People() {

    }

    public String toString() {
        String name = "";
        return this.getClass().getName() + " " + name;
    }

    public void setPassing(boolean passing) {
        this.passing = passing;
    }

    public abstract String voice();

    public boolean run(int length) {
        return false;
    }

    public abstract int getSwimLimit();
}