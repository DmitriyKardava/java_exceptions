/*
* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
* и возвращает введенное значение.
* Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
* необходимо повторно запросить у пользователя ввод данных.
* */
import java.util.InputMismatchException;
import java.util.Scanner;
public class lesson2_1 {
    public static void main(String[] args){
        System.out.println(readFloat());
    }

    public static float readFloat() {
        Scanner scanner = new Scanner(System.in);
        float numFloat = 0;
        while (true) {
            try {
                System.out.println("Введите число: ");
                numFloat = scanner.nextFloat();
                return numFloat;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод");
                scanner.next();
            }
        }
    }
}

