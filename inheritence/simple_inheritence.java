package inheritence;
class Base{
    protected int a,b;
    public void getData(){
        a = 13;
        b = 5;
    }
}
class Derived extends Base{
    private int c;
    public void result(){
        c = a+b;
        System.out.println(c);
    }
}
class inheritence_main{
    public static void main(String[] args) {
        Derived ob = new Derived();
        ob.getData();
        ob.result();
    }
}