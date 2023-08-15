public class Main {
    public static void main(String[] args) {

//               Given int n = 5.You have to print the output as given below.
//                            1
//                        1   2   3
//                    1   2   3   4   5
//                1   2   3   4   5   6   7
//            1   2   3   4   5   6   7   8   9
        int n = 5,numCount = 1;
        for (int i = 0; i < n; i++){
          for(int s = 0;s < n - i -1; s++){
              System.out.printf("\t");
          }
          for(int j = 1; j <= numCount; j++){
              System.out.print(j);
              System.out.printf("\t");
//            System.out.printf(j+"\t");     -> Increases time complexity
          }
          numCount += 2;
          System.out.println();
        }
    }
}