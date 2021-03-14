public class Main {
    public static void main(String[] args) {
        int start_balance = 100;
        int payment = 1100;
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;

        }
        int balance = payment + start_balance + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}












