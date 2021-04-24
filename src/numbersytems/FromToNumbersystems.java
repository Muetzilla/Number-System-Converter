package numbersytems;

public class FromToNumbersystems {
    public Numbersystemsinterface makeNumbersystems(int sourceSystem, String input) {
        switch (sourceSystem) {
            case 1:
                return new Decimal(input);
            case 2:
                return new Hexadecimal(input);
            case 3:
                return new Binary(input);
            case 4:
                return new Octal(input);
            default:
                throw new RuntimeException("Invalid source system " + sourceSystem);
        }
    }

    public String toTarget(int targetSystem, Numbersystemsinterface numbersystems) {
        switch (targetSystem) {
            case 1:
                return numbersystems.toDecimal();
            case 2:
                return numbersystems.toHexadecimal();
            case 3:
                return numbersystems.toBinary();
            case 4:
                return numbersystems.toOctal();
            default:
                throw new RuntimeException("Invalid target system " + targetSystem);
        }
    }
}
