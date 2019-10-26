package com.codewithme;

class Employee{
    private int employeeId;
    private int employeeAge;
    String employeeName;
    public Employee(int employeeId, int employeeAge, String employeeName){
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeName = employeeName;

    }
    public void show(){
        System.out.println("Id: "+ employeeId + "     Age: "+ employeeAge + "      Name: " + employeeName);
    }

}

public class ConstructorDemo1 {
    public static void main(String args[]){
        Employee sudhan = new Employee(2,37,"Sudhan");
        Employee resham = new Employee(3,35,"Resham");
        Employee rhythm = new Employee(1,2,"Rhythm");

        System.out.println("Sudhan's Detail:");
        sudhan.show();
        System.out.println("--------------------------------------");
        System.out.println("Resham's Detail:");
        resham.show();
        System.out.println("--------------------------------------");
        System.out.println("Rhythm's Detail:");
        rhythm.show();
        System.out.println("--------------------------------------");
        System.out.println(sudhan.employeeName);


    }
}
