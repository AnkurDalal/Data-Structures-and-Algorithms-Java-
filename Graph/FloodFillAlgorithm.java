package Graph;

public class FloodFillAlgorithm {
    public static void helper(int image[][],int sr,int sc,boolean vis[][],int orgColor){
        if (sr<0||sc<0||sr>=image.length||sc>=image[0].length||vis[sr][sc]||image[sr][sc]!=orgColor) {
            return;
        }
        helper(image, sr, sc-1, vis, orgColor);
        helper(image, sr, sc+1, vis, orgColor);
        helper(image, sr-1, sc, vis, orgColor);
        helper(image, sr+1, sc, vis, orgColor);
    }
    public static int [][]floodFill(int image[][],int sr,int sc,int color){
        boolean vis[][]=new boolean[image.length][image.length];
        helper(image,sr,sc,vis,image[sr][sc]);
        return image;
    }
        public static void main(String[] args) {
        
    }
}
