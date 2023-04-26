public class Main {
    public static void main(String[] args) {
        int clientBalance = 400;
        int additionToBalance = 1200;
        int bonus = 0;

        if (additionToBalance > 1000) {
            bonus = additionToBalance / 100;

        }

        int newClientBalance = clientBalance + additionToBalance + bonus;

        System.out.println("Текущий Баланс:" + newClientBalance);
        System.out.println("Бонус за пополнение:" + bonus);
    }

}