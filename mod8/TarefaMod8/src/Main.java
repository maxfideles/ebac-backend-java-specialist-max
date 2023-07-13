/**
 * @author maxvictor
 */

public class Main {
    public static void main (String args[]){

        Media media = new Media();
        media.setNota1(6.3f);
        media.setNota2(8.5f);
        media.setNota3(9.2f);
        media.setNota4(4.6f);

        float mediaFinal = media.calculaMedia();
        System.out.println("Nota 1: "+media.getNota1()+"\nNota 2: "+media.getNota2()+"\nNota 3: "+media.getNota3()+"\nNota 4: "+media.getNota4());
        System.out.println("\nMédia Final: " + mediaFinal);

    }
}
