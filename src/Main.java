public class Main {
    public static void main(String[] args) {
        int check = 300;
        int refill = 1500;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int amount = check + refill + bonus;
        System.out.println("Итоговый счет :" + amount);
        System.out.println("Количество бонусных рублей :" + bonus);


    }
}
