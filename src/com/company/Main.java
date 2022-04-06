package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //User user = new User();
        ArrayList<User> users = new ArrayList();
        Scanner reader = new Scanner(System.in);

        while (true) {

            //print mini-menu with 4 options
            System.out.println("Select one option");
            System.out.println("1)create new user");
            System.out.println("2)change user pin");
            System.out.println("3)make transfer");
            System.out.println("4)make deposit");
            System.out.println("5)quit");
            int option = reader.nextInt();

            switch (option) {
                case 1: createUser();
                case 2: changePin();
                case 3: transfer();
                case 4: deposit();
                case 5: quit();

            }
        }

        //call-operation to createUserInputOutput
        //call-operation to create new user

        //call-operation to changePinInputOutput
        //call-operation to change pin

        //call-operation to transferInputOutput
        //call-operation to make transfer

        //call-operation to depositInputOutput
        //call-operation to deposit, to charge, to add some money to the card

        public static void createUser() {
            createUserInputOutput();
        }

        public static void changePin() {
            changePinInputOutput();
        }

        public static void transfer() {
            transferInputOutput();
        }

        public static void deposit() {
            depositInputOutput();
        }

        public static void createUserInputOutput() {
            System.out.println("What is the user name");
            String name = reader.nextLine();
            System.out.println("Whats is your surname");
            String surname = reader.nextLine();
            System.out.println("What is your age");
            int age = reader.nextInt();
            System.out.println("What is your card number");
            int cardNumber = reader.nextInt();
            System.out.println("What is the pin number");
            int pinNumber = reader.nextInt();
        }

        public static void changePinInputOutput() {
            System.out.println("What is the card number");
            String number = reader.nextLine();
            System.out.println("Whats is your actual pin");
            int pinCard = reader.nextInt();
            System.out.println("What is your new pin");
            int newPin = reader.nextInt();
        }

        public static void transferInputOutput() {
            System.out.println("What is the source card number");
            String number = reader.nextLine();
            System.out.println("Whats is the source card pin");
            int pin = reader.nextInt();
            System.out.println("What is the target card number");
            String targetCard = reader.nextLine();

        }

        public static void depositInputOutput() {
            System.out.println("What is the card number");
            String number = reader.nextLine();
            System.out.println("What is the amount to deposit");
            int amount = reader.nextInt();

        }
    }
}

