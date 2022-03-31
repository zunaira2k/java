package com.mile1.service;
import com.mile1.Exception.*;
import com.mile1.bean.Student;

public class StudentReport {
    int nullMarks=0;
    int nullName=0;
    int nullObject=0;
    public String Validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException  {
        
        if(s == null){
            throw new NullStudentObjectException();
        }
        else{

         if(s.getName()==null){
            throw new NullNameException();
           }

         else{ if(s.getMarks() == null){
             throw new NullMarksArrayException();

         }
        
        else{
            return "VALID";
        }}
    }

    }


    public String findGrades(Student studentObject){
        try{
            String ans = Validate(studentObject);
            String Grade = "";
            if(ans.equals("VALID")){
                int sum = 0;
                int[] arr = studentObject.getMarks();
                for (int i = 0; i < arr.length; i++){
                    if(arr[i]< 35){
                        Grade = "F";
                        break;
                    }
                    else{
                        sum = sum+arr[i];
                    }
            }
            if(!Grade.equals("F")){
            if(sum<150){
                 Grade = "C";
            }
            else if(sum < 200){
                 Grade = "B";
            }
            else if(sum <250){
              Grade = "A";
            }
            else{
                 Grade =  "A+";
            }
        }
        studentObject.setGrade(Grade);
        return Grade;
    }
    }
    catch(NullNameException e){
        e.printStackTrace();
        
    }
    catch(NullMarksArrayException e){
        e.printStackTrace();
    }
    catch(NullStudentObjectException e){
        e.printStackTrace();
    }
        return null;
}
 public int findNumberOfNullMarksArray(Student s[]) {
     for(int i=0;i<s.length;i++){
     if(s[i] == null){
    
     }
     else{
         if(s[i].getMarks()==null){
             this.nullMarks++;
         }
     }}
     return nullMarks;
 }

 public int findNumberOfNullName(Student s[]) {
    
    for(int i=0;i<s.length;i++){
        if(s[i] == null){
       
        }
        else{
           
            if(s[i].getName()==null){
                
                this.nullName++;
            }
        }}
        return nullName;


 }

 public int findNumberOfNullObject(Student s[]){
    for(int i=0;i<s.length;i++){
        if(s[i] == null){
             this.nullObject++;
        }
        }
        return nullObject;

 }
}
