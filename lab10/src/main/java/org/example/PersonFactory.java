package org.example;

public class PersonFactory {

    public static Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Default Name");
        person.setAge(30);
        person.setAddress("Default Address, Unknown City");
        return person;
    }

    public static void main(String[] args) {
        Person person = PersonFactory.createDefaultPerson();
        System.out.println("Name: " + person.getName() +
                ", Age: " + person.getAge() +
                ", Address: " + person.getAddress());
    }
}
