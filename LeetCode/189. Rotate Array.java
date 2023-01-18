class Solution {
  /*
   * Let the array be - 123456789 and k = 4
   * 
   * Step 1 - 12345 6789 ---> 54321 6789
   * 
   * Step 2 - 54321 6789 ---> 54321 9876
   * 
   * Step 3 - 543219876 ---> 678912345
   */

  // test
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    Solution.rotate(nums, 2);
  }

  public static void rotate(int[] nums, int k) {

    if (nums.length <= 1) {
      return;
    }

    int p;
    if (nums.length < k)
      p = k%nums.length;
    else
      p = k;

    // devided nums into two arrs
    int[] first = new int[nums.length - p];
    int[] last = new int[p];

    int f, l;
    f = 0;
    l = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i < nums.length - p) {
        first[f++] = nums[i];
      } else {
        last[l++] = nums[i];
      }
    }

    // reverse arrays
    reverse(first);
    reverse(last);

    // conbine
    f = 0;
    l = 0;
    for (int a = 0; a < nums.length; a++) {
      if (a < nums.length - p) {
        nums[a] = first[f++];
      } else {
        nums[a] = last[l++];
      }
    }

    reverse(nums);

    // test print
    int length = nums.length;
    while (length-- > 0) {
      System.out.print(nums[nums.length - length - 1]);
    }

  }

  public static void reverse(int[] nums) {
    int length = nums.length;
    int iter = (int) length / 2;
    int f, l;
    f = 0;
    l = length - 1;
    while (iter-- > 0) {
      int tmp = nums[f];
      nums[f++] = nums[l];
      nums[l--] = tmp;
    }

  }
}
