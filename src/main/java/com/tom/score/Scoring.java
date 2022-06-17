package com.tom.score;

import com.tom.GraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack", 78, 62);
        Student hank = new Student("Hank", 60, 30);
        GraduateStudent jane =
                new GraduateStudent("Jane", 65, 82, 79);
        jack.print();
        hank.print();
        jane.print();
        /*List<Student> students = new ArrayList<>();
        students.add(jack);
        students.add(hank);
        students.add(jane);
        for (int i=0; i<students.size(); i++) {
            Student stu = students.get(i);
            stu.print();
        }*/
    }
}
