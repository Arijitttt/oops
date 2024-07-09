class Test{
    public static void main(String[] args){
        Person p1  = new Person();
        p1.name = "Arijit";
        p1.age = 20;


        Person p2  = new Person();
        p2.name = "Anuj";
        p2.age = 26;

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);

        p1.walk();
        p2.walk(7);//polymmorphisom

        System.out.println("counter: "+Person.count);


    }
}

//inheritance
class Developer extends Person{
    public Developer(int age,String name){
        super(age,name);
    }
}

class Person{
    String name;
    int age;

    static int count;

    void walk(){//normal
        System.out.println(name+" Person is walking");
    }
    void walk(int steps){ //polymorphisom
        System.out.println(name+" Person is walking "+steps+" steps");
    }

    //constructor
    public Person(){
        count++;
        System.out.println("Person constructor is created"); //2 times are giving same output bacause p1 & p2 both there (default constructor)
    }
    public Person(int newAge,String newName){
        name = newName;
        age = newAge;
    }
}