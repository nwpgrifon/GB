package ru.geekBrains.lesson1101;

public class Cat extends Animal {

    private static final int CAT_MAX_RUN_DISTANCE = 500;
    private static final int CAT_MAX_JUMP_HEIGHT = 1;
    private static final int CAT_MAX_SWIM_DISTANCE = 500;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight, CAT_MAX_SWIM_DISTANCE);

    }
    public Cat() {
        super(CAT_MAX_RUN_DISTANCE, CAT_MAX_JUMP_HEIGHT, CAT_MAX_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int runDistance) {
        if (this.maxRunDistance >= runDistance) {
            System.out.printf("Кот пробежал дистанцию, %d. Max = %d%n", runDistance, maxRunDistance);
            return true;
        }
        System.out.printf("Кот пробежал дистанцию, %d. Max = %d%n", runDistance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int swimDistance) {
            System.out.println("Кот не плавает");
            return false;
        }

    @Override
    public boolean jump(int jumpHeight) {
        if (this.maxJumpHeight >= jumpHeight) {
            System.out.printf("Кот перепрыгнул, %d. Max = %d%n", jumpHeight, maxJumpHeight);
            return true;
        }
        System.out.printf("Кот не перепрыгнул, %d. Max = %d%n", jumpHeight, maxJumpHeight);
        return false;
    }

}
