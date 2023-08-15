public class Main {
    public static void main(String[] args) {

//     Given n = 7.You have to print the output given below.
//                    *
//                *   *   *
//            *   *   *   *   *
//        *   *   *   *   *   *   *
//            *   *   *   *   *
//                *   *   *
//                    *
        int n = 7;
        int space = n / 2;
        int starCount = 1;
        for(int i = 0; i < n;i++){
            for(int s = 0;i < n /2 && s < space; s++){
                System.out.printf("\t");
            }
            for(int s = 0; i <= n /2 && s < starCount; s++){
                System.out.printf("*\t");
            }
            for(int s = 0; i > n /2 && s < space; s++){
                System.out.printf("\t");
            }
            for(int s = 0;i > n /2 && s < starCount;s++){
                System.out.printf("*\t");
            }
            if(i < n /2){
                space --;
                starCount +=2;
            } else{
                space++;
                starCount -=2;

            }
            System.out.println();
        }
    }
}