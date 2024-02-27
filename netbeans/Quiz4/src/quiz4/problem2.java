package quiz4;
public class problem2 {
    public static void main(String[] args) {       
        int amount = 200;
        int balance= 1000;       
        if (amount > balance){
            throw new IllegalArgumentException("Amount exceeds balance");
        }
        balance = balance - amount;       
        System.out.println("Balance: "+balance);
    }
}
