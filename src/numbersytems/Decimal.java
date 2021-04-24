package numbersytems;

public class Decimal extends AbstractNumbersystem {
    private final int number;

    public Decimal(String decimal){
        this.number = Integer.parseInt(decimal, 10);
    }


    @Override
    public int getInt() {
        return number;
    }
    @Override
    public String toString(){
        return "decimal system";
    }
}
