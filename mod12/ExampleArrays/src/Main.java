import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        String numbers;
        String[] numbersArray;
        int aux;

        System.out.println("Enter integers separated by comma: (E.g: 2,5,1)");
        numbers = s.nextLine();
        numbersArray = numbers.split(",");


        int[] numbersArrayInt = stringToInt(numbersArray);

        for(int i=0;i<numbersArrayInt.length;i++){
            for (int j=0;j<numbersArrayInt.length;j++){

                if(numbersArrayInt[j]>numbersArrayInt[i]){
                    aux = numbersArrayInt[i];
                    numbersArrayInt[i] = numbersArrayInt[j];
                    numbersArrayInt[j] = aux;

                }
            }
        }

        System.out.println("\nNumbers sorted:");
        for(int number: numbersArrayInt){
            System.out.println(number);
        }

    }

    /**
     *
     * @param array It's an String array
     * @return The array passed as parameter converted into int elements
     */
    public static int[] stringToInt(String[] array) {

        int[] arrayInt = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        return arrayInt;
    }

}
