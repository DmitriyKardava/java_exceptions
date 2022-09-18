/*
3) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

import java.util.Arrays;

public class lesson1_3 {
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 100);
            arr2[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arraysDiff(arr1, arr2)));
        System.out.println(Arrays.toString(arraysDiff(arr1, arr3)));
    }
    public static int[] arraysDiff(int arr1[], int arr2[]){
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Array sizes don't match");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
