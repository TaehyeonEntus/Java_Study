package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] parts = email.split("@");
        String ID = parts[0];
        String domain = parts[1];

        System.out.println("ID: " + ID);
        System.out.println("domain: " + domain);
    }
}
