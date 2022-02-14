package com.company.methods;

import com.company.dbMethods.interfaces.IMethods;
import com.company.Main;

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
}
