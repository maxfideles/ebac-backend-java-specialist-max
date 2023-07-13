public class Main {
    public static void main (String[] args){

        //declarando variavel de tipo primitivo
        long num1 = 777777777777L;
        System.out.println(num1);
        //Realizando o casting
        int num2 = (int) num1;
        //Convertendo para o tipo wrapper
        Integer num3 = (Integer) num2;
        System.out.println(num3);

    }
}
