package org.example;

public class Person {
    private String name;
    private int age;
    private String address; // New field for address

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

    // Main method for testing
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setAddress("123 Main St, Anytown, USA");
        System.out.println("Name: " + person.getName() +
                ", Age: " + person.getAge() +
                ", Address: " + person.getAddress());
    }
}
