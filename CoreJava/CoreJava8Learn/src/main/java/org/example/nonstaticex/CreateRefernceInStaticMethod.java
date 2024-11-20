package org.example.nonstaticex;

public class CreateRefernceInStaticMethod {
    static CreateRefernceInStaticMethod c ;
    static {
        System.out.println("In static block");
        c = CreateRefernceInStaticMethod.init();
    }
    static CreateRefernceInStaticMethod init(){
        return new CreateRefernceInStaticMethod();
    }

    public static void main(String[] args) {
        System.out.println(c);
    }
}
