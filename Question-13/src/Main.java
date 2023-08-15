public class Main {
    public static void main(String[] args) {
//        Given n = 5.You have print the output as given below.
//        *
//        *   *
//        *   *   *
//        *   *   *   *
//        *   *   *   *   *
//        *   *   *   *
//        *   *   *
//        *   *
//        *
        int n = 5;
        int rowLength = n * 2 - 1;
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; i < n &&j <= i; j++){
                System.out.printf("*\t");
            }
            for(int j = i; i >= n && j < rowLength; j++){
                System.out.printf("*\t");
            }
            System.out.println();
        }
    }
}