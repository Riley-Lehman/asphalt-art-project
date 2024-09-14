import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  
    MuralPainter blue = new MuralPainter();
  TreePainter bark = new TreePainter();
   
  blue.paintBackground("lightblue",32);  
   blue.paintDetails("gold", 32);
   bark.paintSetUp("brown");
 bark.paintTrunk("brown");
   bark.paintRoots("brown");
 bark.paintBranches("brown");
    bark.paintSwing("#857655");
  }
}