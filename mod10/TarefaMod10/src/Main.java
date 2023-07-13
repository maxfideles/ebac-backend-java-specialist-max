


public class Main {



    public static void main (String [] args){

        System.out.println("Calculadora de Média");
        Media media = new Media();
        float mediaFinal = media.calculaMedia();

        System.out.println("\nResumo:");
        System.out.println("Suas notas foram: "+media.getNota1()+", "+media.getNota2()+", "+media.getNota3()+" e "+ media.getNota4());
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Resultado: " + media.getStatus());
        System.out.println("\nObrigado por usar a nossa calculadora!");


    }

}
