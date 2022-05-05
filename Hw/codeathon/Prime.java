public class Prime{

    public static boolean isPrime(int num){
    boolean isPrime = false;
    int factors = 0;
    for(int i =1; i <= num; i++ ){
      if(num % i == 0){
        factors++;
      }
    }
    if(factors == 2){
      isPrime = true;
    }
    
    return isPrime;
  }
  public static void printPrimes(int amount){
    int count =0;
    for(int i = 0; i< amount; i++){
      while(!isPrime(count)){
        count++;    
     }
      System.out.println(count);
      count++;
      
    }
  }

}