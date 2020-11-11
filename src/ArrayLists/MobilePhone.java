package ArrayLists;

import java.util.ArrayList;

public class MobilePhone {
    private Contacts contact;
    private ArrayList<Contacts> contactsArrayList=new ArrayList<Contacts>();


    public void addContacts(Contacts contact){
        if(finding_existing_users(contact)){
            System.out.println("User already exists");
        }
        else {
            contactsArrayList.add(contact);
            System.out.println("Name and Contact added Successfully.");
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
            System.out.println((i+1)+". "+c.getName()+" - "+c.getPhone());
           // System.out.println(contactsArrayList.get(i).getName());
        }
    }
    public void update_contact(Contacts c){
        int index=finding_index(c.getName());
        if(index!=-1){
            contactsArrayList.set(index,c);
            System.out.println("Contact Updated Successfully");
        }
        else{
            System.out.println("Name not found");
        }
    }
    public boolean finding_existing_users(Contacts contact){
        for(int i=0;i<contactsArrayList.size();i++){
            Contacts c=contactsArrayList.get(i);
            if(c.getName().equals(contact.getName()))
                return true;
            // System.out.println(contactsArrayList.get(i).getName());
        }
        return false;
    }

    public int finding_index(String name){
        for(int i=0;i<contactsArrayList.size();i++){
            Contacts c=contactsArrayList.get(i);
            if(c.getName().equals(name))
                return i;
            // System.out.println(contactsArrayList.get(i).getName());
        }
        return -1;
    }
}
