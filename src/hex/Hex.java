package hex;

import binaer.ToBinaer;

public class Hex {
        public String toHex(int dec){
            String hex = Integer.toHexString(dec);
            return hex;
        }
        public int hexToDec(String hex){
            int dec = Integer.parseInt(hex, 16);
            return dec;
        }
        public String hexToBinar(String hex){
            ToBinaer tob = new ToBinaer();
            int dec = hexToDec(hex);
            String binr = tob.tobinaer(dec);
            return binr;
        }
}
