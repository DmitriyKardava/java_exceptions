/*
* 2) Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
* public static int sum2d(String[][] arr) {
int sum = 0;
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < 5; j++) {
int val = Integer.parseInt(arr[i][j]);
sum += val;
}
}
return sum;
}
* */
public class lesson1_2 {
    public static void main(String[] args) {
        /*
        * Array index out of bounds
        * */
        try {
            String[][] arr1 = new String[1][1];
            arr1[1][1] = "1";
            System.out.println(sum2d(arr1));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        /*
        * Number format exception
        * */
        try {
            String[][] arr2 = new String[2][5];
            arr2[0][0] = "a";
            System.out.println(sum2d(arr2));
        }
        catch(NumberFormatException e) {
            System.err.println(e);
        }
        /*
        * Negative array size exception
        * */
        try {
            String[][] arr2 = new String[-2][-5];
            arr2[0][0] = "-1";
            System.out.println(sum2d(arr2));
        }
        catch(NegativeArraySizeException e) {
            System.err.println(e);
        }

        /*
        * Out of memory error
        * */
        try {
            String[][] arr3 = new String[99999][99999];
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3[i].length; j++) {
                    arr3[i][j] = "2147483647";
                }
            }
            System.out.println(sum2d(arr3));
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
