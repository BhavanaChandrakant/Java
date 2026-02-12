class Car
{
   private String name;
   private int mileage;
   private int cost;

   public void setdata(String x ,int y, int z){
    name=x;
    mileage=y;
    cost=z;
   }

   public String getname(){
    return name;
   }
   public int getmileage(){
    return mileage;
   }
   public int getcost(){
    return cost;
   }
}
class Demo
{
public static void main (String[] args)
{
    Car c=new Car();
    c.setdata("BMW",10,7000000);
    System.out.println(c.getname());
    System.out.println(c.getmileage());
    System.out.println(c.getcost());
}
}