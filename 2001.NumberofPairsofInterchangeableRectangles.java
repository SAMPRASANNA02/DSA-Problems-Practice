import java.util.HashMap;
import java.util.Map;

class 2001.NumberofPairsofInterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        long ans = 0;
       
        Map<Double, Integer> ratioCount = new HashMap<>();

        for (int[] rect : rectangles) {
            double width = rect[0];
            double height = rect[1];
            double ratio = width / height;

            
            ans += ratioCount.getOrDefault(ratio, 0);
            
            
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0) + 1);
        }

        return ans;
    }
}
