package Main;

import binaer.ToBinaer;
import hex.Hex;

public class Main {
    public Main(){
        ToBinaer tb =  new ToBinaer();
        Hex hex =  new Hex();
        String hexNum = hex.toHex(3984672);
        String binear = tb.tobinaer(1236);

        System.out.println( "1236 in binär: " + binear);
        System.out.println("3984672 in hex: " + hexNum);
    }
    public static void main(String[] args) {
        new Main();
    }
}
