public class Main {
    public static void main(String[] args) {
//        given n = 5.You have the print the output has given below.
//        n = 5
//         *   *   *   *   *
//         *   *   *   *   *
//         *   *   *   *   *
//         *   *   *   *   *
//         *   *   *   *   *
           int n = 5;
           for(int i = 0; i < n; i++){
               for(int j = 0; j < n; j++){
                   System.out.print("*\t");
               }
               System.out.println();
           }
    }
}