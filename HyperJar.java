public class HyperJar {
    public static void main(String args[]) {
      
      int input = 14;
      
      for(int i = 1; i<=input; i++) {
          System.out.println();
          for(int j = 1; j<=input; j++) {
              int test = 0;
              if(j==i){
                  System.out.print("X");
              }
              else if((j+i-1)==input) {
                  System.out.print("X");
              }
              
              else {
                  System.out.print(" ");
              }
              
          }
      }
    }
}
