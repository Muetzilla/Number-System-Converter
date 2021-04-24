package numbersytems;

public class NumbersystemFromIntToString {
    public String numbersystemIntToString(int numbersystemAsInt)
    {
        switch (numbersystemAsInt){
            case 1:
                return "decimal system";
            case 2:
                return "hexadecimal system";
            case 3:
                return "binary system";
            case 4:
                return "ocatl system";
            default:
                throw new RuntimeException("Invalid source system " + numbersystemAsInt);

        }
    }
}
