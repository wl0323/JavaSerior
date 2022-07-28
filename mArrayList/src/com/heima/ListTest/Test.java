package com.heima.ListTest;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-07-06-20:13
 */
public class Test {
    public static void main(String[] args) {
        Student s1=new Student("张继涛");
        Student s2=new Student("曾子澳");
        Student s3=new Student("梅舜钦");
         List<Student> c=new ArrayList<>();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> iterator=c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****************8");
        ListIterator<Student> listIterator=c.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        for(Student i:c){
            System.out.println(i);
        }
    }
}
class  Student{
    String name;
    int id=1;

    public Student(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}