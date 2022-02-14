package com.company;

import com.company.methods.methods;

import java.io.*;
import java.util.Scanner;

public class AddStudentDetails {
    private final methods controller;
    private final Scanner scanner;

    public AddStudentDetails(methods controller){
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello user, please enter your name: ");
        String user = scanner.nextLine();
        System.out.println("Welcom to GPA calculator app" + user + "!");

        while(true){
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Show Rating");
            System.out.println("4. Create Table Users");
            System.out.println("5. Create Table Subjects");
            System.out.println("6. Exit");

            int c = scanner.nextInt();

            if(c == 1){
                //add student
                System.out.println("Enter name and surename: ");
                String name = scanner.nextLine();
                System.out.println("Enter number of subject: ");
                int subjects = scanner.nextInt();
                System.out.println("Enter subjects: ");
                String num;
            }
            if(c == 4){
                createTableUsersMenu();
            }
            if(c == 5){
                createTableSubjectsMenu();
            }
        }
    }
    public void createTableUsersMenu(){
        controller.createTableUsers();
    }
    public void createTableSubjectsMenu(){
        controller.createTableSubjects();
    }
}
