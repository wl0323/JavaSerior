package com.heima.SetTest;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author shkstart
 * @create 2022-07-06-15:46
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> hashSet=new HashSet<>();
        Person p1=new Person("wl");
        Person p2=new Person("zjt");
        Person p3=new Person("zza");
        Person p4=new Person("wl");
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        for (Person i:hashSet){
            System.out.println(i);
        }

    }
}
class  Person{
    String name;
    int id=1;


    public Person(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
