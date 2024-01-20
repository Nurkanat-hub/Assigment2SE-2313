package Nurkanat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("What do you want?");
            System.out.println("1. Add student");
            System.out.println("2. Add employee");
            System.out.println("3. Print data");
            System.out.println("0. End the program");
            System.out.println("Enter your choice:");

            String answer = scanner.nextLine().toLowerCase();

            switch (answer) {
                case "1":
                    // Adding student
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter surname: ");
                    String surname = scanner.nextLine();

                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    Student student = new Student(name, surname, gpa);
                    people.add(student);

                    // Example usage of Person methods
                    System.out.println("Student ID: " + student.getId());
                    System.out.println("Student Name: " + student.getName());
                    System.out.println("Student Surname: " + student.getSurname());
                    System.out.println();

                    break;

                case "2":
                    // Adding employee
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter surname: ");
                    surname = scanner.nextLine();

                    System.out.print("Enter position: ");
                    String position = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(name, surname, position, salary);
                    people.add(employee);

                    // Example usage of Person methods
                    System.out.println("Employee ID: " + employee.getId());
                    System.out.println("Employee Name: " + employee.getName());
                    System.out.println("Employee Surname: " + employee.getSurname());
                    System.out.println();

                    break;

                case "3":
                    // Print data
                    Collections.sort(people);
                    printData(people);
                    System.out.println();
                    break;

                case "0":
                    // End the program
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    break;
            }

            // Consume the newline character
            scanner.nextLine();
        }
    }
}