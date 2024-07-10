package immutable_singletone;
public final class immutable_class {
    private final int id;
    private final String name;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public immutable_class(int i,String s){
        this.id = i;
        this.name = s;
    }

    public static void main(String[] args) {
        immutable_class obj = new immutable_class(1,"Java");
        System.out.println(obj.name=="Java");
    }
}
