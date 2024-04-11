class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var output = intArrayOf()
        for (i in 0..nums.lastIndex) {
            for (j in 1..nums.lastIndex) {
                if (i == j) break
                if (nums[i] + nums[j] == target) {
                    output += i
                    output += j
                    break
                }
            }
        }
        return output
    }
}