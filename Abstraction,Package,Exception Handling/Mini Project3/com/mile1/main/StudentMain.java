package com.mile1.main;

import com.mile1.Exception.NullStudentObjectException;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class StudentMain {
    static Student data[] = new Student[4];
     
    public static Student[] getData() {
        return data;
    }

    public static void setData(Student[] data) {
        StudentMain.data = data;
    }

    public StudentMain() {
        for(int i = 0; i < data.length; i++){
            data[i] = new Student();
        }

        data[0] = new Student("Sekar", new int[]{85,75,95});
        data[1] = new Student(null, new int[]{11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
        
    }

    public static void main(String[] args) {
        StudentMain s = new StudentMain();
        Student[] st = s.getData();
        for(int i = 0; i < st.length; i++){
            StudentReport sr = new StudentReport();
            if(sr.findGrades(st[i])!=null){
           System.out.println( sr.findGrades(st[i]));}
        }

        StudentReport sr2 = new StudentReport();
        System.out.println(sr2.findNumberOfNullMarksArray(st));
        System.out.println(sr2.findNumberOfNullName(st));
        System.out.println(sr2.findNumberOfNullObject(st));
    
        }
    }
    

