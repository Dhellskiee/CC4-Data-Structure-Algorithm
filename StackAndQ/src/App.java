import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n========================");
            System.out.print("Select Data Structure: [1] Stack or [2] Queue: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) break;
                System.out.println("Invalid choice.");
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        int n;
        while (true) {
            System.out.print("Input array size (n): ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) break;
                System.out.println("Size must be positive.");
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        if (choice == 1) {
            handleStack(n, scanner);
        } else {
            handleQueue(n, scanner);
        }

        scanner.close();
    }

    public static void handleStack(int n, Scanner scanner) {
        Deque<String> stack = new ArrayDeque<>();
        boolean active = true;

        while (active) {
            try {
                System.out.print("\nChoose operation: [1] Push or [2] Pop: ");
                int op = Integer.parseInt(scanner.nextLine());

                if (op == 1) {
                    if (stack.size() < n) {
                        System.out.print("Input string value: ");
                        stack.push(scanner.nextLine());
                    } else {
                        System.out.println("Stack Overflow!");
                    }
                } else if (op == 2) {
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack Underflow!");
                    }
                } else {
                    System.out.println("Invalid operation.");
                }

                System.out.print("Continue or End? [1] Continue [2] End: ");
                int cont = Integer.parseInt(scanner.nextLine());
                if (cont == 2) active = false;

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("\nFinal Stack: " + stack);
    }

    public static void handleQueue(int n, Scanner scanner) {
        Queue<String> queue = new LinkedList<>();
        boolean active = true;

        while (active) {
            try {
                System.out.print("\nChoose operation: [1] Enqueue or [2] Dequeue: ");
                int op = Integer.parseInt(scanner.nextLine());

                if (op == 1) {
                    if (queue.size() < n) {
                        System.out.print("Input string value: ");
                        queue.add(scanner.nextLine());
                    } else {
                        System.out.println("Queue Full!");
                    }
                } else if (op == 2) {
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued: " + queue.poll());
                    } else {
                        System.out.println("Queue Empty!");
                    }
                } else {
                    System.out.println("Invalid operation.");
                }

                System.out.print("Continue or End? [1] Continue [2] End: ");
                int cont = Integer.parseInt(scanner.nextLine());
                if (cont == 2) active = false;

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("\nFinal Queue: " + queue);
    }
}


/* 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n========================");
            System.out.print("Select Data Structure: [1] Stack or [2] Queue: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) break;
                System.out.println("Invalid choice.");
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        int n;
        while (true) {
            System.out.print("Input array size (n): ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) break;
                System.out.println("Size must be positive.");
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        if (choice == 1) {
            handleStack(n, scanner);
        } else {
            handleQueue(n, scanner);
        }

        scanner.close();
    }

    public static void handleStack(int n, Scanner scanner) {
        Deque<String> stack = new ArrayDeque<>();
        boolean active = true;

        while (active) {
            try {
                System.out.print("\nChoose operation: [1] Push or [2] Pop: ");
                int op = Integer.parseInt(scanner.nextLine());

                if (op == 1) {
                    if (stack.size() < n) {
                        System.out.print("Input string value: ");
                        stack.push(scanner.nextLine());
                    } else {
                        System.out.println("Stack Overflow!");
                    }
                } else if (op == 2) {
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack Underflow!");
                    }
                } else {
                    System.out.println("Invalid operation.");
                }

                System.out.print("Continue or End? [1] Continue [2] End: ");
                int cont = Integer.parseInt(scanner.nextLine());
                if (cont == 2) active = false;

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("\nFinal Stack: " + stack);
    }

    public static void handleQueue(int n, Scanner scanner) {
        Queue<String> queue = new LinkedList<>();
        boolean active = true;

        while (active) {
            try {
                System.out.print("\nChoose operation: [1] Enqueue or [2] Dequeue: ");
                int op = Integer.parseInt(scanner.nextLine());

                if (op == 1) {
                    if (queue.size() < n) {
                        System.out.print("Input string value: ");
                        queue.add(scanner.nextLine());
                    } else {
                        System.out.println("Queue Full!");
                    }
                } else if (op == 2) {
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued: " + queue.poll());
                    } else {
                        System.out.println("Queue Empty!");
                    }
                } else {
                    System.out.println("Invalid operation.");
                }

                System.out.print("Continue or End? [1] Continue [2] End: ");
                int cont = Integer.parseInt(scanner.nextLine());
                if (cont == 2) active = false;

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("\nFinal Queue: " + queue);
    }
}


*/
