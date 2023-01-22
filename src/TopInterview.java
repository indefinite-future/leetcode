public class TopInterview {
    //Q.1 Two Sum
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

    //Q.13 Roman to Integer
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int[] nums = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];

        }
        return sum + nums[nums.length - 1];
    }

//    public String longestCommonPrefix(String[] strs) {
//        String res = "";
//        for (int i = 0; i < strs.length; i++) {
//            String a = strs[i];
//            for (int j = 0; j < strs[i].length(); j++) {
//                char temp = a.charAt()
//                if ( char temp = strs. char )
//            }
//        }
//    }

    //Q.344 Reverse String
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp =  s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        TopInterview sol = new TopInterview();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(input);
    }

}
