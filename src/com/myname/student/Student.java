package com.myname.student;

public class Student {
    private String name;
    private int rollNo;
    private float CPI;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getCPI() {
        return CPI;
    }

    public void setCPI(float CPI) {
        this.CPI = CPI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return "Name= "+name+" Roll No.= "+rollNo+" CPI="+CPI;
    }
}