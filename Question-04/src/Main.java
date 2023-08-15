public class Main {
    public static void main(String[] args) {
        //        given n = 5.You have the print the output has given below.
//        n = 5
//                         *
//                     *   *
//                 *   *   *
//             *   *   *   *
//         *   *   *   *   *
        int n = 5;
        int space =  n - 1;
        for(int i = 0; i < n; i++){
            for(int s = space; s >= 0; s--){
                System.out.print("\t");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*\t");
            }
            space--;
            System.out.println();
        }
    }
}