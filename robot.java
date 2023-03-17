import java.util.*;

class robot{
    public static void main(String[] args) {
      int cup = 0, cdown =0;
      int cleft =0, cright =0;
      Scanner sc = new Scanner(System.in);
      String mo = sc.nextLine();
      for(int i = 0; i<mo.length();i++){
          
           if(mo.charAt(i)=='U')
              cup++;
            else if(mo.charAt(i)=='D')
              cdown--;
            else if(mo.charAt(i)=='L')
              cleft--;
            else
              cright++;
            
          
              
        }
        if(cup+cdown==0 || cright + cleft==0){
            System.out.println("true");
        }else{
              System.out.println("false");
        }

        //System.out.println(rev);
    }
}