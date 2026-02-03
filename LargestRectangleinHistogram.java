class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {

   
        int max = 0;
        int n = heights.length;
        for (int i = 0; i < heights.length; i++) {
            int psei = i;   //previous smaller element index
            while (psei >= 0 && heights[psei] >= heights[i])
            psei--;
            int nsei = i;    //next smaller element index
            while(nsei < n && heights[nsei] >= heights[i])
            nsei++;
            int w = nsei - psei - 1;
            int h = heights[i];
            int area = w * h;
            if(max < area) max = area;
        }
        return max;
    }
}