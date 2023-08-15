public class Main {
    public static void main(String[] args) {

//           Given n = 5.You have print the output as given below.
//                            *   *   *   *   *
//                        *   *   *   *
//                    *   *   *
//                *   *
//            *
//                *   *
//                    *   *   *
//                        *   *   *   *
//                            *   *   *   *   *
//        _____________________________________________________
//                Solution without using function
//        _____________________________________________________

        int n = 5;
        int space = n - 1;
        for(int i = 0; i < n * 2 - 1; i++){
            for(int s = 0; i < n && s < space;s++){
                System.out.printf("\t");
            }
            for(int j = 0; i < n && j < n - i; j++){
                System.out.printf("*\t");
            }
            for(int s = 0;i >= n && s < space; s++){
                System.out.printf("\t");
            }
            for(int j = 0; i >= n && j <= i - n + 1; j++){
                System.out.printf("*\t");
            }
            if(i < n - 1){
                space--;
            } else{
                space++;
            }
            System.out.println();
        }


//        _____________________________________________________
//                Solution with using function
//        _____________________________________________________
//        int n = 5;
//        int space = n - 1;
//        for(int i = 0; i < n * 2 - 1; i++) {
//            if(i < n)
//            printExtraSpace(space);
//            for(int j = 0; i < n && j < n - i; j++){
//                System.out.printf("*\t");
//            }
//            if(i >= n)
//                printExtraSpace(space);
//            for(int j = 0; i >= n && j <= i - n + 1; j++){
//                System.out.printf("*\t");
//            }
//            if(i < n - 1){
//                space--;
//            } else{
//                space++;
//            }
//            System.out.println();
//        }
    }
//    private static void printExtraSpace(int space) {
//        for(int s = 0 ; s < space; s++){
//            System.out.printf("\t");
//        }
//    }
}