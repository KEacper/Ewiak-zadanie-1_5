
class Main {
  public static void main(String[] args) {
  int i = 0;
    for(i=0; i<=100; i++){
      if(i<50){
       System.out.print(i%2==0?i:", "); 
      } else {
        System.out.print(i%2==1?i:", ");
      }
      
    }
  }
}