
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()) {
            checkCorner();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   public void moveAround() {
    if (frontIsClear()) {
       move();
       turnLeft();
       move();
    }
    }
   public void checkCorner() {
       turnLeft(); //look at wall if there
       if (!frontIsClear()) {
           putBeeper();
           turnRight();
           if(!frontIsClear()) {
               turnRight();
               move();
            }
            else {
                move();
            }
       }
       else {
           moveAround();
        }
      
    }
}
