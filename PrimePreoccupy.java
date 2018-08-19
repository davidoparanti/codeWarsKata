class PrimePreoccupy {
     static int isPrime(int n) {
        if(n <= 1) return 0;
        if(n == 2){
            return 1;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return 0;
        }
        return 1;
    }

   static int primePreoccupy(int n) {
        int number = 0;
       for(int i = n; i < Integer.MAX_VALUE; i++) {
           if(isPrime(i) == 1) {
              if(i % 10 == 9){
                  number = i;
                  break;
              };
           }
       }
       return number;
   }
  
   public static void main(String[] args) {
       System.out.println(primePreoccupy(38));
   }
}