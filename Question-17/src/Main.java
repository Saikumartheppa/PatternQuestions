import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     Given n = 7.You have to print the output as given below.
//                        *   *   *       *   *   *
//                        *   *               *   *
//                        *                       *
//
//                        *                       *
//                        *   *               *   *
//                        *   *   *       *   *   *
//        _______________________________________________________
//                Solution without using functions
//        _______________________________________________________

//        int n = 7,space = 1;
//        for(int i = 0; i < n; i++){
//            // for 1st half vertically
//            for(int  j = 0; i < n / 2 && j < n /2 - i; j++){
//                System.out.printf("*\t");
//            }
//            for(int  j = 0; i > n / 2 && j < i - n /2; j++){
//                System.out.printf("*\t");
//            }
//                //  for spaces
//            for(int s = 0; i < n/ 2 && s <= space; s++){
//                System.out.printf("\t");
//            }
//            for(int s = 0; i > n/ 2 && s <= space; s++){
//                System.out.printf("\t");
//            }
//            // for second half vertically
//            for(int  j = 0; i < n / 2 && j < n /2 - i; j++){
//                System.out.printf("*\t");
//            }
//            for(int  j = 0; i > n / 2 && j < i - n /2; j++){
//                System.out.printf("*\t");
//            }
//            if(i < n / 2){
//                space += 2;
//            }else{
//                space -= 2;
//            }
//            System.out.println();
//        }

//        _______________________________________________________
//                Solution without using functions
//        _______________________________________________________

        int n = 7,space = 1;
        for(int i = 0; i < n; i++) {
            // for 1st half
            if(i < n / 2)   printNumbers(i,n/2);
            if(i == n /2)   System.out.printf("\t");
            if(i > n / 2)   printNumbers(n/2,i);
//            for spaces
            if(i != n / 2)  printSpaces(space);
//            for second half
            if(i < n / 2)   printNumbers(i,n/2);
            if(i > n / 2)   printNumbers(n/2,i);
            if(i < n / 2)   space += 2;
            else            space -= 2;
            System.out.println();
        }
    }
    private static void printSpaces(int space) {
        for(int s = 0; s <= space; s++){
                System.out.printf("\t");
        }
    }
    private static void printNumbers(int i, int num) {
        for(int  j = 0; j < num - i; j++){
            System.out.printf("*\t");
        }
    }
}