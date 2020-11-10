package ArrayLists;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter Phone number");
        long phone=sc.nextLong();
        //sc.nextLine();
        MobilePhone ph=new MobilePhone();
        ph.addContacts(new Contacts(name,phone));
        ph.list();
        sc.close();
    }
}
