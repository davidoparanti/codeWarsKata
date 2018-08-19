class Centered15 {
    static int isCentered15(int[] a) {
        int mid = a.length / 2;
        int right = mid + 1;
        int left = mid - 1;
        int isCenter = 0;
        int sum = a[mid];

        for(int i = 0; i < a.length / 2; i++) {
            if (sum == 15) {
                isCenter = 1;
                break;
            }
            else{
                sum += a[right] + a[left];
                right++;
                left--;
            }
        }
        return isCenter;

    }


    public static void main(String[] args) {
        int[] arr = {2,10,4,1,6, 9};
        
        System.out.println(isCentered15(arr));
        
    }
}