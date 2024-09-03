import java.util.Scanner;

public class NokiaPhoneSample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    WELCOME TO NOKIA 3310...
                    please enter your preferred choice..
                    ***************************
                    1 ->Phone Book
                    2 ->Messages
                    3 ->Chat
                    4->Call register
                    5 ->Tone
                    6->Setting
                    7 ->Call diver
                    8->Games
                    9 ->Calculator
                    10-Reminder
                    11 -Clock
                    12->Profile
                    13 ->Sim Service
                    14 ->Exit""");
            int mainMenu = input.nextInt();

            switch (mainMenu) {
                case 1:
                    phoneBook(input);
                    break;
               case 2:
                    messages(input);
                    break;
                case 3:
                    chat();
                    break;
                case 4:
                    callRegister(input);
                    break;
                case 5:
                    tones();
                    break;
                case 6:
                    settings(input);
                    break;
                case 7:
                    callDivert();
                    break;
                case 8:
                    games();
                    break;
                case 9:
                    calculator();
                    break;
                case 10:
                    reminders();
                    break;
                case 11:
                    clock(input);
                    break;
                 case 12:
                    profiles();
                    break;
                case 13:
                    simServices();
                    break;
                case 14:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    public static void phoneBookMenu(Scanner input) {
        System.out.println("""
                PhoneBook
                1 -> Search
                2 -> Service Nos
                3 -> Add names
                4 -> Erase
                5 -> Edit
                6 -> Assign tone
                7 -> Send b’card
                8 -> Options
                9 -> Speed dials
                10 -> Voice tags
                11 -> Back""");
             int phoneBookChoice = input.nextInt();

        if (phoneBookChoice == 8) {
            System.out.println("""
                    Options
                    1 -> Type of view
                    2 -> Memory status
                    3 -> Back""");
            int optionsChoice = input.nextInt();

            if (optionsChoice == 1) {
                System.out.println("Type of view");
            } else if (optionsChoice == 2) {
                System.out.println("Memory status");
            } else if (optionsChoice == 3) {
                phoneBook(input);
            }
        } else if (phoneBookChoice == 11) 
       main(new String[0]);
        }
    }

    public static void phoneBookMenu(Scanner input) {

        System.out.println("""
                Messages
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture messages
                5 -> Templates
                6 -> Smileys
                7 -> Message settings
                8 -> Info service
                9 -> Voice mailbox number
                10 -> Service command editor
                11 -> Back""");
        int messagesChoice = input.nextInt();

        if (messagesChoice == 2) {
            System.out.println("""
                    Inbox
                    1 -> Type of view
                    2 -> Memory status
                    3 -> Back""");
             int inboxChoice = input.nextInt();

            if (inboxChoice == 1) {
                System.out.println("Type of view");
            } else if (inboxChoice == 2) {
                System.out.println("Memory status");
            } else if (inboxChoice == 3) {
                messages(input);
            }
        } else if (messagesChoice == 11) {
            main(new String[0]);
        }
    }

    // Add more methods for other options









