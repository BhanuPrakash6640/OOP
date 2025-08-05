package Practical3;
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first student name:");
        String name1 = sc.nextLine();

        System.out.println("enter first student age:");
        int age1 = sc.nextInt();
        sc.nextLine(); // to consume leftover newline

        System.out.println("enter second student name:");
        String name2 = sc.nextLine();

        System.out.println("enter second student age:");
        int age2 = sc.nextInt();

        Student s1 = new Student(name1, age1);
        Student s2 = new Student(name2, age2);

        System.out.println("\nStudent 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();
    }
}
