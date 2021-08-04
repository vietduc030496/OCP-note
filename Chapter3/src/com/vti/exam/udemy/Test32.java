package com.vti.exam.udemy;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author duc.nguyenviet
 *
 * Question 32
 */
public class Test32 {

	public static void main(String[] args) {
		Set<Student2> students = new TreeSet<>(Student2::compareByName);
		students.add(new Student2("James", 20));
		students.add(new Student2("James", 20));
		students.add(new Student2("James", 22));
		
		System.out.println(students.size());
	}

}

class Student2 {
    private String name;
    private int age;
 
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public int hashCode() {
        return name.hashCode() + age;
    }
 
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
 
    public boolean equals(Object obj) {
        if(obj instanceof Student2) {
            Student2 stud = (Student2)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }
 
    public String getName() {return name;}
 
    public int getAge() {return age;}
 
	public static int compareByName(Student2 s1, Student2 s2) {
        return s1.getName().compareTo(s2.getName());
    }
}