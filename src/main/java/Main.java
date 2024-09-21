package adam;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
    	BankAccount bobAccount = new BankAccount(1000, -1000, "Bob");
        BankAccount lisaAccount = new BankAccount(1000, -1000, "Lisa");

        System.out.println(bobAccount);
        System.out.println(lisaAccount);

        System.out.println("\nTransferring 500 from Bob to Lisa");
        if (bobAccount.transfer(lisaAccount, 500)) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Not enough money to transfer.");
        }

        System.out.println(bobAccount);
        System.out.println(lisaAccount);

        System.out.println("\nTransfering from Bob to Lisa 1600 cash");
        if (bobAccount.transfer(lisaAccount, 1600)) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed! Not enough money.");
        }

        System.out.println(bobAccount);
        System.out.println(lisaAccount);
        
        
        Rectangle rectangle1 = new Rectangle(5, 3);
        Rectangle rectangle2 = new Rectangle(7, 4);

        System.out.println("Rectangle 1:");
        rectangle1.draw();
        System.out.println("\nRectangle 2:");
        rectangle2.draw();

        System.out.println("\nEnter scaling amount for Rectangle 1:");
        int scaleAmount = scanner.nextInt();

        rectangle1.scale(scaleAmount);
        
        rectangle1.draw();
        System.out.println("\nNew Rectangle 1 dimensions:");
        System.out.println(rectangle1);

        System.out.println("\nPerimeter and Area of Rectangle 1:");
        System.out.println("Perimeter: " + rectangle1.calcPerimeter());
        System.out.println("Area: " + rectangle1.calcArea());

        System.out.println("\nPerimeter and Area of Rectangle 2:");
        System.out.println("Perimeter: " + rectangle2.calcPerimeter());
        System.out.println("Area: " + rectangle2.calcArea());
    }
}
