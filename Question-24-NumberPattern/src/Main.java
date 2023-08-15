public class Main {
    public static void main(String[] args) {

//      Given n = 5.You have to print the output as given below.
//                      1
//                  2   2   2
//              3   3   3   3   3
//          4   4   4   4   4   4   4
//      5   5   5   5   5   5   5   5   5
        int n = 5;
        int numCount = 1;
        for(int i = 1; i <= n; i++ ){
            for(int s = 0; s < n - i; s++){
                System.out.printf("\t");
            }
            for(int j = 1; j <= numCount; j++){
                System.out.printf(i+"\t");
            }
            numCount += 2;
            System.out.println();
        }
    }
}