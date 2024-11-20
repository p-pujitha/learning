package org.example.nonstaticex;

public class CallNonStaticMethod {
    static {
        System.out.println("In static Method");
    }

    CallNonStaticMethod() {
        System.out.println("In constructor");
    }

    {
        System.out.println("In instance method");
    }
    public static void main(String[] args) {
        CallNonStaticMethod c = new CallNonStaticMethod();
        c.test();
    }
    public void test(){
        System.out.println("In instance method - test");
    }
}
