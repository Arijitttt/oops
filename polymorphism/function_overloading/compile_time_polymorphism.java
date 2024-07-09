package polymorphism.function_overloading;
class MathOperation{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}

public class compile_time_polymorphism {
    public static void main(String[] args) {
        MathOperation ob = new MathOperation();
        System.out.println(ob.add(2,3 ));
        System.out.println(ob.add(2,3,4));
        System.out.println(ob.add(2.5,3.5 ));
    }
}
