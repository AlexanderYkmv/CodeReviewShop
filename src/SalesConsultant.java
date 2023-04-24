public class SalesConsultant extends Worker {
    
    private double earnedMoney = 0d;

    public void sellProduct(double price) {
        this.earnedMoney += price;
    }

    public double getMoney() {
        return this.earnedMoney;
    }
}
