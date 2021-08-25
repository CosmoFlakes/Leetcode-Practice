package com.arrays;

public class _2_RemoveDuplicatesFromSortedArray {

	public static int removeDuplicate(int[] nums)
	{
		int l=nums.length-1;
		int count=0;
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i-1]==nums[i])
			{
				count=l--;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,1,2,3,4,4,8,9,9};
		System.out.println(_2_RemoveDuplicatesFromSortedArray.removeDuplicate(a));

	}

}
