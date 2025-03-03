package main;
import course.course_class;
import fine.fine_class;
import student.student_class;

public class main_class {
    public static void main(String[] args) {
        
        course_class a1 = new course_class();
        a1.display();
        
        course_class a2 = new course_class("Java",301);
        a2.display();
        
        fine_class b1 = new fine_class();
        b1.display();
        
        fine_class b2 = new fine_class("Emon",100);
        b2.display();
        
        student_class c1 = new student_class();
        c1.display();
        
        student_class c2 = new student_class("Emon",1079);
        c2.display();
        
    }
  
}