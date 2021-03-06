package com.company.dbMethods.interfaces;

import com.company.User;

import java.util.List;

public interface IMethods {
    boolean createTableUsers();
    boolean createTableSubjects();
    boolean insertUser(String name, double gpa);
    boolean insertSubject(int id, String subject_name, int credits, int grade);
    int getId(String username);
    boolean deleteUser(int id);
    List<User> getAllUsers();
}
