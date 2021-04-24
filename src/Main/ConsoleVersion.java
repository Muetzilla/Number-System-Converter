package Main;

import numbersytems.*;

import java.util.Scanner;

public class ConsoleVersion {

    public ConsoleVersion(){
        interaction();
    }

    private void interaction() {
        Scanner scanner = new Scanner(System.in);
        boolean continueB = true;
        int inputFrom = 0;
        int inputTo = 0;
        String input = "";
        FromToNumbersystems ftns = new FromToNumbersystems();
        do{
            inputFrom = getInputFrom(scanner);
            input = getInput(scanner);
            try{
                Numbersystem sourceNumbersystem = ftns.makeNumbersystems(inputFrom, input);
                inputTo = getInputTo(scanner);
                String result = ftns.toTarget(inputTo, sourceNumbersystem);
                System.out.println(input + " in the " + ftns.toString() + " is " +  result + " in the " + ftns.numbersystemIntToString(inputTo));
            }catch(NumberFormatException e){
                System.out.println(input + " is not a valid input for " + ftns.toString() + "! Please try again.");

            }


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
        System.out.print("Wählen Sie das Zahlensystem, in dem Sie die Eingabe machen:\n" +
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
        new ConsoleVersion();
    }
}