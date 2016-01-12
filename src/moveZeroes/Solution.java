package moveZeroes;
public class Solution {
	public void moveZeroes(int[] nums){
		int movestep=0;
		for (int i=0;i<nums.length;){
			if(nums[i]==0){
				i++;
				movestep=movestep+1;
				continue;
			}
			else if (nums[i]!=0){
				nums[i-movestep]=nums[i];
				i++;
				continue;
				}
			}
			for(int i=nums.length;i>nums.length-movestep;movestep--)
				nums[nums.length-movestep]=0;
		}
	}