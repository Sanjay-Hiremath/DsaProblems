class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=0;
        int soln[]=new int[nums.length];
        while(i!=nums.length){
            if(i%2==0){
                soln[i]=nums[j];
                i++;
            }else{
                soln[i]=nums[j+n];
                i++;
                j++;
            }
        }return soln;

  
    }

    }
}