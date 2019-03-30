package TryCatchThrows;

public class Main {
    public static void main(String[] args) {
        TryCatch example = new TryCatch("Success", 0);
        try {
            example.divide();
            example.printName();
        } catch (Exception e) {
            System.out.println("Failed");
        }
    }
}
