package com.company.lessonOOP;

import java.util.Locale;
import java.util.Scanner;

import static com.company.lessonOOP.Colors.TRACKER;

public class Lessonjava {
    public static void main(String[] args) {


        Car malibu = new Car(" malibu ", 2025);
        Car tracker = new Car(" tracker ", 2025);
        Scanner scanner = new Scanner(System.in);
        System.out.println("car name write");
        String colors = scanner.nextLine();
        Colors colors1 = Colors.valueOf(colors.toUpperCase());
        switch (colors1){
            case MALIBU -> {
                malibu.print();
                malibu.startCar();
            }
            case TRACKER -> tracker.print();
        }

    }
}

    enum Colors {
        MALIBU, TRACKER
    }

    class Car {
        String name;
        int year;

        public Car(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public void print() {
            System.out.println(" name " + name);
            System.out.println(" yili " + year);

        }


        public Car(String name) {
            this.name = name;
        }

        public void startCar(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("start->1");
            System.out.println("stop->2");
            int a=scanner.nextInt();
            for (int i = 0; i < 1; i++) {
                if (a==1){
                    System.out.println("start");
                }else {
                    System.out.println("stop");

                }

            }
        }
    }

