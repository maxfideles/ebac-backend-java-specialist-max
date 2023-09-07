package br.com.max;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class clazz = AnClass.class;

        Annotation[] annotations = clazz.getDeclaredAnnotations();

        for(Annotation a: annotations){
            System.out.println(a);
        }

    }
}
