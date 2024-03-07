package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(bird);

        flyAnimal(bird);

    }
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }
    private static void flyAnimal(AbstractAnimal animal){
        System.out.println("동물 비행 시작");
        animal.move();
        System.out.println("동물 비행 종료");
    }
}
