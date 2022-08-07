public class Finalizer {
    public void finalize(){
        System.out.println("bye bye");
    }
    public static void main(String[] args) {
        
    
    Finalizer t1= new Finalizer();
    Finalizer t2= new Finalizer();
    t1=null;
    t2=null;
    System.gc();
    }
}
