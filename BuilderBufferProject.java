public class BuilderBufferProject {
public static void main(String args[]){

    StringBuffer MyName = new StringBuffer("Jude Kallista-Fitzpatrick");
    System.out.println("My name is "+ MyName);

    System.out.println("\n The length of this is: " + MyName.length());
    System.out.println("\n The capacity of this is: " + MyName.capacity());

    MyName.replace(5,25,"");
    System.out.println("\n My first name is " + MyName);

    MyName.append("Kallista-Fitzpatrick");
    System.out.println("\n Here is my full name again: " + MyName );

    System.out.println("\n Here is the same information, but done with StringBuilder.");

    StringBuilder MyNameSB = new StringBuilder("Jude Kallista-Fitzpatrick");
    System.out.println("\n" + MyNameSB);

    System.out.println("\n" + MyNameSB.length());
    System.out.println("\n" + MyNameSB.capacity());

    MyNameSB.replace(5,25,"");
    System.out.println("\n" + MyNameSB);

    MyNameSB.append("Kallista-Fitzpatrick");
    System.out.println("\n" + MyNameSB);



}

}
