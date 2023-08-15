public class Main {
    public static void main(String[] args) {

//       Given n = 5.You have to print Output as given below.
//                                      *
//                                   *     *
//                                *     *     *
//                             *     *     *     *
//                          *     *     *     *     *
        int n = 5;
        int space = n - 1;
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < space; j++){
                System.out.printf("\t");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf("*\t\t");
            }
            space--;
            System.out.println();
        }
    }
}