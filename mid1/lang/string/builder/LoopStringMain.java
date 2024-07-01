package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Java");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("걸린 시간: " + (endTime - startTime) + "ms");
    }
}
