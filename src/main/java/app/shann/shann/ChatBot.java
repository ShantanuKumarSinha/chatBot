package app.shann.shann;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot chatBot = new ChatBot();
        DecisionTree<Integer, String> decisionTree = chatBot.loadTheDecisionTree();

        callTheDecisionTree(decisionTree, scanner);

    }

    private static void callTheDecisionTree(DecisionTree<Integer, String> decisionTree, Scanner scanner) {
        System.out.println(decisionTree.getValue());

        System.out.print("You: ");
        int choice = scanner.nextInt();
        if (choice==1) {
            System.out.println(decisionTree.getFirstNode().getValue());
            int choice1 = scanner.nextInt();
            if (choice1==1) {
                System.out.println(decisionTree.getFirstNode().getFirstNode().getValue());
                System.out.println("Press 0 to go back to main menu");
                scanner.nextInt();
                callTheDecisionTree(decisionTree, scanner);
            } else if (choice1==2) {
                System.out.println(decisionTree.getFirstNode().getSecondNode().getValue());
                System.out.println("Press 0 to go back to main menu");
                scanner.nextInt();
                callTheDecisionTree(decisionTree, scanner);
            } else {
                System.out.println(decisionTree.getFirstNode().getThirdNode().getValue());
                System.out.println("Press 0 to go back to main menu");
                scanner.nextInt();
                callTheDecisionTree(decisionTree, scanner);
            }
        } else if (choice==2) {
            System.out.println(decisionTree.getSecondNode().getValue());
            int choice1 = scanner.nextInt();
            if (choice1==1) {
                System.out.println(decisionTree.getSecondNode().getFirstNode().getValue());
                System.out.println("Press 0 to go back to main menu");
                scanner.nextInt();
                callTheDecisionTree(decisionTree, scanner);
            } else if (choice1==2) {
                System.out.println(decisionTree.getSecondNode().getSecondNode().getValue());
                System.out.println("Press 0 to go back to main menu");
                scanner.nextInt();
                callTheDecisionTree(decisionTree, scanner);
            }  else {
                System.out.println(decisionTree.getSecondNode().getThirdNode().getValue());
                System.out.println("Press 0 to go back to main menu");
                scanner.nextInt();
                callTheDecisionTree(decisionTree, scanner);
            }
        }
    }

    public DecisionTree<Integer,String> loadTheDecisionTree(){

        DecisionTree<Integer,String> decisionTreeFirstNodeFirstNode = new DecisionTree(null, null, null, null, 4,"Bot: You can view your payment details in the billing section of your account.");
        DecisionTree<Integer, String> decisionTreeFirstNodeSecondNode = new DecisionTree(null, null, null, null, 5,"Bot: Refunds are processed within 5-7 business days.");
        DecisionTree<Integer, String> decisionTreeFirstNodeThirdNode = new DecisionTree(null, null, null, null, 6,"Bot: Invalid choice. Please try again.");

        DecisionTree<Integer, String> decisionTreeFirstNode = new DecisionTree(decisionTreeFirstNodeFirstNode, null, decisionTreeFirstNodeSecondNode, decisionTreeFirstNodeThirdNode, 1,"Bot: Are you looking for (1) Payment Details or (2) Refund Information?");

        DecisionTree<Integer, String> decisionTreeSecondNodeFirstNode = new DecisionTree(null, null, null, null, 7,"Bot: Please restart your router and try again.");
        DecisionTree<Integer, String> decisionTreeSecondNodeSecondNode = new DecisionTree(null, null, null, null, 8,"Bot: Please ensure your device is connected to the network.");
        DecisionTree<Integer, String> decisionTreeSecondNodeThirdNode = new DecisionTree(null, null, null, null, 9,"Bot: Invalid choice. Please try again.");

        DecisionTree<Integer, String> decisionTreeSecondNode = new DecisionTree(decisionTreeSecondNodeFirstNode, null, decisionTreeSecondNodeSecondNode, decisionTreeSecondNodeThirdNode, 2,"Bot: Are you facing issues with (1) Internet or (2) Devices?");

        DecisionTree<Integer, String> decisionTreeThirdNode = new DecisionTree<>(null, null, null, null, 3,"Bot: Invalid choice. Please start again.");


        DecisionTree<Integer, String> decisionTree = new DecisionTree(decisionTreeFirstNode, null, decisionTreeSecondNode, decisionTreeThirdNode, 0,"Bot: Welcome! Do you need help with (1) Billing or (2) Technical Support?");

        return  decisionTree;

    }
}
