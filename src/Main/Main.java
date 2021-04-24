package Main;

import numbersytems.*;

import java.util.Scanner;

public class Main {

    public Main(){
        inertaction();

        /*
        Binary tb =  new Binary();
        Hex hex =  new Hex();
        String hexNum = hex.toHex(3984672);
        String binear = tb.toBinary(1236);

        System.out.println( "1236 in binär: " + binear);
        System.out.println("3984672 in hex: " + hexNum);

         */
    }

    private void inertaction() {
        Scanner scanner = new Scanner(System.in);
        boolean continueB = true;
        int inputFrom = 0;
        int inputTo = 0;
        String input = "";
        NumbersystemFromIntToString nsIntToString = new NumbersystemFromIntToString();
        FromToNumbersystems ftns = new FromToNumbersystems();
        do{
            inputFrom = getInputFrom(scanner);
            input = getInput(scanner);
            try{
                Numbersystemsinterface sourceNumbersystem = ftns.makeNumbersystems(inputFrom, input);
                inputTo = getInputTo(scanner);
                String result = ftns.toTarget(inputTo, sourceNumbersystem);
                System.out.println(input + " in the " + nsIntToString.numbersystemIntToString(inputFrom) + " is " +  result + " in the " + nsIntToString.numbersystemIntToString(inputTo));
            }catch(NumberFormatException e){
                System.out.println(input + " is not a valid input for " + nsIntToString.numbersystemIntToString(inputFrom)+ "! Please try again.");

            }
            /*
            switch(inputFrom){
                    case 1:
                        try{
                            int dec = Integer.parseInt(input, 10);
                            System.out.println("Your decimal input is: " + dec);
                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(input + " is an invalid input in the decimal system! Please try again");
                        }
                        break;
                    case 2:
                        try{
                            int hex = Integer.parseInt(input, 16);
                            System.out.println("Your hexadecimal input is in the decimal system: " + hex);
                            System.out.println("Your hexadecimal input is: " + input);
                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(input + " is an invalid input in the hexadecimal system! Please try again");
                        }
                        break;
                    case 3:
                        try{
                            new Binary(input);
                            System.out.println("Your binary input is in the decimal system: " );
                            System.out.println("Your binary input is: " + input);
                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(input + " is an invalid input in the binary system! Please try again");
                        }
                        break;
                    case 4:
                        try{
                            int oct = Integer.parseInt(input, 8);
                            System.out.println("Your octal input is in the decimal system: " + oct);
                            System.out.println("Yout octal input is: " + input);

                            validInput = true;
                        }catch(NumberFormatException e){
                            System.out.println(input + " is an invalid input in the octal system! Please try again");

                        }
                        break;
                }
                */


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
}