public class Main {
    public static void main(String[] args) {
//    Given int n = 5.You have to print the output as given below.
//                            1
//                        1   2   1
//                    1   2   3   2   1
//                1   2   3   4   3   2   1
//            1   2   3   4   5   4   3   2   1


//        __________________________________________________
//          Solution without function
//        __________________________________________________

//        int n = 5,num = 1;
//        for(int i = 1; i <= n; i++){
//            for(int s = 0; s < n - i; s++){
//                System.out.printf("\t");
//            }
//            for(int j = 1; j <= num; j++){
//                System.out.print(j);
//                System.out.print("\t");
//            }
//            for(int j = 1; i >= num /2 && j <= num - 1; j++){
//                System.out.print(j);
//                System.out.print("\t");
//            }
//            num ++;
//            System.out.println();
//        }



//        __________________________________________________
//          Solution with function
//        __________________________________________________

        int n = 5,num = 1;
        for(int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.printf("\t");
            }
            printNumbers(num);
            if(i >= num / 2){
                printNumbers(num - 1);
            }
            num ++;
            System.out.println();
        }
    }
    private static void printNumbers(int num) {
        for(int j = 1; j <= num; j++){
            System.out.print(j);
            System.out.print("\t");
        }
    }
}