package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyClassJavaDCRImplement implements MyClassJavaDCR{

    @Override
    public String saludar(String name) {
        return name + " Hola amigo";
    }
}
