package com.leecode.array;

import java.util.HashMap;
import java.util.Map;
/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.*/


public class MoveZores {
	public static void main(String[] args) {

		int[] a = { 0,1 };
		moveZeroes1(a);
	}
	
	public static void moveZeroes1(int[] nums) {
		//记录最后一位非0数字的位置
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0)
			{
				nums[index++]=nums[i];
			}
		}
		
		for (int i = index; i < nums.length; i++) {
			nums[i]=0;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
	}

	/**
	 * 思路：hashmap 记录元素和下标位置
	 * 
	 * @param nums
	 */

	public static void moveZeroes(int[] nums) {

		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		int index = 0;
        
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				hashMap.put(index++, nums[i]);
			}
		}

		for (Integer key : hashMap.keySet()) {
			nums[key] = hashMap.get(key);
		}
		
		for (int i = index; i < nums.length; i++) {
			nums[i]=0;
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}

	}
}
