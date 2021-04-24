package numbersytems;

public class Octal extends Numbersystems {
    private final int number;

    public Octal(String octalString){
        this.number = Integer.parseInt(octalString, 8);
    }

    @Override
    public int getInt() {
        return number;
    }
}
