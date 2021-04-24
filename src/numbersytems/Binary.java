package numbersytems;

public class Binary implements Numbersystems{

    private final int number;

    public Binary(String binaryString){
        this.number = Integer.parseInt(binaryString, 2);
    }

    public String toBinary(){
        String binr = Integer.toBinaryString(number;
        return binr;
    }
}
