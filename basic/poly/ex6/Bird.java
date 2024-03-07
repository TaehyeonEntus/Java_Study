package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오 스껄");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
