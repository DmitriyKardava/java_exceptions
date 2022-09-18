/*
4) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. В
ажно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
import java.util.Arrays;

public class lesson1_4 {
    public static void main(String[] args){
        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        int[] arr2 = new int[]{6, 7, 8, 0, 9};
        System.out.println(Arrays.toString(arraysDiv(arr1, arr2)));
    }
    public static double[] arraysDiv(int arr1[], int arr2[]){
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Array sizes don't match");
        }
        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            if ( arr2[i] == 0) {
                throw  new RuntimeException("Division by zero");
            }
            result[i] = (double) arr1[i] / arr2[i];
        }
        return result;
    }
}
