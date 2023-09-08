package br.com.max;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main (String [] args){
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return (a + b);
        };

       intBinaryOperator.applyAsInt(3,4);

       Long number = calculate(2l,20l,(Long a1,Long a2)->{
           return (a1+a2);
       });
       System.out.println(number);

       new Thread(() -> System.out.println("Thread using lambda expression")).start();

    }

    private static Long calculate(Long a, Long b, BiFunction<Long,Long,Long> func){
        return func.apply(a,b);
    };
}
