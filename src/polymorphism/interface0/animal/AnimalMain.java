package polymorphism.interface0.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        sound(dog);
        sound(cat);

        move(cat);
        move(dog);
    }

    // 매개변수로 Animal 인터페이스를 받는다.
    // 인터페이스를 구현한 클래스들을 다형적 매개변수로 받을 수 있다.
    static void sound(Animal animal) {
        animal.sound();
    }

    static void move(Animal animal) {
        animal.move();
    }

}