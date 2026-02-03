class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max_consec = 0;
        int current_consec = 0;

        for (int num : nums) {
            if (num == 1) {

                current_consec++;
                max_consec= Math.max(max_consec, current_consec);
            }
            else {
                current_consec = 0;
            }
        }
        return max_consec;
    }
}