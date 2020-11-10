package com.company;

public class Course {
    private String courseName;
    //private String[] students;
    private String student;
    //private int[] grades;
    private int grade;
    //constructor
    public Course(String student, String courseName, int grade){
        this.student=student;
        this.courseName=courseName;
        this.grade=grade;
    }

    public void setGrade(String newStudent, int newGrade) {
      this.student=newStudent;
      this.grade=newGrade;
    }

    public String getGrade(String student) {
      if (student.equals(student)) {
          String written = "Evaluetion in course:" +courseName +"is:" +grade;
          return written;
      }
      return "Missing";
    }
}
