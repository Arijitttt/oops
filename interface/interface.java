interface Intr1{
    int n =5;
}
interface Intr2{
    public void fun();
}
class Derive implements Intr1,Intr2{
    public void fun(){
        System.out.println(n*n);
    }
}
class Interface_main{
    public static void main(String[] args) {
        Derive obj = new Derive();
        obj.fun();
    }
}