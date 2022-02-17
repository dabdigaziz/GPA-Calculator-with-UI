package com.company.methods;

import com.company.User;
import com.company.dbMethods.interfaces.IMethods;
import com.company.Main;

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

    public String getAllUsers(){
        List<User> allUsers = dbMethods.getAllUsers();
        if(allUsers.size() == 0){
            return "Users was not found! Please add new users.";
        } else {
            return allUsers.toString();
        }
    }

    public String insertUser(String username, double gpa){
        boolean checked = dbMethods.insertUser(username, gpa);
        if(checked){
            return "User " + username + "added successfully!";
        } else {
            return "User creation failed!";
        }
    }

}
