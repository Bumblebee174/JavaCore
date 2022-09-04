package Lesson1.Teamrace;

public class Frenchy extends People implements Swimable {
    private final String name;
    private int swim_limit;

    public Frenchy(String name) {
        this.name = name;
        this.run_limit = String.valueOf(50);
        swim_limit = 200;
    }

    @Override
    public String voice() {
        return "I am the strongest";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public int getSwimLimit() {
        return 0;
    }
}