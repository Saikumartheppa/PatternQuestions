public class Main {
    public static void main(String[] args) {
//       Given int n = 5.You have to print the output as given below.
//                                1
//                            2   3   4
//                        5   6   7   8   9
//                 10   11   12   13   14   15   16
//            17   18   19   20   21   22   23   24   25
        int n = 5, num = 1,numCount = 1;
        for(int i = 0; i < n; i++){
            for(int s = 0; s < n - i - 1;s++){
                System.out.printf("\t");
            }
            for(int j = 0; j < numCount; j++){
                System.out.printf(num+"\t");
                num++;
            }
            numCount += 2;
            System.out.println();
        }
    }
}