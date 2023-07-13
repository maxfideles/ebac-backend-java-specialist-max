import java.util.Scanner;

public class Media {
    private final Scanner s = new Scanner(System.in);
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private String status;

    /**
     * Realiza a coleta das 4 notas
     *
     */
    private void setNotas(){

        System.out.println("Entre com a primeira nota:");
        this.nota1 = s.nextFloat();

        System.out.println("Entre com a segunda nota:");
        this.nota2 = s.nextFloat();

        System.out.println("Entre com a terceira nota:");
        this.nota3 = s.nextFloat();

        System.out.println("Entre com a quarta nota:");
        this.nota4 = s.nextFloat();
    }

    public float getNota1(){
        return nota1;
    }

    public float getNota2(){
        return nota2;
    }

    public float getNota3(){
        return nota3;
    }

    public float getNota4(){
        return nota4;
    }

    public String getStatus(){
        return status;
    }
    /**
     *
     * @return A média das 4 notas
     */
    public float calculaMedia(){
        float media;
        String continuar = "";


        do{
            setNotas();
            media = (nota1+nota2+nota3+nota4)/4;

            if(media >= 7 && media <= 10){
                this.status = "aprovado! \uD83D\uDE0A";
                System.out.println("Média: " + media);
                System.out.println("Aluno "+status);

            } else if (media >= 5 && media < 7){
                this.status = "em recuperação! \uD83D\uDE05";
                System.out.println("Média: " + media);
                System.out.println("Aluno "+status);

            } else if (media > 0 && media < 5 ) {
                this.status = "reprovado!!! \uD83D\uDE15";
                System.out.println("Média: " + media);
                System.out.println("Aluno "+status);
            }

            System.out.println("Deseja calcular novamente? (Sim/Não)");
            continuar = s.next();

        }while(continuar.equalsIgnoreCase("Sim"));

        return media;
    }

}
