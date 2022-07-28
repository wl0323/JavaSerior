/**
 * @author shkstart
 * @create 2022-05-28-19:30
 */
public class test0000 {
    public static void main(String[] args) {
        Student[] arr=new Student[3];

        Student s1=new Student(23,"张继涛");
        Student s2=new Student(23,"袁星");
        Student s3=new Student(23,"曾子澳");
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for (int i = 0; i < 3; i++) {
            Student temp=arr[i];
            System.out.println(temp.getName()+" "+temp.getAge());
        }
    }


}
class Student{
    private  int age;
    private String name;

    public Student() {
    }

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
