//its the marker interface
interface Marker{

}
//creating an abstract class that will explain what each class in the online portal will do
abstract class OnlinePortalActions{
    abstract void ClassName();
    abstract void ClassActivity();
    abstract void prices(double price);
}

public class Main {
    public static void main(String[] args) {
            Cloths cloths = new Cloths();
            if(cloths instanceof Marker){
                cloths.ClassName();
                cloths.ClassActivity();
                cloths.prices(800.00);
                System.out.println("--------------------------------------------------------------------");
            }else{
                System.out.println("permission to display cloths not give ");
            }
            Toys toys =new Toys();
        if(toys instanceof Marker){
            toys.ClassName();
            toys.ClassActivity();
            toys.prices(20.00);
            System.out.println("--------------------------------------------------------------------");
        }else{
            System.out.println("permission to display toys not give ");
        }
        Electronics electronics = new Electronics();
        if(electronics instanceof Marker){
            electronics.ClassName();
            electronics.ClassActivity();
            electronics.prices(1000.00);
            System.out.println("--------------------------------------------------------------------");
        }else{
            System.out.println("permission to display electronics not give ");
        }
    }
}