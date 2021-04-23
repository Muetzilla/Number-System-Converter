package Main;

import binaer.ToBinaer;

public class Main {
    public Main(){
        ToBinaer tb =  new ToBinaer();
        String binear = tb.tobinaer(10);
        System.out.println(binear);
    }
    public static void main(String[] args) {
        new Main();
    }
}
