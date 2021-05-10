/*
* ASS - 6
* UNIVERSITY DETAILS
*/

import java.io.*;
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;*/

class Address
{
    String city;
    String state;
    String country;

    Address(String city, String state, String country)
    {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class University
{
    String name;
    String VCName;
    String NAACGrade;
    Address address;
    byte noOfDept;
    
    void display()
    {
        System.out.println("Address = " + address.city + " , " + address.state + " , " + address.country);
    }
}

class Teacher extends University
{
    String nameteacher;
    String dept;
    int age;

    Teacher(String nameteacher,
            int age,
            String dept,
            String name,
            byte noOfDept,
            String VCName,
            String NAACGrade,
            String city,
            String state,
            String country)
    {
        this.nameteacher = nameteacher;
        this.age = age;
        this.dept = dept;
        this.name = name;
        this.noOfDept = noOfDept;
        this.VCName = VCName;
        this.NAACGrade = NAACGrade;
        address = new Address(city, state, country);
    }

    void display()
    {
        System.out.println("\n\nTEACHER INFO");
        System.out.println("teacher name : " + nameteacher);
        System.out.println("age = " + age);
        System.out.println("department name  = " + dept);
        System.out.println("\nUNIVERSITY INFO");
        System.out.println("name = " + name);
        System.out.println("numbers of dept = " + noOfDept);
        System.out.println("VC name = " + VCName);
        super.display();
    }
}

class Student extends University
{
    String nameStudent;
    String dept;
    int age;

    Student(String nameStudent,
            int age,
            String dept,
            String name,
            byte noOfDept,
            String VCName,
            String NAACGrade,
            String city,
            String state,
            String country)
    {
        this.nameStudent = nameStudent;
        this.age = age;
        this.dept = dept;
        this.name = name;
        this.noOfDept = noOfDept;
        this.VCName = VCName;
        this.NAACGrade = NAACGrade;
        address = new Address(city, state, country);
    }

    void display()
    {
        System.out.println("\n\nSTUDENT INFO");
        System.out.println("student name : " + nameStudent);
        System.out.println("age = " + age);
        System.out.println("department name  = " + dept);
        System.out.println("\nUNIVERSITY INFO");
        System.out.println("name = " + name);
        System.out.println("numbers of dept = " + noOfDept);
        System.out.println("VC name = " + VCName);
        super.display();
    }
}

class UniversityDetails
{
    public static void main(String[] args)throws IOException
    {       
        String universityName;
        String dept;
        String VCName;
        String NAACGrade;
        String city;
        String state;
        String country;
        String name;
        int age;
        byte noOfDept;          
    
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        University ob1;

        System.out.println("Enter 'TEACHER' details");
        System.out.println("Name = ");
        name = buf.readLine();
        System.out.println("Age = ");
        age = Integer.parseInt(buf.readLine());
        System.out.println("Department = ");
        dept = buf.readLine();
        System.out.println("University name = ");
        universityName = buf.readLine();
        System.out.println("Nos Of Deptments = ");
        noOfDept = Byte.parseByte(buf.readLine());
        System.out.println("VC Name = ");
        VCName = buf.readLine();
        System.out.println("NAACGrade = ");
        NAACGrade = buf.readLine();
        System.out.println("City = ");
        city = buf.readLine();
        System.out.println("State = ");
        state = buf.readLine();
        System.out.println("Country = ");
        country = buf.readLine();

        ob1 = new Teacher(name, age, dept, universityName, noOfDept, VCName, NAACGrade, city, state, country);
        ob1.display();
        System.out.println("\n");

        System.out.println("\nEnter 'STUDENT' details");
        System.out.println("Name = ");
        name = buf.readLine();
        System.out.println("Age = ");
        age = Integer.parseInt(buf.readLine());
        System.out.println("Department = ");
        dept = buf.readLine();
        System.out.println("University name = ");
        universityName = buf.readLine();
        System.out.println("Nos Of Deptments = ");
        noOfDept = Byte.parseByte(buf.readLine());
        System.out.println("VC Name = ");
        VCName = buf.readLine();
        System.out.println("NAACGrade = ");
        NAACGrade = buf.readLine();
        System.out.println("City = ");
        city = buf.readLine();
        System.out.println("State = ");
        state = buf.readLine();
        System.out.println("Country = ");
        country = buf.readLine();
        
        ob1 = new Student(name, age, dept, universityName, noOfDept, VCName, NAACGrade, city, state, country);
        ob1.display();
    }
}
