package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyDCRImplement  implements MyBeanWithDependencyDCR{

    private MyClassJavaDCR myClassJavaDCR;

    public MyBeanWithDependencyDCRImplement(MyClassJavaDCR myClassJavaDCR) {
        this.myClassJavaDCR = myClassJavaDCR;
    }

    @Override
    public void printWithDependencyDCR() {
        String name = "Daniel";
        System.out.println(myClassJavaDCR.saludar(name));
        System.out.println("Hola desde mi implementación de un bean con dependencia DCR");
    }
}
