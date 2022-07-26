package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyDCRImplement  implements MyBeanWithDependencyDCR{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyDCRImplement.class);

    private MyClassJavaDCR myClassJavaDCR;

    public MyBeanWithDependencyDCRImplement(MyClassJavaDCR myClassJavaDCR) {
        this.myClassJavaDCR = myClassJavaDCR;
    }

    @Override
    public void printWithDependencyDCR() {
        LOGGER.debug("Hola este es mi nombre");
        String name = "Daniel";
        System.out.println(myClassJavaDCR.saludar(name));
        System.out.println("Hola desde mi implementación de un bean con dependencia DCR");
    }
}
