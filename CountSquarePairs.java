class CountSquarePairs {
    
    static int isPerfectSquare(int n) {
        int i = 1;
        while(true){
            if(n < 0)
                return 0;
            if(n == 0)
                return 1;

            n -= i;
            i += 2;
        }
    }
   
    static int countSquarePairs(int[] array){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] > 0 && array[j] > 0){
                    if(array[i] < array[j]){
                        if(isPerfectSquare(array[i] + array[j]) == 1){
                            counter++;
                        }
                    }
               }
            }
        }
        return counter;
    }
     
   
    
    public static void main(String[] args) {
        int [] arr = {11,5,4,20};
        System.out.println(countSquarePairs(arr));

        
    }



}