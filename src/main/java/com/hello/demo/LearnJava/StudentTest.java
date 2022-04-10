package com.hello.demo.LearnJava;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for(int i = 0; i < 10; i++){
            Student student = new Student("name" + i, i%2==0 ? 18: 19, (byte)(i%2), "Rosaline" + i +"@163.com", "China");
            students[i] = student;
        }

        String name = "name";
        boolean hasFind = false;
        for(Student student : students){
            if(student.getName().equals(name)){
                hasFind = true;
                System.out.println("Got it: name = " + student.getName() + ", Age: " + student.getAge() + ", Gender: " + student.getGender() + ", Email: " + student.getEmail());
                break;
            }
        }
        if(!hasFind){
            System.out.println("Sorry, not found");
        }
    }
}
