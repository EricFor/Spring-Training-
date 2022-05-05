public class DriveTrain extends SubSystem{
// will have some sort of specific fields depending on classes
double drivePower;
//DriveTrain constructor needs to take in a gamepad object as an parameter 
public DriveTrain(GamePad gamepad){
  this.gamepad = gamepad;    
}
  
public void init(){
    //will only work on startup (when called)
    System.out.println("System starts ");
  }
  
  public void update(){
    //once called will run code after a certain amount of time passed
    System.out.println("System updating");
  }
  /* public DriveTrain(){
    this.init = init
    } 

public void init(){
  this.gamepad = newGamepad();
}
*/
}