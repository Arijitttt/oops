package polymorphism.function_overriding;
//dynamic polymorphism
//function overriding
class animal{
    public void sound(){
        System.out.println("animal makes a sound");
    }
}
class Dog extends animal{
    public void sound(){
        System.out.println("dog makes a sound");
    }
}
class Cat extends animal{
    public void sound(){
        System.out.println("cat makes a sound");
    }
}
public class runtime_polymorphism {
    public static void main(String[] args) {
        animal myDog = new Dog();
        animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
    
}
