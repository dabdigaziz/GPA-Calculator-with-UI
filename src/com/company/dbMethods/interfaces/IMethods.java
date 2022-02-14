package com.company.dbMethods.interfaces;

public interface IMethods {
    boolean createTableUsers();
    boolean createTableSubjects();
    boolean insertUser(String name, int gpa);
    boolean insertSubject(int id, String subject_name, int credits, int grade);
    int getId(String username);
}
