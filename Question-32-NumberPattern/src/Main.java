public class Main {
    public static void main(String[] args) {
//     Given n = 5.You have to print the output as given below.
//        1
//        2   *   2
//        3   *   3   *   3
//        4   *   4   *   4   *   4
//        5   *   5   *   5   *   5   *   5
//        4   *   4   *   4   *   4
//        3   *   3   *   3
//        2   *   2
//        1

        int n = 7, num = 1;
        for(int i = 1; i < 2 * n; i++){
            for(int j = i; j <= n; j++) {
                if(i == j)
                System.out.print(i);
            }
            for(int j = 1; i > n && j <= n; j++) {
                if( num == j) {
                    System.out.print(j);
                }
            }
            for(int s = 1;s < num; s++){
                System.out.printf("\t*\t");
                System.out.print(num);
            }
            if(i < n){
                num++;
            }else{
                num--;
            }
            System.out.println();
        }
    }
}