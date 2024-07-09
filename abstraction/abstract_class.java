package abstraction;
abstract class Base{
    public void fun(){
        System.out.println("red");
    }
    abstract void show();
}
class Derived1 extends Base{
    public void fun(){
        System.out.println("green");
    }
    void show(){}
}
class Derived2 extends Base{
    void show(){
        System.out.println("blue");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Derived1 ob1 = new Derived1();
        Derived2 ob2 = new Derived2();

        ob1.fun(); //green
        ob2.fun(); //red
        ob2.show();//blue
    }
}
