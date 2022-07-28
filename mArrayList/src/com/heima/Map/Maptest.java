package com.heima.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-07-07-10:18
 */
public class Maptest {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        Student s1=new Student("张继涛",25);
        Student s2=new Student("张继涛",24);
        Student s3=new Student("曾子澳",23);
        Student s4=new Student("袁星",24);

        map.put(s1,"0001");
        map.put(s2,"0002");
        map.put(s3,"0003");
        map.put(s4,"0004");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for(Map.Entry<Student,String>  i:entries){
            Student key = i.getKey();
            String value = i.getValue();
            System.out.println(key.getName()+" "+ key.getAge()+":"+value);
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
