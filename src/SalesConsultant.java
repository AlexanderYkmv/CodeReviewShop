public class SalesConsultant extends Worker {
    
    private double earnedMoney;

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getMoney() {
        return this.earnedMoney;
    }
}
