package com.driver;

public class Main {
    public static void main(String[] args) {

        B obj = new B();


        System.out.println(obj.meth2());
        System.out.println(obj.meth());
    }

}

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    public String meth() {
        return "Invoking method from class B";
    }


    public String meth2() {
        return super.meth();
}
}