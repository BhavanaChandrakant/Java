/*Replace concept*///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String args[])
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String name1 = "bhavana";
        String name2 = "Chandrakant";
        String name3= name1+name2;
        String name4=name3.replace("a","b");
        System.out.println(name4);
    }
}