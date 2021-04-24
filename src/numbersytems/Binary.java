package numbersytems;



public class Binary extends AbstractNumbersystem {

    private final int number;

    public Binary(String binaryString){
        this.number = Integer.parseInt(binaryString, 2);
    }

    @Override
    public int getInt() {
        return number;
    }
    @Override
    public String toString(){
        return "binary system";
    }
}
