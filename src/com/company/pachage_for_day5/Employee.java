package com.company.pachage_for_day5;

/**
 * . Define Employee class which
 *  Has fields id, name, department, age, gender
 *  define all argument constructor
 *  write method which will print all information about employee
 *  create 5 employee objects(3 male and 2 female)
 *  3 of them are working in same department  print all info about them
 */
public class Employee {

    int id,age;
    String name,department;
    char gender;
    double version;

    Employee(){

        System.out.println("default constuctor!!!!");
    }

    public Employee(int id, String name, String department,int age, char gender){

        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;


    }

    public Employee(String name, String department,double version){


        this.name = name;
        this.department = department;
        this.version = version;
    }

    public Employee(Employee employee){
        this(employee.name,null,employee.version);


    }

    public void main(){

        System.out.println("My Id: " + id+", My name is: " + name +
                ", department of programming,that I learn: "+department+ ", My old is: " + age +
                ", Gender: " + gender + "Version: " + version);
    }

    public void allInform() {

        System.out.println("My Id: " + id+", My name is: " + name +
                ", department is: "+department+ ", My old is: " + age +
                ", Gender: " + gender);

    }


}
