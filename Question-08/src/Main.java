public class Main {
    public static void main(String[] args) {

//      given n = 5.You have to print as per output given below.
//                *				*
//                    *		*
//                       *
//                    *		*
//                *				*
//        -------------------------------------------------
//        1st solution
//        ------------------------------------------------
//        int n = 5;
//        for(int i = 1; i <= n ;i++){
//            for(int j = 1; j <= n; j++){
//                if( i == j || i + j == n + 1){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//        ---------------------------------------------
//        Second solution
//        ---------------------------------------------
//        int n = 5;
//        for(int i = 1; i <= n ;i++){
//            for(int j = 1; j <= n; j++){
//                if( i == j || i  == n - j + 1){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//        ------------------------------------------------
//        Third solution
//        ------------------------------------------------
        int n = 5;
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n; j++){
                if( i == j || i  == n -(j + 1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}