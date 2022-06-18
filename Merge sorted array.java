//Merge sorted array

class Solution {
    public void merge(int[] arr, int m, int[] nums, int n) {
        
		// replacing 0's of first array with 2nd array elements
        int a = m;
        int b = 0;
        while(a<arr.length && b<n) {
            arr[a] = nums[b];
            a++;
            b++;
        }
		
		// Now we have a array consists of 2 sorted parts
		// in such cases we can use shell sort using gap method
        
		// x is known as gap
        int x;
        if((m+n) % 2 == 0) {
            x = (m+n)/2;
        } else {
            x = (m+n)/2 + 1;
        }
        
        while(x>0) {
            int i = 0;
            int j = x;
            while(j<m+n) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j++;
            }
            if(x==1) break;
            if(x % 2 == 0) {
                x = x/2;
            } else {
                x = x/2 + 1;
            }
        }
    }
}