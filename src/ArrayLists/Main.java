package ArrayLists;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        MobilePhone ph=new MobilePhone();

        choice();
        switch_statement(ph);
        //sc.nextLine();

        sc.close();
    }


    public static void choice(){
        System.out.println(
                "0 to display choice list \n"+
                "1 to add list \n"+
                "2 to display list \n"+
                        "3 to search contact using name and edit contact \n"+
                "4 to quit \n"+"Enter your choice :\n" );

    }
    public static void switch_statement(MobilePhone ph){
        boolean quit=false;
        while(!quit) {

            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    choice();
                    break;

                case 1:
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter Phone number");
                    long phone = sc.nextLong();
                    ph.addContacts(new Contacts(name, phone));
                    break;

                case 2:
                    ph.list();
                    break;

                case 3:
                    System.out.println("Enter name");
                    String name2 = sc.nextLine();
                    System.out.println("Enter new Phone number");
                    long phone2 = sc.nextLong();
                    ph.update_contact(new Contacts(name2, phone2));
                    break;

                case 4:
                    quit=true;
                    break;

                default:
                    choice();
                    break;
            }
        }
    }
}
