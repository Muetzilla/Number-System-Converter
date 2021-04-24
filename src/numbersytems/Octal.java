package numbersytems;

public class Octal extends AbstractNumbersystem {
    private final int number;

    public Octal(String octalString){
        this.number = Integer.parseInt(octalString, 8);
    }

    @Override
    public int getInt() {
        return number;
    }
    @Override
    public String toString(){
        return "octal system";
    }
}
