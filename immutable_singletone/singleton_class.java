package immutable_singletone;
class Base{
    private static Base myObj = null;
    private Base(){}
    public void showData(){
        System.out.println("Red");
    }
    public static Base getInstance(){
        if(myObj == null){
            myObj = new Base();
        }
        return myObj;
    }
}
public class singleton_class {
    public static void main(String[] args) {
        Base obj1 = Base.getInstance();
        obj1.showData();
    }
}
