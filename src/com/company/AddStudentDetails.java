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
        System.out.println("Welcome to GPA calculator app" + user + "!");

        while(true){
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Show Rating");
            System.out.println("4. Create Table Users");
            System.out.println("5. Create Table Subjects");
            System.out.println("6. Exit");

            int c = scanner.nextInt();

            if(c == 1){
                User new_user = new User();
                System.out.println("Enter name and surname: ");
                String name = scanner.nextLine();
                new_user.setStudentName(name);
                scanner.nextLine();
                System.out.println("Enter number of subjects: ");
                int num = scanner.nextInt();
                for(int i = 0; i < num; i++){
                    Subject subject = new Subject();
                    System.out.println("Enter name of subject:");
                    scanner.nextLine();
                    String subject_name = scanner.nextLine();
                    System.out.println("Enter credits of subject: ");
                    int credits = scanner.nextInt();
                    System.out.println("Enter your grade: ");
                    int grade = scanner.nextInt();
                    subject.setSubjectName(subject_name);
                    subject.setSubjectCredit(credits);
                    subject.setMark(grade);
                    new_user.setSubjects(subject);
                    System.out.println("**************");
                    System.out.println("           Subject | Credits | Grade ");
                    System.out.println("You added: " + subject.toString());
                    System.out.println("**************");
                }
            }
            if(c == 3){
                showAllUsers();
            }
            if(c == 4){
                createTableUsersMenu();
            }
            if(c == 5){
                createTableSubjectsMenu();
            }
            if(c == 7){
                createNewUserMenu("Dias", 3.5);
            }
        }
    }

    public void showAllUsers(){
        String response = controller.getAllUsers();
        System.out.println(response);
    }

    public void createNewUserMenu(String username, double GPA){
        controller.insertUser(username, GPA);
    }

    public void createTableUsersMenu(){
        controller.createTableUsers();
    }
    public void createTableSubjectsMenu() {
        controller.createTableSubjects();
    }
}
