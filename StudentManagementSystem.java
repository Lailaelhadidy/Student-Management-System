package com.mycompany.studentmanagementsystem;
import java.util.Scanner;
public class StudentManagementSystem {

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    StudentManager students= new StudentManager();
    int option;
    
    do{
    System.out.println("");
    System.out.print("""
                      1. Add new student
                      2. Enter grades for a student
                      3. Calculate averages for all students
                      4. Display all students
                      5. Search for a student by ID
                      0. Exit
                      Choose an option: """);
    
    option= in.nextInt();
    System.out.println("");
    
    switch(option){
    case 1:
        if( students.checkAdding() ){
        System.out.print("Enter Student ID: ");
        int ID= in.nextInt();
        System.out.print("Enter Student Name: ");
        String name= in.next();
        System.out.print("Enter Number of Subjects: ");
        int subjects= in.nextInt();
        
        students.addStudent(ID, name, subjects);
      break; }
    
    
    case 2:{
    students.EnterGrades();
    break; }
    
    case 3:{
    students.AverageGrades();   
    break; }
    
    case 4:{
    students.DisplayStudents();
    break; }
    
    case 5:{
    System.out.print("Enter Student ID to search: ");
    int ID= in.nextInt();
    System.out.println(students.FindStudent(ID));
    break; }
       
    case 0: 
        System.out.println("Exiting Program... Goodbye! ");
        break; 
        
    default: 
        System.out.println("Invalid Choice.. Try again");
    }
    
    }while(option !=0);
   
    
        
        
    
    }
}
