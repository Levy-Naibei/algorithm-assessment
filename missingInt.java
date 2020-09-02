class MissingInt {
    /*
    @desc   k is the array, n is the number of array elements
    */
    static int findMissingInt(int k[], int n) 
    {
        int sum = 1;
        for (int i = 2; i <= (n + 1); i++){
            sum += i;
            sum -= k[i - 2];
        }
        return sum;
    }
 
    // testing
    public static void main(String[] args)
    {
        int[] k = { 3, 5, 4, 1 };
        int l = k.length;
        System.out.println(findMissingInt(k, l));
    }
}
