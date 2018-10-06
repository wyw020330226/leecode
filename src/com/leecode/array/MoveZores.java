package com.leecode.array;

import java.util.HashMap;
import java.util.Map;

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
