package Main;

import numbersytems.Binary;
import numbersytems.Hex;
import numbersytems.Numbersystems;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
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
        int inputTo = 0;
        String inputBinOctHexDec = "";
        boolean validInput = false;
        do{
            inputFrom = getInputFrom(scanner);

                inputBinOctHexDec = getInput(scanner);
                switch(inputFrom){
                    case 1:
                        try{
                            int dec = Integer.parseInt(inputBinOctHexDec, 10);
                            System.out.println("Your decimal input is: " + dec);
                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(inputBinOctHexDec + " is an invalid input in the decimal system! Please try again");
                        }
                        break;
                    case 2:
                        try{
                            int hex = Integer.parseInt(inputBinOctHexDec, 16);
                            System.out.println("Your hexadecimal input is in the decimal system: " + hex);
                            System.out.println("Your hexadecimal input is: " + inputBinOctHexDec);
                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(inputBinOctHexDec + " is an invalid input in the hexadecimal system! Please try again");
                        }
                        break;
                    case 3:
                        try{
                            new Binary(inputBinOctHexDec);
                            System.out.println("Your binary input is in the decimal system: " + binr);
                            System.out.println("Your binary input is: " + inputBinOctHexDec);
                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(inputBinOctHexDec + " is an invalid input in the binary system! Please try again");
                        }
                        break;
                    case 4:
                        try{
                            int oct = Integer.parseInt(inputBinOctHexDec, 8);
                            System.out.println("Your octal input is in the decimal system: " + oct);
                            System.out.println("Yout octal input is: " + inputBinOctHexDec);

                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(inputBinOctHexDec + " is an invalid input in the octal system! Please try again");

                        }
                        break;
                }
                getInputTo(scanner);

            System.out.println("Ausgabe im gewünschten Zahlensystem...");
        }while(continueB);
    }

    private String getInput(Scanner scanner) {
        String inputBinOctHexDec;
        System.out.print("Geben Sie Ihre Zahl ein >");
        inputBinOctHexDec = scanner.nextLine();
        return inputBinOctHexDec;
    }

    private int getInputFrom(Scanner scanner) {
        int inputFrom;
        do{
        System.out.print("Wählen Sie das Zahlensystem, in dem Sie die Eingabe mache:\n" +
                "Dezimal: 1\n" +
                "Hexadedzimal: 2\n" +
                "Binär: 3\n" +
                "Octal: 4\n" +
                ">");
            inputFrom = scanner.nextInt();
            scanner.nextLine();
        }while (inputFrom > 4 || inputFrom < 1);
        return inputFrom;
    }

    public int getInputTo(Scanner scanner){
        int inputTo;
        do{
            System.out.print("Wählen Sie das Zahlensystem, in dem Sie die Ausgabe haben möchten:\n" +
                    "Dezimal: 1\n" +
                    "Hexadedzimal: 2\n" +
                    "Binär: 3\n" +
                    "Octal: 4\n" +
                    ">");
            inputTo = scanner.nextInt();
            scanner.nextLine();
        }while (inputTo > 4 || inputTo < 1);
        return inputTo;
    }

    public static void main(String[] args) {
        new Main();
    }

    private Numbersystems makeNumbersystems(int sourceSystem, String input) {
        switch (sourceSystem) {
            case 3:
                return new Binary(input);
            default:
                throw new RuntimeException("Invalid source system " + sourceSystem);
        }
    }

    private String toTarget(int targetSystem, Numbersystems numbersystems) {
        switch (targetSystem) {
            case 3:
                return numbersystems.toBinary();
            default:
                throw new RuntimeException("Invalid target system " + targetSystem);
        }
    }

}