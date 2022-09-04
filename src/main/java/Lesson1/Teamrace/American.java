package Lesson1.Teamrace;

public class American  extends People implements Jumpable {
    private final String name;
    private float jump_limit;

    public American(String name) {
        this.name = name;
        this.run_limit = String.valueOf(100);
        jump_limit = 10f;
    }

    @Override
    public String voice() {
        return "I definitely won't lose";
    }

    @Override
    public int getSwimLimit() {
        return 0;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }

    @Override
    public float getJumpLimit() {
        return 0;
    }
}