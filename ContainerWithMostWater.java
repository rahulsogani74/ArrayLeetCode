public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int minHeight = Math.min(leftHeight,rightHeight);
            int length = right -1;
            int currentArea = minHeight * length;
            max = Math.max(max, currentArea);

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] height = {6,4,2,5,4,6,1,3,6};
        int max = maxArea(height);
        System.out.println(max);
    }
}

