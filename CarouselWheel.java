public class CarouselWheel extends SubSystem {
 

  final int RPM = 0;  //some constant   
  double drivePower;
public void init(){
    //will only work on startup (when called)
    System.out.println("System starts ");
  }
  
  public void update(){
    //once called will run code after a certain amount of time passed
    System.out.println("System updating");
  }

  
}