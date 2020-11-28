package ru.geekBrains.lesson2311;

public class lesson2311 {
    public static void main (String[] args) {
        System.out.println(calculation(5,6,7,8));
        System.out.println(calculation(10,50,60,80));
        System.out.println(task4(3,6));
        task5(5);
        System.out.println(task6(6));
        task7("NWP");
        task8(1900);
        byte a = 0;
        short b = 10000;
        int c = 500;
        long d = -560;
        float e = 23.11f;
        double f = 56.22;
        char g = '\u2242';
        boolean h = true;
    }

    public static float calculation (float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }
    public static boolean task4 (long v, long m) {
        if ((v + m) > 10 && (v + m) < 20) {
            return true;
        }
        else return false;
    }
    public static void task5 (long l) {
        if (l < 0) {
             System.out.println("отрицательное число");
        }
        else  {
             System.out.println("положительное число");
        }
    }
    public static boolean task6 (int y) {
        if (y < 0) {
            return true;
        }
        else return false;
    }
    public static void task7 (String name) {
        System.out.println("Привет, "+ name + "!");
    }
    public static void task8 (long x) {
        if (x % 4 != 0) {
            System.out.println("високосный");
        }
        else if (x % 400 == 0) {
            System.out.println("високосный");
        }
        else if (x % 100 ==0) {
            System.out.println("не високосный");
        }
    }

}
