package app.shann.shann;

import java.util.Scanner;

public class DecisionTreeChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bot: Welcome! Do you need help with (1) Billing or (2) Technical Support?");
        System.out.print("You: ");
        String choice1 = scanner.nextLine();

        if (choice1.equals("1")) {
            System.out.println("Bot: Are you looking for (1) Payment Details or (2) Refund Information?");
            System.out.print("You: ");
            String choice2 = scanner.nextLine();

            if (choice2.equals("1")) {
                System.out.println("Bot: You can view your payment details in the billing section of your account.");
            } else if (choice2.equals("2")) {
                System.out.println("Bot: Refunds are processed within 5-7 business days.");
            } else {
                System.out.println("Bot: Invalid choice. Please try again.");
            }

        } else if (choice1.equals("2")) {
            System.out.println("Bot: Are you facing issues with (1) Internet or (2) Devices?");
            System.out.print("You: ");
            String choice2 = scanner.nextLine();

            if (choice2.equals("1")) {
                System.out.println("Bot: Please restart your router and try again.");
            } else if (choice2.equals("2")) {
                System.out.println("Bot: Please ensure your device is connected to the network.");
            } else {
                System.out.println("Bot: Invalid choice. Please try again.");
            }

        } else {
            System.out.println("Bot: Invalid choice. Please start again.");
        }

        scanner.close();
    }
}
