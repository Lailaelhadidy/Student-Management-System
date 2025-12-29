package com.mycompany.studentmanagementsystem;
import java.util.Scanner;

public class StudentManager {
    
     Scanner in= new Scanner(System.in);

    private Student [] students= new Student[100];
    private static int count=0;

    public StudentManager() {
    }
    
    public boolean checkAdding(){
     if( count== students.length){
        System.out.println("Cannot Add more Students. ");
        return false; }
     return true;
    }
    
    
    public void addStudent(int ID, String name, int subjects){
   

    Student st= new Student(ID, name, subjects); //st stands for student
    students[count]= st;
    count++;
    
        System.out.println("Student Added Successfully!! ");
        
    }
    
    public String FindStudent(int id){
        for (int i=0; i<count; i++) {
            if (students[i].getID() == id) 
                return "Student Found: "+ students[i].toString();
        }
     return "Student not Found";
    }
    
    public void EnterGrades(){
        
        System.out.print("Enter Student ID to add Grades..  ");
        int id= in.nextInt();
        
        int index = -1;
        for(int j=0; j<count ; j++) {
            if (students[j].getID() == id) {
                index= j; }
   }
        if(index != -1){
            
        double grade;
        System.out.println("Entering Student Grades....");
        for(int i=0; i<students[index].getSubjects() ; i++){
               
        do {
            System.out.println("Enter the Grade of subject " + (i+1));
            grade = in.nextDouble();
            students[index].setGrades((i), grade);
            
        if(grade>100 ||grade<0)
            System.out.println("Invalid Grade!! Re-enter please.. "); 
            
        } while(grade<0 || grade>100); 
        }
         System.out.println("Grades Saved Successfully!! ");
        }
        else
            System.out.println("ID Not Found");
        
           }   
    
    public void AverageGrades(){
        for(int i=0; i<count; i++){
        System.out.println("Student" + (i+1) + " Average Score = " +  students[i].CalcAverageScore());
               }
    }

    public void DisplayStudents(){
        System.out.println("All Students...");
        for(int i=0; i<count; i++){
        System.out.println("Student " + (i+1));
        System.out.println(students[i].toString());
        }
    
    
    }
    
    
    
    
}

