/*
* Если необходимо, исправьте данный код (задание 2)
* */
public class lesson2_2 {
    public static void main (String[] args){
        try {
            int d = 0;
            int intArray[] = new int[9];
            intArray[8] = 8;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
