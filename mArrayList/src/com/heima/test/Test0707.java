package com.heima.test;

/**
 * @author shkstart
 * @create 2022-07-07-14:14
 */
public class Test0707 {

    public static void main(String[] args) {
        A a=new A() {
            @Override
            public A method() {
                System.out.println("这是一个匿名内部类");


                return null;
            }
        }.method();

        new B(){
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        }.method();



    }
}

class B{
    public void method(){
        System.out.println("这是"+getClass());
    }
}
