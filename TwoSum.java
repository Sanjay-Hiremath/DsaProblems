import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public static  ArrayList<Integer> twoSum(int nums[],int target){
        Map <Integer,Integer> hashMap = new HashMap<>();
        ArrayList <Integer> soln= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                soln.add(i);
                soln.add(hashMap.get(target-nums[i]));
            }hashMap.put(nums[i],i);
        }
        return soln;
    }

    public static void main(String[] args) {
            int nums[]={1,2,3,4};
            int target=3;
            ArrayList <Integer> soln=twoSum(nums, target);
            System.out.println(soln);
    
        }

}
