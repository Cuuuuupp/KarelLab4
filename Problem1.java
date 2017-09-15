
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        move();
        move();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        
    }
    public void checkRoom() {
        while (!frontIsClear()) {
            turnRight();
            move();
        }
        while (frontIsClear()) {
            turnLeft();
            if (frontIsClear()) {
            move();
            move();
            turnOff();
        }else{
            turnRight();
            move();
        }
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}



