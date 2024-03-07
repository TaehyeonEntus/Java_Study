package poly.ex6;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("애옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
