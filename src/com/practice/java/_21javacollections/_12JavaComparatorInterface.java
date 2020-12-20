package com.practice.java._21javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _12JavaComparatorInterface {

    public static void main(String[] args) {

        ArrayList<Employee> employeesList=new ArrayList<Employee>();
        employeesList.add(new Employee(1, "Ram", "VP", "Engineering"));
        employeesList.add(new Employee(3,"Shayam","Engineer", "IT"));
        employeesList.add(new Employee(2,"Karan","Manager","IT"));
        employeesList.add(new Employee(4,"Arjun","lead", "Operations"));

        System.out.println("Sorting by Id");

        Collections.sort(employeesList,new IdComparator());
        for(Employee employee: employeesList){
            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDesignation()+ " " + employee.getDepartment());
        }

        System.out.println("Sorting by Name");

        Collections.sort(employeesList,new NameComparator());
        for(Employee employee: employeesList){
            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDesignation()+ " " + employee.getDepartment());
        }

        System.out.println("Sorting by Designation");

        Collections.sort(employeesList,new DesignationComparator());
        for(Employee employee: employeesList){
            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDesignation()+ " " + employee.getDepartment());
        }

        System.out.println("Sorting by Department");

        Collections.sort(employeesList,new DepartmentComparator());
        for(Employee employee: employeesList){
            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDesignation()+ " " + employee.getDepartment());
        }
    }
}

class Employee {

    private long id;
    private String name;
    private String designation;
    private String department;

    public Employee(long id, String name, String designation, String department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class IdComparator implements Comparator{

    @Override
    public int compare(Object objectOne, Object objectTwo) {

        Employee employeeOne = (Employee) objectOne;
        Employee employeeTwo = (Employee) objectTwo;

        if(employeeOne.getId()==employeeTwo.getId())
            return 0;
        else if(employeeOne.getId()>employeeTwo.getId())
            return 1;
        else
            return -1;
    }
}


class NameComparator implements Comparator{

    @Override
    public int compare(Object objectOne, Object objectTwo) {

        Employee employeeOne = (Employee) objectOne;
        Employee employeeTwo = (Employee) objectTwo;

        return employeeOne.getName().compareTo(employeeTwo.getName());
    }
}

class DesignationComparator implements Comparator{

    @Override
    public int compare(Object objectOne, Object objectTwo) {

        Employee employeeOne = (Employee) objectOne;
        Employee employeeTwo = (Employee) objectTwo;

        return employeeOne.getDesignation().compareTo(employeeTwo.getDesignation());
    }
}
class DepartmentComparator implements Comparator{

    @Override
    public int compare(Object objectOne, Object objectTwo) {

        Employee employeeOne = (Employee) objectOne;
        Employee employeeTwo = (Employee) objectTwo;

        return employeeOne.getDepartment().compareTo(employeeTwo.getDepartment());
    }
}
