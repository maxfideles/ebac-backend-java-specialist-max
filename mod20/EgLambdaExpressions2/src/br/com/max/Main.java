package br.com.max;

import org.w3c.dom.events.MutationEvent;

public class Main {

    public static void main(String[] args) {

        // 3 ways to declare Lambda Expression
        MyEventConsumer myEvent = (Object obj) ->{
            System.out.println(obj);
        };

        MyEventConsumer myEvent2 = (obj) ->{
            System.out.println(obj);
        };

        MyEventConsumer myEvent3 = obj -> System.out.println(obj);
        myEvent3.consumer("Hello World!");

        //Reference of Method
        MyEventConsumer myEvent4 = System.out::println;


    }

}
