package com.test;

public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;


    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void hello() {
        System.out.println("Привет я " + getFirstName() + " " + getLastName() + " моя группа - "
                + getGroup() + " средняя оценка - " + getAverageMark() );

    }
    public void getScholarship() {
        if (getAverageMark() == 5) {
            System.out.println("Стипендия = 100 руб");
        } else {
            System.out.println("Стипендия = 80 руб");
            return;
        }


    }
}


