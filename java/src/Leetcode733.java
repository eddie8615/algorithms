public class Leetcode733{
    public int[][] floodfill(int[][] image, int sr, int sc, int color){
        int R = image.length, C = image[0].length;

        if(image[sr][sc] == color) return image;

        dfs(image, sr, sc);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color, int newColor){
        if(image[sr][sc] == color){
            image[sr][sc] = newColor;
            if(sr + 1 < image.length) dfs(image, sr + 1, sc, color, newColor);
            if(sc + 1 < image[0].length) dfs(image, sr, sc + 1, color, newColor);
            if(sr > 0) dfs(image, sr - 1, sc, color, newColor);
            if(sc > 0) dfs(image, sr, sc - 1, color, newColor);
        }
    }
}