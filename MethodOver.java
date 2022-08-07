class A{
    int num1;
    int num2;
    // int num3;

    public A(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        // this.num3=num3;
    }
    public void meth1(){
        System.out.println("this is the meth1 of class A");
    }
    public void meth2(int amount){
        System.out.println("this is the meth2 pf class A"+amount+" num1 is "+num1);
    }
}
class B extends A{
    int z;
    int x;
    int y;
    public B(int a,int b,int zer){
        super(a,b);
        z=zer;
    }

    @Override
    public void meth2(int amount1){
        System.out.println("this is meth2 of class B");
        System.out.println("aur bhai kesa h");
        System.out.println("your amount is"+amount1+" a is "+z);

    }
    public void meth3(){
        System.out.println("This is the meth3 of class B");
    }
}


public class MethodOver {
    public static void main(String[] args) {
        A a= new A(23,54);
        a.meth2(2453);
        B b=new B(1,2,3);
        b.meth2(425234);
    }
}
