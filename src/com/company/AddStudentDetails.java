package com.company;

import java.io.*;

public class AddStudentDetails {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello user, please enter your name: ");
        String user = br.readLine();
        System.out.println("Welcom to GPA calculator app" + user + "!");

        while(true){
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Show Rating");
            System.out.println("4. Create Table");
            System.out.println("5. Exit")

            int c = Integer.parseInt(br.readLine());

            if(c == 1){
                //add student
                System.out.println("Enter name and surename: ");
                String name = br.readLine();
                System.out.println("Enter number of subject: ");
                int subjects = Integer.parseInt(br.readLine());
                System.out.println("Enter subjects: ");
                String num =
            }
        }

    }
}
