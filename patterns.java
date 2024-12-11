public class patterns {
    public static void hollow_Rectangle(int totRow,int totCol){
        for(int i=1;i<=totRow;i++){
            for(int j=1;j<=totCol;j++){
                if(i==1 || i==totRow || j==1||j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void inverted_Rotatated_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void inverted_half_rotated_withNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void floydsTriangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_Triangle(int n){
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
           }
           System.out.println();
           
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                  System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                  System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solidRohmbus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void hollow_Rohombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        int n=4;
        for(int k=1;k<=n;k++){
            for(int l=1;l<=n-k+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        int m=4;
        for(int o=1;o<=m;o++){
            for(int p=1;p<=o;p++){
                System.out.print(p);
            }
        System.out.println();
        }

        hollow_Rectangle(4, 5);
        inverted_Rotatated_Pyramid(4);
        inverted_half_rotated_withNumber(5);
        floydsTriangle(5);
        zero_one_Triangle(5);
        butterfly(4);
        solidRohmbus(5);
        hollow_Rohombus(5);
        diamond(10);
        
    }
}