/*
* 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/

public class lesson1_1 {
    public static void main(String[] args) {
        NullPointerExample();
        StringIndexOutOfBoundExample();
        ClassNotFoundExample();
    }

    public static void NullPointerExample() {
        try{
            String st = null;
            System.out.println(st.charAt(0));
        }
        catch (NullPointerException e){
            System.err.println(e);
        }
    }

    public static void StringIndexOutOfBoundExample() {
        try {
        String st = "*****";
        char c = st.charAt(7);
        System.out.println(c);
    }
        catch (StringIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }

    public static void ClassNotFoundExample() {
        try{
            Class.forName("Class1");
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
        }
    }
}

