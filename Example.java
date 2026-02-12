class Creditcard
{
    int cardNo=1234;
    int pin=2005;

}
class Hacker extends Creditcard{

    void viewDetails()
    {
        System.out.println(cardNo);
        System.out.println(pin);
    }
    void changeDetails()
    {
        cardNo=6789;
        pin =3005;
    }
}

class Example
{
    public static void main(String[] args)
    {
        Hacker h=new Hacker();
        h.viewDetails();
        h.changeDetails();
        h.viewDetails();
    }
}