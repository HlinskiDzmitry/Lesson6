package org.example;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Имя: "+fullName+", "+"должность: "+position+", "+"электронная почта: "+email+", "+"мобильный номер: "+phone+", "+"заработная плата: "+salary+", "+"возраст: "+age+".");
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("1", "1", "1", "1", 1, 1);
        persArray[1] = new Person("2", "2", "2", "2", 2, 2);
        persArray[2] = new Person("3", "3", "3", "3", 3, 3);
        persArray[3] = new Person("4", "4", "4", "4", 4, 4);
        persArray[4] = new Person("5", "5", "5", "5", 5, 5);
    }
}
