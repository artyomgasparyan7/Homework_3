package com.company.pachage_for_day5;

/**
 * . Define a Person class which
 *  Has fields name, age, address
 *  define no argument constructor
 *  define all argument constructor
 *  write method which will print all information about person
 *  create 2 person objects, print all info about them
 */
class HomeworkDay5 {

    private String name;
    private int age;
    private String address;

    public HomeworkDay5(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public HomeworkDay5(){


    }

    public void setPerson(String name, int age, String addres) {

        this.name = name;
        this.age = age;
        this.address = addres;

    }

    public String getString(String name, String addres) {

        return name + addres;
    }

    public int getAge(int age) {

        return age;
    }

    public void allInform() {

        System.out.println("My name is: " + name + ", My old is: " + age + ", My addres: " + address);

    }

}

/**
 * . Define Employee class which
 *  Has fields id, name, department, age, gender
 *  define all argument constructor
 *  write method which will print all information about employee
 *  create 5 employee objects(3 male and 2 female)
 *  3 of them are working in same department  print all info about them
 */
class Employee {

    int id,age;
    String name,department,gender;

    public Employee(int id, String name, String department,int age, String gender){

        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;


    }

    public void allInform() {

        System.out.println("My Id: " + id+", My name is: " + name +
                ", department of programming,that I learn: "+department+ ", My old is: " + age +
                ", Gender: " + gender);

    }


}

public class Day_5_Test {

    public static void main(String[] args) {

        //create 2 person objects, print all info about them
        HomeworkDay5 obj1 = new HomeworkDay5("Artyom", 22, "Sevaki43");
        HomeworkDay5 obj2 = new HomeworkDay5("Ara", 35, "Halabyan85/5");

        obj1.allInform();
        obj2.allInform();

        //create 5 employee objects(3 male and 2 female)
        Employee employee1 = new Employee(7,"Artyom","backend",22,"male");
        Employee employee2 = new Employee(1,"Asatur","frontend",25,"male");
        Employee employee3 = new Employee(3,"Babken","backend",32,"male");
        Employee employee4 = new Employee(2,"Eva","backend",24,"female");
        Employee employee5 = new Employee(4,"Arpi","frontend",27,"female");

        employee1.allInform();
        employee2.allInform();
        employee3.allInform();
        employee4.allInform();
        employee5.allInform();

        //create an instance of Author and print all info about him
        Author author = new Author("Herbert","herbertshild@gmail.com","male");
        author.allInform();

        //write method which will print all information about Book
        Book book = new Book("English-Gremer",author,84.2);
        book.allInform();


        book.nameAuthor();
        book.emailAuther();

        Book book1 = new Book("Mathematic",author,78.5);
        Book book2 = new Book("Alfhavit",author,85.5);

        book1.allInform();
        book2.allInform();





    }
}
