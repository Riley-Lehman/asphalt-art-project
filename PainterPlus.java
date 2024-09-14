import org.code.neighborhood.*;
public class PainterPlus extends Painter {
  public void turnRight(){
  turnLeft();
  turnLeft();
  turnLeft();
}

public void turnAround(){
  turnLeft();
  turnLeft();
}
  public void takeAllPaint(){
    while(isOnBucket()) {
      takePaint();
    }
  }
  public void PaintLine(String color){
  while(canMove()) {
  paint(color);
  move();
  }
  }
   public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
 }
}

