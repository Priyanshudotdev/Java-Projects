import java.util.Scanner;

public class Main {

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void printCounter(int counter){
        System.out.println("Counter: " + counter);
    }

    static void printScreen(){
        System.out.println("----- TUI -----");
        System.out.println("1. Increament");
        System.out.println("2. Decreament");
        System.out.println("3. Reset");
        System.out.println("4. Exit");
        System.out.print("> ");       
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int counter = 0;
        boolean running = true;

        while(running){

            printScreen();
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    counter++;
                    clearScreen();
                    printCounter(counter);
                    break;
                case 2:
                    counter--;
                    clearScreen();
                    printCounter(counter);
                    break;
                case 3:
                    counter = 0;
                    clearScreen();
                    printCounter(counter);
                    break;
                case 4:
                    running = false;
                    System.out.println();
                    System.out.println("Bie!!!!\n");
                    System.out.println("----- TUI -----");
                    break;
                default:
                    System.out.println("you choose wrong choice !!");
            }

        }

    }


}
