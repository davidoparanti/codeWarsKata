class Nupcount {
    
    static int nUpcount(int[] array, int n) {
        int count = 0;
        boolean toggled = false;
        int sum = 0;
        for(int i = 0, length = array.length; i < length; i++) {
            sum += array[i];
            if(sum >= n && toggled == false){
                 count++;
                 toggled = true;
            }else if(sum < n) {
                toggled = false;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        int[] arr = {2,3,1,-6,8,-3,-1,2};
        System.out.println(nUpcount(arr, 6));
    }
}