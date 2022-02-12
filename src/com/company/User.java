package com.company;

//Nursultan Haimuldin if you see this code, you would be animeshnik!!!

public class User {
        private int studentID;
        private String studentName;

        public int getStudentID(){
            return studentID;
        }

        public void setStudentID(int studentID){
            this.studentID() = studentID;
        }

        public String getStudentName(){
            return studentName;
        }

        public void setStudentName(String studentName){
            this.studentName = studentName;
        }

        public Student(int studentID , String studentName){
            this.studentName = studentName;
            this.studentID = studentID;
        }
        //Auto-generated constructor
        public Student() {
            super();
        }

        @Override
        public String ToString() {
            return "Student [studentID = " + studentID + ", studentName = " + studentName + "]";
        }
}
