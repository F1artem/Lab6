package com.test;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Артём", "Варсан", 336, 3.8);
        Aspirant aspirant = new Aspirant("Юра", "Иванов", 337, 4.5);
        Student[] people = {student, aspirant};
        for (Student student1 : people) {
            student1.getScholarship();}
        System.out.println();
        student.hello();
        student.getScholarship();
        aspirant.hello();
        aspirant.getScholarship();


    }

}
