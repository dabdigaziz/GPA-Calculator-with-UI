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
                scanner.nextLine();
                String name = scanner.nextLine();
                new_user.setStudentName(name);
                System.out.println("Enter number of subjects: ");
                int num = scanner.nextInt();
                for(int i = 0; i < num; i++){
                    Subject subject = new Subject();
                    System.out.println("Enter name of subject:");
                    scanner.nextLine();
                    String subject_name = scanner.nextLine();
                    if(subject_name.length() > 150){
                        System.out.println("Error, dont write letters enough");
                        break;
                    }
                    System.out.println("Enter credits of subject: ");
                    int credits = scanner.nextInt();
                    if(credits >= 10 || credits <= 0){
                        System.out.println("Error! Credits should be lesser than 10!");
                        break;
                    }
                    System.out.println("Enter your grade: ");
                    int grade = scanner.nextInt();
                    if(grade >= 100 || grade <= 0){
                        System.out.println("Error! Grade should be lesser than 100 and more than 100!");
                        break;
                    }
                    subject.setSubjectName(subject_name);
                    subject.setSubjectCredit(credits);
                    subject.setMark(grade);
                    new_user.setSubjects(subject);
                    System.out.println("**************");
                    System.out.println("Your subjects:");
                    System.out.println("Subject | Credits | Grade");
                    for(int j = 0; j < new_user.getSubjects().size(); j++){
                        System.out.println(new_user.getSubjects().get(j).toString());
                    }
                    System.out.println("**************");
                }
                GpaCalculatorClass calculator = new GpaCalculatorClass();
                double userGpa = calculator.GpaCalculator(new_user);
                new_user.setStudentGPA(userGpa);
                insertUser(new_user.getStudentName() , new_user.getStudentGPA());
                insertSubjects(new_user);
            }
            if(c == 2){
                System.out.println("Enter the ID which you want to delete: ");
                int id = scanner.nextInt();
                deleteUser(id);
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
                createNewUserMenu("Dias", 3.88);
            }
        }
    }

    public void deleteUser(int id){
        String response = controller.deleteUser(id);
        System.out.println(response);
    }

    public void insertSubjects(User user){
        String response = controller.insertSubjects(user);
        System.out.println(response);
    }

    public void insertUser(String userName , double userGpa){
        String response = controller.insertUser(userName , userGpa);
        System.out.println(response);
    }

    public void showAllUsers(){
        controller.getAllUsers();
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
