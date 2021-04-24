package numbersytems;

public class Decimal extends Numbersystems {
    private final int number;

    public Decimal(String decimal){
        this.number = Integer.parseInt(decimal, 10);
    }


    @Override
    public int getInt() {
        return number;
    }
}
