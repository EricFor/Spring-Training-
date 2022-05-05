public class SqrtCalc{
 
public static double sqrt(double n, int accuracy){

  
  double currentGuess = 1;

  for(int i =0; i< accuracy; i++){
    double newGuess = (currentGuess + n/currentGuess)/2;
    currentGuess = newGuess;
  
}
  return currentGuess;
  
  }
} 
}