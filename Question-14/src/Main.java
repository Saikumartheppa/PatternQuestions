public class Main {
    public static void main(String[] args) {
//     Given n = 5.You have print the output as given below.
//                                *
//                            *   *
//                        *   *   *
//                    *   *   *   *
//                *   *   *   *   *
//                    *   *   *   *
//                        *   *   *
//                            *   *
//                                *
         int n  = 5;
         int space = n - 1;
         int space2 = 0;
         int rowLength = 2 * n - 1;
         for(int i = 0; i < rowLength; i++){
             for(int s = 0; i < n && s < space; s++){
                 System.out.printf("\t");
             }
             for(int j = 0; i < n && j <= i; j++){
                 System.out.printf("*\t");
             }
             for(int s = 0; i >= n && s <= space2; s++){
                 System.out.printf("\t");
             }
             for(int j = i; i >= n && j < rowLength; j++){
                 System.out.printf("*\t");
             }
             if(i < n){
                 space--;
             }else{
                 space2++;
             }
             System.out.println();
         }
    }
}