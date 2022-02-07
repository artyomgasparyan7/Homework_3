package day5;

class   Person{

    private int age;
    private String name;

    Person(int age, String  name){

        this.age = age;
        this.name = name;
    }

    public Person(int age){

        this(age,"Artyom");
    }

    public void setAge(int age){

        this.age = age;

    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Day5 {
    public static void main(String[] args) {

        Person obj1 = new Person(21);

        Person obj2 = new Person(35,"Aram");



        obj1.setAge(25);
        System.out.println("New age is: " + obj1.getAge());
        System.out.println("Name is: " + obj1.getName());

        obj2.setAge(24);
        obj2.setName("Axasi");
        System.out.println("New age is:  " + obj2.getAge());
        System.out.println("New name is: " + obj2.getName());

        


    }
}
