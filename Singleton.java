class MyClass {
    
    private static MyClass sc=new MyClass(); //MyClass object
    private MyClass(){

    }
    public static MyClass getObject(){ //factory method
        return sc;

    }
    public long factorial(int n){
        if (n==1) 
            return 1;
        return n*factorial(n-1);
    }
}
public class Singleton{
    public static void main(String[] args) {
        // MyClass mc = new MyClass.getObject();
        // System.out.println(mc.factorial(5));
    }
}
