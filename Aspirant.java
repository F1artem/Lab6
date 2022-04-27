package com.test;


public class Aspirant extends Student {
    private String make;


    public Aspirant(String firstName, String lastName, int group, double averageMark) {
        super(firstName, lastName, group, averageMark);

    }

    public String getMake(String make) {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public void hello() {
        super.hello();
        System.out.println("(Изучение планеты Земля)");
    }

    @Override
    public void getScholarship() {
        if (getAverageMark() == 5) {
            System.out.println("Стипендия = 200 руб");
        } else {
            System.out.println("Стипендия = 180 руб");
            return;
        }

    }
}



