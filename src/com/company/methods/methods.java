package com.company.methods;

import com.company.User;
import com.company.dbMethods.interfaces.IMethods;

import java.util.List;

public class methods {
    private final IMethods dbMethods;

    public methods(IMethods dbMethods){
        this.dbMethods = dbMethods;
    }

    public void createTableUsers(){
        boolean created = dbMethods.createTableUsers();
        if(created) {
            System.out.println("Table Users created successfully!");
        } else {
            System.out.println("Table Users creation was failed!");
        }
    }

    public void createTableSubjects(){
        boolean created = dbMethods.createTableSubjects();
        if(created){
            System.out.println("Table Subjects created successfully!");
        } else {
            System.out.println("Table Subjects creation failed!");
        }
    }

    public void getAllUsers(){
        List<User> allUsers = dbMethods.getAllUsers();
        if(allUsers.size() == 0){
            System.out.println("Users was not found! Please add new users.");
        } else {
            System.out.println("*******************\n");
            System.out.println("Top high GPA users\nID | Username | GPA");
            for(int i = 0; i < allUsers.size(); i++){
                System.out.println(allUsers.get(i).toString());
            }
            System.out.println("\n*******************\n");
        }
    }

    public String insertUser(String username, double gpa){
        boolean checked = dbMethods.insertUser(username, gpa);
        if(checked){
            return "User " + username + " added successfully!";
        } else {
            return "User creation failed!";
        }
    }

    public String insertSubjects(User user) {
        try {
            String username = user.getStudentName();
            int getID = dbMethods.getId(username);
            for(int i = 0; i < user.getSubjects().size(); i++){
                dbMethods.insertSubject(getID, user.getSubjects().get(i).getSubjectName(), user.getSubjects().get(i).getSubjectCredit(), user.getSubjects().get(i).getMark());
            }
            return "Subjects added successfully";
        } catch (Exception error){
            return error.getMessage();
        }
    }

    public String deleteUser(int id){
        boolean checked = dbMethods.deleteUser(id);
        if(checked){
            return "User deleted successfully";
        } else {
            return "User deletion failed";
        }
    }

    public String getGpaDescription(double gpa) {
        if (gpa <= 4.0 && gpa >= 3.67) {
            return "Yes, you are a genius!";
        } else if (gpa < 3.67 && gpa >= 3.33) {
            return "You're good";
        } else if (gpa < 3.33 && gpa>=3.00){
            return "you have chance to grow";
        } else if (gpa < 3.00 && gpa >= 2.67) {
            return "Not bad but you can do better";
        } else if (gpa < 2.67 && gpa >= 2.33) {
            return "You can do better";
        } else if (gpa < 2.33 && gpa >= 2.00) {
            return "You gotta try";
        } else if (gpa < 2.00 && gpa >= 1.67) {
            return "Learn";
        } else if (gpa < 1.67 && gpa >= 1.33) {
            return "do your homework";
        } else if (gpa < 1.33 && gpa >= 1.00) {
            return "start work";
        } else if (gpa < 1.00 && gpa >= 0.00) {
            return "hello sky in the clouds";
        }
        return "There will be a holiday on your street too.";
    }

}
