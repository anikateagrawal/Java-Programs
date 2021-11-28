package multithreading;
import com.myname.exception.InvalidStudentException;
import com.myname.student.Student;

import java.util.Scanner;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()-> {
            for (int i = 1; i <= 10; i++) {
                if (i == 6) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
            }
        });
        Thread t2=new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            class InvalidStudentException extends Exception{
                public InvalidStudentException(String s)
                {
                    super(s);
                }
            }
        });
        t1.start();
        t2.start();
        t2.join();
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

