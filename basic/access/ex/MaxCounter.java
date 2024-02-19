package access.ex;

public class MaxCounter {
    private int count;
    private int max;
    MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(count<max){
            count++;
            System.out.println("숫자 1 증가");
        }
        else
            System.out.println("최대값입니다.");
    }

    public int getCount(){
        return this.count;
    }
}