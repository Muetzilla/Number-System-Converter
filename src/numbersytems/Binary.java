package numbersytems;

import static java.lang.String.valueOf;

public class Binary extends Numbersystems {

    private final int number;

    public Binary(String binaryString){
        this.number = Integer.parseInt(binaryString, 2);
    }

    @Override
    public int getInt() {
        return number;
    }
}
