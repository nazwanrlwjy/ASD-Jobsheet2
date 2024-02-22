import java.util.Scanner;

public class DragonMain23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the width of the game area: ");
        int width = scanner.nextInt();
        
        System.out.print("Enter the height of the game area: ");
        int height = scanner.nextInt();
        
        Dragon23 dragon = new Dragon23(0, 0, width, height);
        
        while (true) {
            System.out.println("\nDragon Movement:");
            System.out.println("1. Move Left");
            System.out.println("2. Move Right");
            System.out.println("3. Move Up");
            System.out.println("4. Move Down");
            System.out.println("5. Print Position");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    dragon.moveLeft();
                    break;
                case 2:
                    dragon.moveRight();
                    break;
                case 3:
                    dragon.moveUp();
                    break;
                case 4:
                    dragon.moveDown();
                    break;
                case 5:
                    dragon.printPosition();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 6.");
            }
        }
    }
}
