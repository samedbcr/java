package com.sammyyy;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> myContacts;

    public MobilePhone(){
        this.myContacts = new ArrayList<Contacts>();
    }


    public void addContact(Contacts contact){
        if(isContactExists(contact.getName())){
            System.out.println("Contact already exists.");
        }else {
            this.myContacts.add(contact);
            System.out.println("Successfully added!");
        }
    }

    public void modifyContact(Contacts oldContact, Contacts newContact){
        if(isContactExists(oldContact.getName())){
            this.myContacts.set(getIndex(oldContact),newContact);
            System.out.println("Successfully updated!");
        }
        else{
            System.out.println("Contact does not exists.");
        }
    }

    public void removeContact(Contacts contact){
        if(isContactExists(contact.getName())){
            this.myContacts.remove(contact);
            System.out.println("Successfully removed!");
        }else{
            System.out.println("Contact does not exists.");
        }
    }
    public void printContacts(){
        System.out.println("--- Contact List ---");
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhoneNumber()
                    );
        }
    }

    public int getIndex(Contacts contact){
        int index = this.myContacts.indexOf(contact);
        return index;
    }
    public int getIndex(String name){
        for(int i = 0; i < this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public Contacts queryContact(String name){
        int index = -1;
        for(int i = 0; i < this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equals(name)){
                index = i;
            }
        }
        if(index >= 0){
            return this.myContacts.get(index);
        }
        return null;

    }


    public boolean isContactExists(String name){
        for(int i = 0; i < this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
