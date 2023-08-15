public class Main {
    public static void main(String[] args) {
//        Given n = 5.You have to print the output as given below.
//                5   4   3   2   1
//                5   4   3   2   1
//                5   4   3   2   1
//                5   4   3   2   1
//                5   4   3   2   1

        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = n; j >= 1; j--){
                System.out.print(j);
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}