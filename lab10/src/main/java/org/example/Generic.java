package org.example;

public class Generic<T> {
    private T object;

    public Generic(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        // Wrapping a Person object
        Person person = new Person();
        person.setName("Alice");
        person.setAge(28);
        person.setAddress("789 Oak St, Hometown, USA");

        Generic<Person> personWrapper = new Generic<>(person);
        System.out.println("Wrapped Person: " +
                "Name: " + personWrapper.getObject().getName() +
                ", Age: " + personWrapper.getObject().getAge() +
                ", Address: " + personWrapper.getObject().getAddress());

        // Wrapping a Student object
        Student student = new Student();
        student.setName("Bob");
        student.setAge(20);
        student.setAddress("123 Campus Dr, College Town, USA");
        student.setStudentId("S67890");

        Generic<Student> studentWrapper = new Generic<>(student);
        System.out.println("Wrapped Student: " +
                "Name: " + studentWrapper.getObject().getName() +
                ", Age: " + studentWrapper.getObject().getAge() +
                ", Address: " + studentWrapper.getObject().getAddress() +
                ", Student ID: " + studentWrapper.getObject().getStudentId());
    }
}
