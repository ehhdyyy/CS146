package homework.HW11.JavaVersion;

public class FloodFill {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        //Base Case, if starting pixel equals color, no changes are made
        if(image[sr][sc] == color){
            return image;
        }
        fill(image, sr, sc, image[sr][sc], color);      //Call recursive fill function
        return image;
    }

    public void fill(int[][]image, int sr, int sc, int color, int initialColor){
        //Base Case, if current position is out of bounds or the color is not equal to the initial color
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc]  != color){
            return;
        }
        image[sr][sc] = initialColor;       //Change pixel color to initial Color

        //Recursive calling 4-directionally pixels
        fill(image, sr - 1, sc, color, initialColor);
        fill(image, sr + 1, sc, color, initialColor);
        fill(image, sr, sc - 1, color, initialColor);
        fill(image, sr, sc + 1, color, initialColor);

    }

    public static void main(String[] args) {

        FloodFill x = new FloodFill();

        
        int[][]test = {{1,1,1},{1,1,0},{1,0,1}};
        int[][]test1 = {{0,0,0},{0,0,0},};

        //First test case
        System.out.println("Test Case 1:");
        System.out.println("Initial: ");
        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[0].length; j++){
                System.out.print("[" + test[i][j] + "] ");
            }
            System.out.println();
        }

        int[][] result = x.floodFill(test, 1, 1, 2);

        System.out.println("\nAfter Flood Fill: ");
        for(int i = 0; i < test1.length; i++){
            for(int j = 0; j < test1[0].length; j++){
                System.out.print("[" + result[i][j] + "] ");
            }
            System.out.println();
        }

        //Second test case
        System.out.println("\nTest Case 2:");

        System.out.println("Initial: ");
        for(int i = 0; i < test1.length; i++){
            for(int j = 0; j < test1[0].length; j++){
                System.out.print("[" + test1[i][j] + "] ");
            }
            System.out.println();
        }

        result = x.floodFill(test1, 0, 0, 0);

        System.out.println("\nAfter Flood Fill: ");
        for(int i = 0; i < test1.length; i++){
            for(int j = 0; j < test1[0].length; j++){
                System.out.print("[" + result[i][j] + "] ");
            }
            System.out.println();
        }




    }

}
