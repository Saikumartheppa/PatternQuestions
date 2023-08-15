public class Main {
    public static void main(String[] args) {
//        given n = 5.You have the print the output has given below.
//        n = 5
//         *   *   *   *   *
//                 *   *   *   *
//                         *   *   *
//                                 *   *
//                                         *
        int n = 5;
        int space = 0;
        for(int i = 0; i < n; i++){
            for(int s = 0;s < space; s++){
                System.out.print("\t\t");
            }
            for(int j = 0; j < n - i; j++){
                System.out.print("*\t");
            }
            space++;
            System.out.println();
        }
    }
}