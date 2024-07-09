package polymorphism.function_overriding;
class Red{
    public void redColor(){
        System.out.println("Red color");
    }
}
class Green extends Red{
    public void redColor(){
        System.out.println("Green color");
    }
}
public class runtime_prac {
    public static void main(String[] args) {
        Green obj = new Green();
        obj.redColor();
    }

}
