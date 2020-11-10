package ArrayLists;

import java.util.ArrayList;

public class MobilePhone {
    private Contacts contact;
    private ArrayList<Contacts> contactsArrayList=new ArrayList<Contacts>();


    public void addContacts(Contacts contact){
        if(contactsArrayList.contains(contact.getName())){
            System.out.println("User already exists");
        }
        else {
            contactsArrayList.add(contact);
        }
    }

    public ArrayList<Contacts> getContacts() {
        return contactsArrayList;
    }

    public void arrayconversion(){
        String[] array=new String[contactsArrayList.size()];
        array=contactsArrayList.toArray(array);
        System.out.println(array);
    }

    public void list(){
        for(int i=0;i<contactsArrayList.size();i++){
            Contacts c=contactsArrayList.get(i);
            System.out.println(c.getName()+" - "+c.getPhone());
           // System.out.println(contactsArrayList.get(i).getName());
        }
    }
}
