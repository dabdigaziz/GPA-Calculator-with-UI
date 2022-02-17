package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Subject{
    private String SubjectName;
    private int SubjectCredit;
    private int Grade;

    public String getSubjectName(){
        return SubjectName;
    }

    public void setSubjectName(String SubjectName){
        this.SubjectName = SubjectName;
    }

    public int getSubjectCredit(){
        return this.SubjectCredit;
    }
    public void setSubjectCredit(int SubjectCredit){
        this.SubjectCredit = SubjectCredit;
    }

    public int getMark(){
        return this.Grade;
    }

    public void setMark(int Mark){
        this.Grade = Mark;
    }
    Scanner num = new Scanner(System.in);
    
}
