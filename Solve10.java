import java.util.Arrays;
class Solve10 {

    static int factoria(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factoria(n - 1);
    }

    static int[] solve10(){
        int fac10[] = new int[2];
        
        for(int x = 0; x < 10; x++) {
            for(int y = 1; y < 10; y++){
                if( (factoria(x) + factoria(y)) == factoria(10)){
                    fac10[0] = x;
                    fac10[1] = y;
                    break;
                }
            }
        }
        return fac10;
        
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve10()));
       

        
    }
}