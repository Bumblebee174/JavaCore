package Lesson1.Teamrace;

public class Russian extends People implements Jumpable, Swimable {
    private final int RUN_LIMIT = 100;
    private final int SWIM_LIMIT = 100;
    private final float JUMP_LIMIT = 3.8f;
    private final String name;
    private People thispublic;
    private int swim_limit;
    private float jump_limit;

    public Russian(String name) {
        this.name = name;
        thispublic .run_limit = String.valueOf(RUN_LIMIT);
        swim_limit = SWIM_LIMIT;
        jump_limit = JUMP_LIMIT;
    }

    public Russian(String name, int run_limit, People thispublic, int swim_limit, float jump_limit) {
        super();
        this.thispublic = null;
        this.thispublic = thispublic;
        this.name = name;
        this.run_limit = String.valueOf(run_limit);
        this.swim_limit = swim_limit;
        this.jump_limit = jump_limit;
    }


    @Override
    public String voice() {
        return "Я выйграю";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }

    @Override
    public int getSwimLimit() {
        return swim_limit;
    }

    @Override
    public float getJumpLimit() {
        return jump_limit;
    }
}