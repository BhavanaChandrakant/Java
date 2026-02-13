 abstract class Plane
 {
    abstract void takeoff();
    abstract void fly();
    abstract void land();
 }

 class cargoPlane extends Plane
 {
    void takeoff()
    {
        System.out.println("CargoPlane is taking off from a long sized runway");
    }
    void fly()
    {
        System.out.println("CargoPlane is flying a low sized runway");
    }
    void land()
    {
        System.out.println("CargoPlane is landing on long sized  runway");
    }
 }

 class passengerPlane extends Plane
 {
    void takeoff()
    {
        System.out.println("PassengerPlane is taking off from a long sized runway");
    }
    void fly()
    {
        System.out.println("PassengerPlane is flying a low sized runway");
    }
    void land()
    {
        System.out.println("PassengerPlane is landing on long sized  runway");
    }
 }

 class fighterPlane extends Plane
 {
    void takeoff()
    {
        System.out.println("fighterPlane is taking off from a long sized runway");
    }
    void fly()
    {
        System.out.println("fighterPlane is flying a low sized runway");
    }
    void land()
    {
        System.out.println("fighterPlane is landing on long sized  runway");
    }
 }

 class Polymorphism
 {
    public static void main (String[] args) 
    {
    cargoPlane cp=new cargoPlane();
    passengerPlane pp=new passengerPlane();
    fighterPlane fp=new fighterPlane();

    Plane ref;
    ref=cp;
    ref.takeoff();
    ref.fly();
    ref.land();

    ref=pp;
    ref.takeoff();
    ref.fly();
    ref.land();

    ref=fp;
    ref.takeoff();
    ref.fly();
    ref.land();


 }
}
