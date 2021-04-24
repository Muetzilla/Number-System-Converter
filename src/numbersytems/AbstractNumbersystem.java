package numbersytems;

public abstract class AbstractNumbersystem implements Numbersystem {
    @Override
    public String toBinary() {
        String binary = Integer.toBinaryString(getInt());
        return binary;
    }

    @Override
    public String toDecimal() {
        return String.valueOf(getInt());
    }

    @Override
    public String toOctal() {
        String octal = Integer.toOctalString(getInt());
        return octal;
    }

    @Override
    public String toHexadecimal() {
        String hexadecimal = Integer.toHexString(getInt());
        return hexadecimal;
    }
    public abstract int getInt();
}
