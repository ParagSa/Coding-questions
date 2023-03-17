abstract class First{
   abstract void add(int a,int b);
    
    abstract void mul(int a, int b);
    
    void show()
    {
        System.out.println("Hello");
    }
}
class Second extends First{
    
    void add(int a,int b){
        System.out.println(a+b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
}
class abstract1 {
    public static void main(String[] args) {
        Second obj= new Second();
		//First obj= new First();
        obj.add(5,3);
        //obj.mul(4,5);
        obj.show();
    }
}
