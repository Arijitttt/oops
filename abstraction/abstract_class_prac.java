package abstraction;
abstract class Base{
    public void fun(){
        System.out.println("cat");
    }
    abstract void display();
}
class Derived1 extends Base{
    void display(){};
}
class Derived2 extends Base{
    void display(){
        System.out.println("dog");
    };
}
public class abstract_class_prac {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
        obj.display();
    }
}
