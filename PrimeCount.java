class PrimeCount {
    
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
      
    static int primeCount(int a, int b){
        int counter = 0;
        for(int i = a; i <= b; i++) {
            if(isPrime(i)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
       
    }
}