package numbersytems;



public class Hexadecimal extends AbstractNumbersystem {
       /*
       public String toHex(int dec){

            String hex = Integer.toHexString(dec);
            return hex;
        }
        public int hexToDec(String hex){
            int dec = Integer.parseInt(hex, 16);
            return dec;
        }
        public String hexToBinary(String hex){
            Binary binaryClass = new Binary();
            int dec = hexToDec(hex);
            String binary = binaryClass.toBinary(dec);
            return binary;
        }

        */
    private final int number;

    public Hexadecimal(String hexadecimalString){
        this.number = Integer.parseInt(hexadecimalString, 16);
    }


    @Override
    public int getInt() {
        return number;
    }
    @Override
    public String toString(){
        return "hexadecimal system";
    }
}
