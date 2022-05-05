public class QuadSolver{

  public static void quadSolver(double a, double b , double c){
    
    double delta = Math.pow(b, 2) - 4*a*c;  
    if(delta < 0 ){
      System.out.println("NO SOLUTIONS");
    }
    else{
    double ans1 = (-b +Math.sqrt(delta))/(2*a);
    double ans2 = (-b - Math.sqrt(delta))/(2*a);   

    System.out.println("" + ans1 + " , " + ans2);

    }
    
    
    
  }
  
}