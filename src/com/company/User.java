package com.company;

//Nursultan Haimuldin if you see this code, you would be animeshnik!!!

import java.util.ArrayList;

public class User {
    private int studentID;
    private String studentName;
    private Double studentGPA;
    private ArrayList<Subject> subjects = new ArrayList<>();


    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public Double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(Double studentGPA) {
        this.studentGPA = studentGPA;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setSubjects(Subject subjects) {
        this.subjects.add(subjects);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public User(int studentID , String studentName, double studentGPA){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGPA = studentGPA;
    }

    public User(){

    }

    @Override
    public String toString() {
        return studentID + " | " + studentName + " | " + studentGPA;
    }
}
