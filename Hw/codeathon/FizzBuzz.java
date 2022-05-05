public class FizzBuzz{

  public static void fizzBuzz(int startCount, int end ){

      while(!(startCount == end)){
  
        if(startCount % 3 == 0 && startCount % 5 == 0){
          System.out.println("FizzBuzz");
          startCount++;
        }      
        else if(startCount % 3 == 0 && ! (startCount % 5 == 0)){
          System.out.println("Fizz");
          startCount++;
        }
        else if(!(startCount % 3 == 0) && startCount % 5 ==0){
        System.out.println("Buzz");
          startCount++;
      }
        else{
          System.out.println(startCount);
          startCount++;
        }

        
  }
}
}