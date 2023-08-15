public class Main {
    public static void main(String[] args) {
//       Given n = 7.You have to print the output as given below.
//                *   *   *   *   *   *   *
//                *   *   *       *   *   *
//                *   *               *   *
//                *                       *
//                *   *               *   *
//                *   *   *       *   *   *
//                *   *   *   *   *   *   *
        int n = 7;
        int space = 0;
        for(int i = 0;i < n; i++){
            for(int j = 0; i <= n / 2 && j <= n / 2 - i; j++){
                System.out.printf("*\t");
            }
            for(int s = 0;i <= n / 2 && s < space - 1;s++){
                System.out.printf("\t");
            }
            if(i == 0) {
                for (int j = 0; i < n / 2 && j < n / 2; j++) {
                    System.out.printf("*\t");
                }
            }else {
                for (int j = 0; i <= n / 2 && j <= n / 2 - i; j++) {
                    System.out.printf("*\t");
                }
            }
            for(int j = 0; i > n / 2 && j <= i - n /2 ; j++){
                System.out.printf("*\t");
            }
            for(int s = space - 1;i > n / 2 && s > 0;s--){
                System.out.printf("\t");
            }
            if(i < n - 1) {
                for (int j = 0; i > n / 2 && j <= i - n / 2; j++) {
                    System.out.printf("*\t");
                }
            }else{
                for (int j = 0; i > n / 2 && j < i - n / 2; j++) {
                    System.out.printf("*\t");
                }
            }
            if(i < n / 2) {
                space += 2;
            }else {
                space -= 2;
            }
            System.out.println();
        }
    }
}