package polymorphism.function_hiding;
class Base{
    public static void fun(){
        System.out.println("Red");
    }
}
class Derive extends Base{
    public static void fun(){
        System.out.println("Green");
    }
}
public class function_hiding {
    public static void main(String[] args) {
        Base ob = new Derive();
        ob.fun();
    }
}
