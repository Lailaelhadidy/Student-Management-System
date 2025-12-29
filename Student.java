package com.mycompany.studentmanagementsystem;
import java.util.Scanner;
public class Student {
    Scanner in= new Scanner(System.in);
    
    
    private int ID;
    private int subjects= 0;
    private String name;
    private double []grades;
    
    public Student(int id, String name, int subjects){
    this.ID= id;
    this.name= name;
    this.subjects= subjects;
    this.grades= new double[subjects];
    }

    public int getID() {
        return ID;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setGrades(int subject, double grade) {
        grades[subject]=grade;
    }
    
   
               
    public double CalcAverageScore(){
        double sum=0;
        if (subjects==0)
            return 0;
        
        for(int i=0; i<grades.length; i++){
        sum+=grades[i];
        }
        return sum/grades.length;
     }
    
    public String getLetterGrade(){
        String grade;
    if (CalcAverageScore()>100 || CalcAverageScore()<0)
        grade= "Invalid grade";
    
    else if(CalcAverageScore()>90 || CalcAverageScore()==90 )
         grade= "A";
    else if(CalcAverageScore()>80 || CalcAverageScore()==80)
         grade= "B"; 
    else if(CalcAverageScore()>70 || CalcAverageScore()==70)
         grade= "C"; 
    else if(CalcAverageScore()>60 || CalcAverageScore()==60)
         grade= "D"; 
    else 
        grade= "F";
    
    return grade;
    }

    @Override
    public String toString() {
        return "Student{" + "ID:" + ID + ", name:" + name + ", Average:" + CalcAverageScore() + ", Letter Grade:" + getLetterGrade()  + '}';
    }

    
    
         
    
   
//    public void setGrades(){
//        System.out.println("Entering Student Grades....");
//        for(int i=0; i<grades.length; i++){
//               
//        do {
//            System.out.println("Enter the Grade of subject " + (i+1));
//            grades[i]= in.nextDouble();
//            
//        if(grades[i]>100 || grades[i]<0)
//            System.out.println("Invalid Grade!! Re-enter please.. "); 
//            
//        } while(grades[i]<0 || grades[i]>100); 
//            
//        
//    } }
     
 }   

