package com.heima.SetTest;

/**
 * @author shkstart
 * @create 2022-07-06-14:33
 */
public class HashcodeTest {
    public static void main(String[] args) {
        Student s1=new Student(15,"wl");
        System.out.println(s1.hashCode());//460141958
        System.out.println(s1.hashCode());//460141958
    }
}
class Student{
    private  int age;
    private  String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
