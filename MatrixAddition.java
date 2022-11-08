public class MatrixAddition {
    public static void main(String[] args) {

        int [][] x= {{1,2,3},{2,3,4},{3,4,5}};
        int [][] y={{4,5,6},{5,6,7},{6,7,8}};

        int [][] c=new int[3][3];

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j]=x[i][j]*y[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

   }
}
