//package ru.geekBrains.lesson0712;
//
//import java.util.Random;
//import java.util.Scanner;
////    1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
////    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
////    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
//
//public class lesson0712 {
//    public static void main(String[] args) {
//        guessTheNumber();
//    }
//
//    public static void guessTheNumber() {
//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//        int x;
//        int a;
//        int b;
//        do {
//            System.out.println("введите число от 0 до 9");
//            x = rand.nextInt(10);
//            int i = 0;
//            do {
//                a = scan.nextInt();
//                if (x > a) {
//                    System.out.println("Заданное число больше вашего");
//                } else if (x < a) {
//                    System.out.println("Заданное число меньше вашего");
//                } else if (x == a) {
//                    System.out.println("Вы угадали");
//                    break;
//                }
//                i++;
//            } while (i < 3);
//            System.out.println("Загаданное число было = " + x);
//            System.out.println("если вы хотите повторить игру нажмите 1 если нет нажмите 0");
//            b = scan.nextInt();
//        } while (b == 1);
//    }
//    public static void guessTheWord() {
//        String[] words = {"apple", "apricot", "avocado", "banana", "broccoli", "carrot",
//                "cherry", "garlic", "grape", "kiwi", "leak", "lemon", "mango", "melon", "mushroom", "nut",
//                "olive", "orange", "pea", "peanut", "pear", "pepper", "pineapple", "potato", "pumpkin"};
//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//        int x;
//        int a;
//        int b;
//        do {
//            System.out.println("введите число от 0 до 9");
//            x = rand.nextInt(25);
//            String conc = words[x];
//            int i = 0;
//            do {
//                String input = scan.nextLine();
//                if (input.charAt(i) == conc.charAt(i)) {
//                    String output = output + conc.charAt(i);
//                } else if (x < a) {
//                    System.out.println("Заданное число меньше вашего");
//                } else if (x == a) {
//                    System.out.println("Вы угадали");
//                    break;
//                }
//                i++;
//            } while (i < conc.length());
//            System.out.println("Загаданное число было = " + x);
//            System.out.println("если вы хотите повторить игру нажмите 1 если нет нажмите 0");
//            b = scan.nextInt();
//        } while (b == 1);
//    }
//}
