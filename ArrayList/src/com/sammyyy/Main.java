package com.sammyyy;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {


    boolean quit = false;
    start();
    actions();
    while(!quit){
        System.out.println("Enter action: ");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action){
            case 0:
                System.out.println("\nShutting Down ^_^ ");
                quit = true;
                break;
            case 1:
                mobilePhone.printContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                actions();
                break;
        }

    }


    }
    private static void start(){
        System.out.println("- Phone has been started");
    }
    private static void actions(){
        System.out.println("     ----- Actions -----");
        System.out.println("Press:\n" +
                           "      0 -> to quit\n" +
                           "      1 -> to print contacts\n" +
                           "      2 -> to add a new contact\n" +
                           "      3 -> to update a contact\n" +
                           "      4 -> to remove a contact\n" +
                           "      5 -> to see actions"
                );
    }
    private static void addContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:  ");
        String phoneNumber = scanner.nextLine();
        Contacts contact = new Contacts(name, phoneNumber);
        mobilePhone.addContact(contact);

    }
    private static void updateContact(){
        System.out.println("Enter contact name which will be updated: ");
        String name = scanner.nextLine();
        if(mobilePhone.isContactExists(name)){
            Contacts oldContact = mobilePhone.queryContact(name);
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone number: ");
            String newNumber = scanner.nextLine();
            Contacts newContact = new Contacts(newName, newNumber);
            mobilePhone.modifyContact(oldContact,newContact);
        }else{
            System.out.println("Contact is not exists.");
        }
    }
    private static void removeContact(){
        System.out.println("Enter contact name which will be removed: ");
        String name = scanner.nextLine();
        if(mobilePhone.isContactExists(name)){
            Contacts contact = mobilePhone.queryContact(name);
            mobilePhone.removeContact(contact);
        }else{
            System.out.println("Contact is not exists.");
        }

    }
}
