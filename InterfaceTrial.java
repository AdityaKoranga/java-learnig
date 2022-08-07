interface Bicycle{
    int a=56;
    void speedup(int increasing);
    void brake(int decreasing);
}
class Aonebike implements Bicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void speedup(int increment){
        System.out.println("speed is increasing");
    }
    public void brake(int decrement){
        System.out.println("the speed is decreasing");
    }

}

public class InterfaceTrial {
    public static void main(String[] args) {
        
    
    Aonebike a1=new Aonebike();
    a1.blowHorn();
    a1.speedup(23);
    
    }
}
