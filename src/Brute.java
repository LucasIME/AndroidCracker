/**
 * Created by meire on 29-May-17.
 */
public class Brute implements Runnable{

    String cyphertext;
    String key;
    int keyLength;

    public Brute(String key, String cyphertext){
        this.key = key;
        this.keyLength = key.length();
        this.cyphertext = cyphertext;
    }

    public void run(){
        System.out.println(this.key + " " + cyphertext.charAt(0));
    }
}
