import java.util.Scanner;

public class lesson2_4 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        System.out.println(readString());
    }
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        if(myString.isEmpty())
            throw new IllegalArgumentException("Введена пустая строка.");
        return myString;
    }
}
