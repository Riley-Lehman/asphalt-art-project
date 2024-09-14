import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();
        paintLine(color, size);
        turnToEast();
    }
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
public void paintDetails (String color, int spaces) {
 PaintLine("green");
turnLeft();
  paint("green");
move();
turnLeft();
 PaintLine("green");
  turnRight();
  paint("green");
  move();
  turnRight();
  PaintLine("green");
  

  turnLeft();
  paint("green");
  move();
  turnLeft();
   PaintLine("orange");
turnRight();
  paint("orange");
move();
turnRight();
  PaintLine("orange");
  turnLeft();
  paint("orange");
  move();
  turnLeft();
  PaintLine("orange");

  
  turnRight();
  paint("orange");
move();
turnRight();
 PaintLine(color);
  turnLeft();
  paint(color);
  move();
  turnLeft();
  PaintLine(color);
  turnRight();
  paint(color);
  move();
  turnRight();
  PaintLine(color);
  paint(color);

   turnLeft();
  paint("lightpink");
move();
turnLeft();
 PaintLine("lightpink");
  turnRight();
  paint("lightpink");
  move();
  turnRight();
  PaintLine("lightpink");
  turnLeft(); 
  paint("lightpink");

move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();

turnLeft();
paint("black");
PaintLine("black");
turnLeft();
paint("black");
move();
turnLeft();
PaintLine("black");
paint("black");
turnRight();
move();
turnRight();
paint("black");
PaintLine("black");
paint("black");
  
turnLeft();
move();
turnLeft();
paint("purple");
PaintLine("purple");
paint("purple");
turnRight();
move();
paint("purple");
turnLeft();
PaintLine("purple");
turnRight();
paint("purple");
turnRight();
PaintLine("purple");
paint("purple");

turnLeft();
move();
paint("darkblue");
turnLeft();
PaintLine("darkblue");
paint("darkblue");
turnRight();
move();
paint("darkblue");
turnRight();
PaintLine("darkblue");
paint("darkblue");

turnLeft();
move();
paint("pink");
turnLeft();
PaintLine("pink");
paint("pink");
turnRight();
move();
paint("pink");
turnRight();
PaintLine("pink");
paint("pink");



  
  

  
  
  
}
  
  public void paintLine(String color, int spaces) {
    // setPaint(spaces);

    while (canMove()) {
      paint(color);
        move();
    }
      paint(color);
    
  }

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      if (canMove()){
      move();
        
      }
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
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