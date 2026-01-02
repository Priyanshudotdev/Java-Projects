// List is a interface for ordered collection of elements
import java.util.List;

// ArrayList is a concrete class that implements the List using dynamic array
import java.util.ArrayList;

import java.util.Scanner;



/*
- Create a todo class
- create a obj from it and take user input and call the methods of that obj for that user
- need a content of todo, is completed and id
- createTodo, deleteTodo, updateTodo
*/

class Main
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        ArrayList < Todo > todo = new ArrayList < > ();


        while (true) {
            printMenu();
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Todos\n");
                    todo.forEach(System.out::println);
                    System.out.println("Task Completed\n");
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Enter Todo Description :");
                    String content = scan.nextLine();
                    
                        todo.add(new Todo(content));
                        System.out.println("\nTask Completed\n");
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Enter Todo Id: ");
                    int id = scan.nextInt();
                    for (Todo t: todo) {
                        if (t.id == id) {
                            t.isCompleted = true;
                            System.out.println("\nTask Completed\n");
                            break;
                        } else {
                            System.out.println("\nNo Todo Found\n");
                            break;
                        }
                    }
                case 4:
                    System.out.println("Enter Todo Id: ");
                    int _id = scan.nextInt();
                            todo.remove(_id);
                            System.out.println("\nTask Completed\n");
                            break;
                case 5:
                    return;

                default:
                    return;
            }
        }

        // scan.close();




        // todo.forEach(System.out::println);
    }

    static void printMenu() {
        System.out.println("\n-----Todo CLI-----\n");
        System.out.println("1. List Todos\n" + "2. Add Todo\n" + "3. Edit Todo\n" + "4. Delete Todo\n" + "5. Exit Program\n");
    }



    static class Todo {
        private static int nextId = 1;
        int id;
        String content;
        boolean isCompleted;

        Todo(String content, boolean isCompleted) {
            this.id = ++nextId;
            this.content = content;
            this.isCompleted = isCompleted;
        }

        Todo(String content) {
            this.id = nextId++;
            this.content = content;
        }

        Todo(boolean isCompleted) {
            this.isCompleted = isCompleted;
        }

        @Override
        public String toString() {
            char tag = isCompleted ? '✅' : '❌';
            return id + ". " + content + " - " + tag;
        }

    }
}