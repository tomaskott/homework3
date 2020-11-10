package com.company;

public class Student {
    private String name;
    private int classroom;
    //constructor
    public Student(){
        name = "pokus";
        classroom = 42;
    }
    public Student(String name) {
        this.name = name;
        this.classroom = 1;
    }

    public String getEvaluation() {
        //setting some grades for testing purposes
        Course course1 = new Course(name, "Math", 1);
        Course course2 = new Course(name, "Geography", 2);
        Course course3 = new Course(name, "English", 3);
        Course course4 = new Course(name, "Football", 4);
        Course course5 = new Course(name, "Programming", 5);

        return course1.getGrade(name);
    }

}
