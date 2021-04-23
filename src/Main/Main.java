package Main;

import numbersytems.Binary;
import numbersytems.Hex;

import java.util.Scanner;

public class Main {
    Binary tb =  new Binary();
    Hex hex =  new Hex();  
    public Main(){
        inertaction();

        String hexNum = hex.toHex(3984672);
        String binear = tb.tobinaer(1236);

        System.out.println( "1236 in binär: " + binear);
        System.out.println("3984672 in hex: " + hexNum);
    }

    private void inertaction() {
        Scanner scanner = new Scanner(System.in);
        boolean continueB = true;
        int inputFrom = 0;
        int inputDec = 0;
        String inputBinOctHex = "";
        do{
            do{
            System.out.print("Wählen Sie das Zahlensystem, in dem Sie die Eingabe mache:\n" +
                    "Dezimal : 1\n" +
                    "Hexadedzimal: 2\n" +
                    "Binär: 3\n" +
                    "Octal: 4\n" +
                    ">");
                inputFrom = scanner.nextInt();
            }while (inputFrom > 4 || inputFrom < 1);
            System.out.print("Geben Sie Ihre Zahl ein >");
            if(inputFrom == 1){
                inputDec = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Your Decimal input: " +inputDec);
            }else{
                inputBinOctHex = scanner.nextLine();
                scanner.nextLine();
                System.out.println(inputBinOctHex);
            }

        }while(continueB);
    }

    public static void main(String[] args) {
        new Main();
    }
}
