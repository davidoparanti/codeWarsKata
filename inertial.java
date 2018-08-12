import  java.util.Arrays;
class inertial {

    static int inertial(int[] array) {
        int eveIndex = 0;
        int oldIndex = 0;
        int isInertial = 0;
        
        Arrays.sort(array);
        
        int countEven = 0;
        int countOld = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                 countEven++;
            }
            else {
                countOld++;
            }
        }
        int[] even = new int[countEven];
        int[] old = new int[countOld];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                even[eveIndex] = array[i];
                eveIndex++;
            }
            else{
                old[oldIndex] = array[i];
                oldIndex++;
            }
        }
       
        if(even.length > 0 && old.length > 0 ){
            if(even[even.length - 1] > old[old.length - 1]) {
                if(even.length == 1) isInertial = 1;
                else{
                    for(int i = 0; i < even.length - 1; i++){
                        for(int j = 0; j < old.length - 1; j++){
                            if( even[i] < old[j]) break;
                            else isInertial = 1;
                        }
                    }
                }
            }

        }

       return isInertial; 

    }

    public static void main (String[] args){
		int[] result = {1,1,1,1,1,1,2};
		System.out.println(inertial(result));
		
	}
}

// let isInertial = arr => {
//   var max = Math.max(...arr);
//   var odds = arr.filter(e => e % 2 != 0);
//   var evens = arr.filter(e => e % 2 == 0 && e != max);
//   return arr.some(e => e % 2 != 0) && max % 2 == 0 && odds.every(o => evens.every(e => e <= o));
// }