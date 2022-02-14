package com.company;

//Nursultan Haimuldin if you see this code, you would be animeshnik!!!

import java.util.ArrayList;

public class User {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjects = new ArrayList<>();


    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
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

    public User(int studentID , String studentName){
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';

    }
}
