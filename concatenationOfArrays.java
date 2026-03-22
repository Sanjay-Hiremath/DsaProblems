class concatenationOfArrays{
    public int[] getConcatenation(int[] nums) {


// Using rudimentry approach
    //     ArrayList <Integer> al1= new ArrayList<>();
    //     ArrayList <Integer> al2= new ArrayList<>();
    //     int [] ans= new int[2*nums.length];
    //     for(int i:nums){
    //         al1.add(i);
    //     }
    //     al2.addAll(al1);
    //     al2.addAll(al1);
    //     for(int i=0;i<ans.length;i++){
    //         ans[i]=al2.get(i);
    //     }
    //     return ans;


// Using 2 while loops approach
    //     int ans[]=new int[2*nums.length];
    //     int i=0;
    //     while(i!=nums.length){
    //         ans[i]= nums[i];
    //         i++;
    //     }
    
    //      i=0;
    //      while(i!=nums.length){
    //          ans[nums.length+i]= nums[i];
    //          i++;
    //       }
    //       return ans;


// using System.arrayCopy() method
        // int []res= new int[nums.length*2];
        // System.arraycopy(nums,0,res,0,nums.length);
        // System.arraycopy(nums,0,res,nums.length,nums.length);
        // return res;
    
    return new int[0];
    }
}