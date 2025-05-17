class Solution {
    public void sortColors(int[] nums) {
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0)
            {
                count1++;
            }else if (nums[i] == 1){
                count2++;
            }else
            count3++;
    }

    int index = 0;
    for (int i = 0 ; i < count1 ; i++){
        nums[index++] = 0;
    }
     for (int i = 0 ; i < count2 ; i++){
        nums[index++] = 1;
    }
     for (int i = 0 ; i < count3 ; i++){
        nums[index++] = 2;
    }
}

public class Main{
    public static void Main (String[] args){


        Solution solution = new Solution();
        int nums[] = {2,0,2,1,1,0};
        solution.sortColors(nums);

        for (int i = 0; i < nums.length; i++){

            System.out.print (nums[i] + " ");

     }
    }
}
}