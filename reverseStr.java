class StringReverse {
    static String reverseString(String s, int group) {
        
        // convert string to char array
        char[] arr = s.toCharArray();
        
        int n = arr.length;
        
        for (int m = 0; m < n; m += group) {
            int left = m;
            // when group is not a multiple of n
            int right = Math.min(m + group - 1, n - 1);
            // swap sub-arrays character positions
            while (left < right) {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        
        // convert back to string
        return new String(arr);
    }
    
    // testing
    public static void main(String[] args){
        String s = "Lorem at";
        int group = 4;
        System.out.println(reverseString(s, group));
    }
}
