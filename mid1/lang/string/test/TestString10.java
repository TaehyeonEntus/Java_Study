package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,kiwi,orange";
        String[] fruitArray = fruits.split(",");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->",fruitArray);
        System.out.println("joinedString = " + joinedString);
    }
}
