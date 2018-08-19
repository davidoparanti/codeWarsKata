class RepEqual {



    static int repEqual(int[] a, int n) {
        int index = a.length - 1;
        int repE = 1;
        for (int i = index ; i >= 0; i--) {
              if( n % 10 == a[i] ){
                n = n / 10;
              }
              else{
                  repE = 0;
                  break;
              }
            
        }
        return repE;
    }


    public static void main(String[] args) {
        int[] a = {0,3,2,0,5,3};
        System.out.println(repEqual(a, 32053));
        
    }
}