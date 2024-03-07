package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();   //추상 메서드는 바디가 없음
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
