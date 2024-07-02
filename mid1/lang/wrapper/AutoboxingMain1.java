package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //primitive to wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //wrapper to primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
