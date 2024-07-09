abstract class animal{
    public abstract void sound();

    public void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends animal{
    public void sound(){
        System.out.println("dog is barking");
    }
}
public class abstraction_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
