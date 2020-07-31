package com.fxs.leetcode;

/**level: simple
 * example:
 *  输入：nums = [0, 2, 3, 4, 5]
 *  输出：0
 *  说明: 0下标的元素为0
 *  desc: if nums[i] == i return i else :return -1
 *  暴力遍历法
 * @author hjfeng
 * @date 2020--07--31  21:31
 */
public class FindMagicIndex {
    public int findMagicIndex(int[] nums) {
        if (nums == null || nums.length == 0){
            return -1;
        }

        int i = 0;
        while (i < nums.length){
            if (nums[i] == i){
                return i;
            }
            if(nums[i]> i){
                i = nums[i];
            }else{
                i++;
            }
        }

        return -1;

    }
}
