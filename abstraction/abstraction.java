abstract class Base{
    public void fun1(){
        System.out.println("Red");
    }
}
class Derived extends Base{
    public void fun2(){
        System.out.println("Green");
    }
}
class Abstraction_Main{
    public static void main(String[] args) {
        Derived ob = new Derived();
        ob.fun1();
        ob.fun2();
    }
}