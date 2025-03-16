public class Tranpose {
   static void matrics(int mat[][]){
    // int row=mat.length;
    // int col=mat[0].length;
    // int transpose;
    int tranpose[][]=new int[2][3];
for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++)
        tranpose[j][i]=mat[i][j];
    }
}
   
    public static void main(String[] args) {
        int mat[][]={{7,8,9},{4,5,6}};
       int mm=matrics(mat);
    }
}