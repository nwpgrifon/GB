package ru.geekBrains.lesson2611;

public class lesson2611 {
    public static void main (String[] args) {
//        replaceZeroToOneAndInReverse();
//        fillArray();
//        ifLessThanSixThanMultiplyByTwo();
//        squareArrayWithOnes();
//        findMinAndMax();
        System.out.println(checkBalance());

    }
    public static void replaceZeroToOneAndInReverse () {
        int [] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else arr[i] = 1;
            System.out.println(arr[i]);
        }
    }
    public static void fillArray () {
        int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.println(arr[i]);
        }
    }
    public static void ifLessThanSixThanMultiplyByTwo (){
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
    public static void squareArrayWithOnes () {
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) == (arr.length - 1)) {
                    arr[i][j] = 1;
                }
                System.out.println(arr[i][j]);
            }
        }
    }
//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void findMinAndMax () {
        int [] arr = { 1, 1, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

//     6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//     если в массиве есть место, в котором сумма левой и правой части массива равны.
//     Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance () {
        double[] arr = {2, 3, 2, 3};
        double Sum = 0;
        double firstHalf = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum = Sum + arr[i];
            firstHalf = firstHalf + arr[i]/2;
        }

        System.out.println(Sum);
        System.out.println(firstHalf);
        return true;
    }
}
