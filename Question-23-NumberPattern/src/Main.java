public class Main {
    public static void main(String[] args) {
//        Given n = 5.You have to print the output as given below.
//                           1
//                       1   1   1
//                   1   1   1   1   1
//               1   1   1   1   1   1   1
//           1   1   1   1   1   1   1   1   1
        int oneCount = 1;
        int n = 5;
        for(int i = 0 ; i < n; i++){
            for(int s = 0; s < n - i - 1; s++){
                System.out.printf("\t");
            }
            for(int j = 0; j < oneCount; j++){
                System.out.printf("1\t");
            }
            oneCount += 2;
            System.out.println();
        }
    }
}