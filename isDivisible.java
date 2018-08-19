class isDivisible {
    static int isDivisible(int[] a, int divisor) {
        int divisible = 1;
        if(a.length == 0) return divisible;
        
        for(int i = 0; i < a.length; i++) {
            if( a[i] % divisor != 0){
                divisible = 0;
                break;
            }
        }
        return divisible;
    }

    public static void main(String[] args) {
        int[] arr = {6,12,24,36};
        System.out.println(isDivisible(arr, 12)); 
        
    }
}