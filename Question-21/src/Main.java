public class Main {
    public static void main(String[] args) {
//        Given n = 5.You have to print the output as given below.
//        *                               *
//        *   *                       *   *
//        *   *   *               *   *   *
//        *   *   *   *       *   *   *   *
//        *   *   *   *   *   *   *   *   *

          int n = 5;
          int space = 2 * n - 3;
          for(int i = 0; i < n;i++){
              for(int j = 0; j<= i; j++){
                  System.out.printf("*\t");
              }
              for(int s = 0;s < space;s++){
                  System.out.printf("\t");
              }
              if(i < n - 1){
                  for(int j = 0; j<= i; j++){
                      System.out.printf("*\t");
                  }
              }else{
                  for(int j = 0; j < n - 1; j++){
                      System.out.printf("*\t");
                  }
              }
              space -= 2;
              System.out.println();
          }
    }
}