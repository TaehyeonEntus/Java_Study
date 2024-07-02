package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //primitive to wrapper
        int value = 7;
        Integer boxedValue = value; //autoboxing

        //wrapper to primitive
        int unboxedValue = boxedValue; //unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
