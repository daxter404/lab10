package org.example;

public class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jane");
        student.setAge(22);
        student.setAddress("456 College Rd, University City, USA");
        student.setStudentId("S12345");

        System.out.println("Name: " + student.getName() +
                ", Age: " + student.getAge() +
                ", Address: " + student.getAddress() +
                ", Student ID: " + student.getStudentId());
    }
}
