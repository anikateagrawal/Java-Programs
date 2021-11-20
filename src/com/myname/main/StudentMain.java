package com.myname.main;

import com.myname.exception.InvalidStudentException;
import com.myname.student.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] ar=new Student[3];
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=new Student();
            System.out.println("Enter name,rollno,cpi");
            ar[i].setName(sc.nextLine());
            ar[i].setRollNo(sc.nextInt());
            ar[i].setCPI(sc.nextFloat());
            sc.nextLine();
        }
        System.out.println("Enter rollno ro search");
        try {
            System.out.println(search(ar,sc.nextInt()));
        }
        catch (InvalidStudentException e)
        {
            System.out.println(e);
        }
    }
    public static Student search(Student[] ar,int rollNo) throws InvalidStudentException {
        int i;
        for (i=0;i<ar.length;i++)
            if (ar[i].getRollNo() == rollNo) return ar[i];
        if(i==ar.length)
            throw new InvalidStudentException("Student not found in list");
        return null;
    }
}
