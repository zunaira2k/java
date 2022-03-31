package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;


public class Test {

    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        Saxophone s = new Saxophone();
        s.play();
        Playable v1 = new Veena();
        v1.play();
        Playable s1 = new Saxophone();
        s1.play();
    }
    
    
}
