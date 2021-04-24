package numbersytems;

public class Hex implements Numbersystems{
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
            String binary = binaryClass.tobinaer(dec);
            return binary;
        }
}
