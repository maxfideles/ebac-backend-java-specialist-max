package br.com.max.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Class clazz = Product.class;

        System.out.println(clazz);

        try{
            Constructor cons = clazz.getConstructor();
            // creating a new instance of an object
            Product prod1 = (Product) cons.newInstance();

            Field[] fields =  prod1.getClass().getDeclaredFields();
            for (Field f:fields){
                System.out.println(f.getType());
                System.out.println(f.getName());
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }


    }
}
