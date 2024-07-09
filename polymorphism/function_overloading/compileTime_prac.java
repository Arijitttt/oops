package polymorphism.function_overloading;
class value{
    public void display(int a,int b){
        System.out.println("value of display1: "+a+b);
    }
    public void display(int a){
        System.out.println("value of display2: "+a);
    }
}
public class compileTime_prac {
    public static void main(String[] args) {
        value v = new value();
        v.display(10,50);
        v.display(10);
    }
}
