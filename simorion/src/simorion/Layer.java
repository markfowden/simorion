package simorion;
import java.io.Serializable;

//Can serializable only be applied to the array? probably a question for sprint 3 etc.
@author Tom Fullalove
public class Layer implements Serializable{
    boolean[][] dots;
    
    public Layer(){
        dots = new boolean[16][16];
    }
    
    @author Tom Fullalove
    public boolean toggleDot(int posx, int posy){
        if (dots[posx][posy])
        {
            dots[posx][posy] = false;
            return false;
        }
        else
        {
            dots[posx][posy] = true;
            return true;
        }
    }

    
    public void ClearDots(){
            dots = new boolean[16][16];
    }
}