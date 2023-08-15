public class Main {
    public static void main(String[] args) {
//        Given n = 10.You have print the output as given below.
//
//                                             0
//                                         9   0   9
//                                     8   9   0   9   8
//                                 7   8   9   0   9   8   7
//                             6   7   8   9   0   9   8   7   6
//                         5   6   7   8   9   0   9   8   7   6   5
//                     4   5   6   7   8   9   0   9   8   7   6   5   4
//                 3   4   5   6   7   8   9   0   9   8   7   6   5   4   3
//             2   3   4   5   6   7   8   9   0   9   8   7   6   5   4   3   2
//         1   2   3   4   5   6   7   8   9   0   9   8   7   6   5   4   3   2   1

        int n = 10;
        for(int i = 1; i <= n; i++){
            // for space
            for(int s = 1; s <= n - i; s++){
                System.out.printf("\t");
            }
            // loop for printing numbers which are in front of 0's column
            for(int j = n - i;i > 1 && j < n - 1; j++){
                System.out.print(j + 1);
                System.out.printf("\t");
            }
//            for printing zero  instead of using a new for loop
            System.out.printf("0\t");
//             for printing zero
//            for(int j = n; j >= 1; j--){
//                if(j == 1){
//                    System.out.printf("0\t");
//                }
//            }
            // loop for printing numbers which are after 0's column
            for(int j = n - 1; j > n - i; j--){
                System.out.print(j);
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}