import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class arraySolution {

    //Q.1
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //Q.217
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //Q.242
    public String sortString(String i) {
        char[] tempArray = i.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    //Q.242
    public boolean isAnagram(String s, String t) {
        return Objects.equals(sortString(s), sortString(t));
    }



    //Q.49
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if (strs == null || strs.length == 0) return list;

        for (int i = 0; i < strs.length; i++) {

        }
        return list;
    }

    public static void main(String[] args) {
        arraySolution sol = new arraySolution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(strs));
        ;
    }
}
