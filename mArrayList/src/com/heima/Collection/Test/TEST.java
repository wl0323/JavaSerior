package com.heima.Collection.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shkstart
 * @create 2022-07-06-19:41
 */
public class TEST {
    public static void main(String[] args) {
        Student s1=new Student("张继涛");
        Student s2=new Student("曾子澳");
        Student s3=new Student("梅舜钦");
        Collection<Student> c=new ArrayList<>();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> iterator=c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class  Student{
    String name;
    int id=1;

    public Student(String name) {
        id++;
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
