package inheritence;
class Base{
    protected double a = 13;
}
class Intr extends Base{
    protected double b;
    public void calB(){
        b = a*0.13;
        System.out.println("B = "+b);
    }
} 
class Derived extends Intr{
    protected double c;
    public void calC(){
        c = a+b;
        System.out.println("C = "+c);
    }
}
class muti_level_inheritence_main{
    public static void main(String[] args) {
        Derived ob = new Derived();
        ob.calB();
        ob.calC();
    }
}