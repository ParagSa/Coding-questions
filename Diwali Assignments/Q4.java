class Q4{

   public static void main(String[] args) {

       int n = 5, val = 1;

       for (int i = 0; i <n; i++) {

           for (int j = 1; j <= n - i; j++) {

               System.out.print(" ");

           }

           for (int k = 0; k <= i; k++) {

               if (k == 0 || i == n)

                   System.out.print("1");

               else

                   System.out.print(" " + (val = val * (i - k + 1) / k));

           }

           System.out.println("");

       }

   }

}

