 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
    if (nextToABeeper()) {
        turnOff(); 
        }else{
        goInside();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
    }
}
    public void goInside() {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void checkRoom() {
        while (!frontIsClear()) {
            turnRight();
            move();
        }
        while (frontIsClear()) {
            turnLeft();
        
             if (frontIsClear()) {
            while(nextToABeeper()) {
                turnOff();
            }
            putBeeper();
            turnRight();
            move();
          }else{
            turnRight();
            move();
          }
        }
           
        }
}


