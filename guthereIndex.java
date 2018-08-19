class gutherieIndex {


    static int gutherieIndex(int n) {
        int index = 0;
        for(;;) {
            if(n == 1) return index;
            else if(n % 2 == 0) {
              n /= 2;
              index++;
            }
            else {
               n = n * 3 + 1; 
               index++
            }
              
            }
        }


    public static void main(String[] args) {
        System.out.println(gutherieIndex(0));
        System.out.println(gutherieIndex(1));
        System.out.println(gutherieIndex(2));
        System.out.println(gutherieIndex(3));
        System.out.println(gutherieIndex(4));
        System.out.println(gutherieIndex(42));
    }

    }
