package ru.geekBrains.lesson1101;

public class Dog extends Animal {

    private static final int DOG_MAX_RUN_DISTANCE = 500;
    private static final int DOG_MAX_JUMP_HEIGHT = 1;
    private static final int DOG_MAX_SWIM_DISTANCE = 500;



    public Dog(int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        super(maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    public Dog() {
        this(DOG_MAX_RUN_DISTANCE, DOG_MAX_JUMP_HEIGHT, DOG_MAX_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int runDistance) {
        if (this.maxRunDistance >= runDistance) {
            System.out.printf("Собака пробежала дистанцию, %d. Max = %d%n", runDistance, maxRunDistance);
            return true;
        }
        System.out.printf("Собака не смогла пробежать дистанцию, %d. Max = %d%n", runDistance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int swimDistance) {
        if (this.maxSwimDistance >= swimDistance) {
            System.out.printf("Собака переплыла дистанцию, %d. Max = %d%n", swimDistance, maxSwimDistance);
            return true;
        }
        System.out.printf("Собака не смогла переплыть дистанцию, %d. Max = %d%n", swimDistance, maxSwimDistance);
        return false;
    }

    @Override
    public boolean jump(int jumpHeight) {
        if (this.maxJumpHeight >= jumpHeight) {
            System.out.printf("Собака переперепрыгнула, %d. Max = %d%n", jumpHeight, maxJumpHeight);
            return true;
        }
        System.out.printf("Собака не смогла перепрыгнуть, %d. Max = %d%n", jumpHeight, maxJumpHeight);
        return false;
    }

}
