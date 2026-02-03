public class TrappingRainWater  {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int rightmax = height[right];
        int leftmax = height[left];
        int total_water = 0;

        while (left < right ) {
            if (leftmax < rightmax) {
                left++;
                leftmax = Math.max(leftmax, height[left]);
                total_water += leftmax - height[left];
            }
            else {
                right--;
                rightmax = Math.max(rightmax, height[right]);
                total_water += rightmax - height[right];
            }
        }
        return total_water;
    }
} 
    
