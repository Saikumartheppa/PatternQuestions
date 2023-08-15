public class Main {
    public static void main(String[] args) {
        // given n = 5.You have to print the pattern as given below.
//            *   *   *   *   *
//            *               *
//            *               *
//            *               *
//            *   *   *   *   *
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n -1 || j == 0 || j == n -1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}