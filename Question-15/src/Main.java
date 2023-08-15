public class Main {
    public static void main(String[] args) {

//   Given n = 5.You have print the output as given below.
//                *   *   *   *   *
//                        *   *   *   *
//                                *   *   *
//                                        *   *
//                                               *
//                                        *   *
//                                *   *   *
//                        *   *   *   *
//                *   *   *   *   *

        int n = 5;
        int space = 0;
        int rowLength = 2 * n - 1;
        for(int i = 0; i < rowLength; i++){
            for(int s = 0; i < n && s < space;s++){
                System.out.printf("\t\t");
            }
            for(int j = 0; i < n && j < n - i; j++){
                System.out.printf("*\t");
            }
            for(int s = space - 2; i >= n && s > 0; s--){
                System.out.printf("\t\t");
            }
            for(int j = 0; i >= n && j <= i - n + 1; j++){
                System.out.printf("*\t");
            }
            if(i < n){
                space++;
            }
            else{
                space--;
            }
            System.out.println();
        }
    }
}