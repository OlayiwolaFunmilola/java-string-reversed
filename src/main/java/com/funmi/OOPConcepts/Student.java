package com.funmi.OOPConcepts;

public class Student {

    String name ;
    int age;
    String address;

    public Student(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ("Student name is " +
                "name='" + name + ',' +
                ", age=" + age +
                ", address='" + address + '.' );
    }

    static void main(String[] args) {
        Student Funmi = new Student("Funmi", 25, " 4b, Utomie Aiire");

        System.out.println(Funmi.getAddress());
        System.out.println(Funmi.getAge());
        System.out.println(Funmi.getName());

    }

}

