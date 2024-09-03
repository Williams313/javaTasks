import java.util.Scanner;
public class myPhonesSure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
                WELCOME TO NOKIA 3310... please enter your preferred choice..
                1 -> Phone Book
                2 -> Messages
                3 -> Chat
                4 -> Call register
                5 -> Tone
                6 -> Setting
                7 -> Call diver
                8 -> Games
                9 -> Calculator
                10 -> Reminder
                11 -> Clock
                12 -> Profile
                13 -> Sim Service
                14 -> Exit
                """);
            int mainMenu = input.nextInt();
            switch (mainMenu) {
                case 1:      
                    phoneBook(input);
                    break;
                case 2:
                    messages(input);
                    break;
                case 3:
                    chat(input);
		    break;
	        case 4:
                    callRegister(input);
                    break;
		    break;
                case 14:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void phoneBook(Scanner input) {
        while (true) {
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
                11 -> Back
                """);
            int optionsEightInPhonBook = input.nextInt();
            switch (optionsEightInPhonBook) {
                case 8:
                    options(input);
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void options(Scanner input) {
        while (true) {
            System.out.println("""
                Options
                1 -> Type of view
                2 -> Memory status
                3 -> Back
                """);
            int MainMessages = input.nextInt();
            switch (MainMessages) {
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void messages(Scanner input) {
        while (true) {
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
                11 -> Back
                """);
     
           
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static Chat(Scanner input) {
	while (true) {
        System.out.println("""
		Chat
		1 ->  Start chat 
		2 -> return
	        """);
        int Chat = input.nextInt();
            switch (mainMnu) {

		case 2:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");






	  }

       }
        
    }
