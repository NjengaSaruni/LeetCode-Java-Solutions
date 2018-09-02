import java.util.HashMap;

class P1EasyTwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            Integer indexInHashMap = hm.get(complement);

            if(indexInHashMap == null){
                hm.put(nums[i], i);
            }else{
                answer[0] = indexInHashMap;
                answer[1] = i;
                return answer;
            }
        }

        return nums;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 6, 4, 9, 11, 14};
        int[] answer = P1EasyTwoSum.twoSum(nums, 25);
        System.out.print("[" + answer[0] + ", ");
        System.out.print(answer[1] + "]");
    }
}