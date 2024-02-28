package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){
        //인스턴스 생성 방지
    }
    public static int sum(int[] values) {
        int sum = 0;
        for(int value : values)
            sum += value;
        return sum;
    }
    /*
    public static float average(int[] values) {
        float average = 0;
        for(int value : values)
            average += value;
        average /= values.length;
        return average;
    }
    */

    public static float average(int[] values) {
        return (float) sum(values)/values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int value : values)
            if(value<min)
                min = value;
        return min;
    }
    public static int max(int[] values) {
        int max = values[0];
        for(int value : values)
            if(value>max)
                max = value;
        return max;
    }

}
