import java.util.Scanner;
public class kakei {
		public static void main(String[] args)
		{
        Scanner scanner = new Scanner(System.in);
        int totalIncome = 0;
        int totalExpense = 0;

        System.out.println("--- 家計簿プログラム ---");

        while (true) {
            System.out.println("日付を入力してください（例: 2023/07/01）:");
            String date = scanner.nextLine();

            System.out.println("収入を入力してください:");
            int income = scanner.nextInt();
            totalIncome += income;

            System.out.println("食費を入力してください:");
            int foodExpense = scanner.nextInt();
            totalExpense += foodExpense;

            System.out.println("日用品費を入力してください:");
            int dailyExpense = scanner.nextInt();
            totalExpense += dailyExpense;

            System.out.println("通信費を入力してください:");
            int communicationExpense = scanner.nextInt();
            totalExpense += communicationExpense;

            System.out.println("水道光熱費を入力してください:");
            int utilitiesExpense = scanner.nextInt();
            totalExpense += utilitiesExpense;

            System.out.println("保険料を入力してください:");
            int insuranceExpense = scanner.nextInt();
            totalExpense += insuranceExpense;

            System.out.println("交際費を入力してください:");
            int socialExpense = scanner.nextInt();
            totalExpense += socialExpense;

            scanner.nextLine(); // 改行文字を読み捨てる

            System.out.println("データを追加しました。続けますか？ (y/n)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }
        }

        int balance = totalIncome - totalExpense;

        System.out.println("\n--- 家計簿の結果 ---");
        System.out.println("総収入: " + totalIncome);
        System.out.println("総支出: " + totalExpense);
        System.out.println("差額: " + balance);
		}
}
