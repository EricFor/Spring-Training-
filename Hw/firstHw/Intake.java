public class Intake extends SubSystem{


  double drivePower;
  @Override
  public void init(){
    //will only work on startup (when called)
    System.out.println("System starts ");
  }
  @Override
  public void update(){
    //once called will run code after a certain amount of time passed
    System.out.println("System updating");
  }
  
  
}