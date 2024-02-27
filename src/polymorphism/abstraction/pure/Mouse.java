package polymorphism.abstraction.pure;

public class Mouse extends Animal {


    @Override
    public void sound() {
        System.out.println("찍찍");
    }

    @Override
    public void move() {
        System.out.println("쥐가 요리조리 움직입니다.");
    }
}
