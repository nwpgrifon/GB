package ru.geekBrains.lesson1101;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина,
//          означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
//        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
//        6. ** Добавить подсчет созданных котов, собак и животных.

public abstract class Animal {

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    public Animal(int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public abstract boolean run (int runDistance);
    public abstract boolean swim (int swimDistance);
    public abstract boolean jump (int jumpHeight);

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                ", maxSwimDistance=" + maxSwimDistance +
                '}';
    }
}
