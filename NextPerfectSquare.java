class NextPerfectSquare {

    static int isPerfectSquare(int n) {
        int nextPerfectSquare = 0;
        if(n >= 0) {
            int nSquare = (int) Math.sqrt(n);
            int nextSquare = nSquare + 1;
            nextPerfectSquare = nextSquare * nextSquare;
           
        }
         return nextPerfectSquare;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }
}