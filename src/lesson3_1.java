import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.*;

public class lesson3_1 {
    public static void main(String[] args) {
        System.out.print("Введите строку для разбора: ");
        Scanner scanner = new Scanner(System.in);
        String[] inData = scanner.nextLine().split("\\s+");
        if (inData.length != 6) {
            System.err.println("Строка должна состоять из 6 полей, введено "+ inData.length + " полей");
            System.exit(-1);
        }
        try {
            Date birthday = getBirthday(inData[3]);
        }
        catch (ParseException e) {
            System.err.println("Неправильно введена дата рождения " + inData[3]);
            System.exit(-3);
        }
        try {
            int phoneNum = getPhoneNum(inData[4]);
        }
        catch(NumberFormatException e){
            System.err.println("Неправильно введён телефон "+ inData[4]);
            System.exit(-4);
        }
        try {
            String gender = getGender(inData[5]);
        }
        catch (InvalidGenderException e) {
            System.err.println("Неправильно определён пол " + inData[5]);
            System.exit(-5);
        }

        try(FileWriter writer = new FileWriter(inData[0], true))
        {
            StringBuilder outData = new StringBuilder();
            for (String inDatum : inData) {
                outData.append("<").append(inDatum).append(">");
            }
            writer.write(outData.toString());
            writer.write(System.lineSeparator());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String getGender(String st) throws InvalidGenderException {
        if (!st.equals("m") & !st.equals("f")) {
            throw new InvalidGenderException();
        }
        return st;
    }
    public static Date getBirthday(String st) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.parse(st);
    }
    public static Integer getPhoneNum(String st) throws NumberFormatException {
        return Integer.parseInt(st);
    }
}
class  InvalidGenderException extends Exception {

}