package person;

public class Person {
    // instantiate variables
    private String name;
    private int age;
    private String gender;

    // default constructors
    public Person () {
        this.name = "unknown";
        this.age = 0;
        this.gender = "unknown";
    }

    // parameter constructors
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;   
    }

    public int birthday() {
        return ++this.age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }

    public static void main(String[] args) {
        Person p = new Person("kiet", 17, "male");
        int age = p.birthday(); // this.age = age; since age = 17, hence "return ++age" returns 18
        System.out.println(age);
        p.introduce();
    }
}
