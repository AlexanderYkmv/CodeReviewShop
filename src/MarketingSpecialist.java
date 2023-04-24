public class MarketingSpecialist extends Worker {
   
    private double budget = 5000.00;

    
    public void spendMoney(double marketingCampaignCost) {
        this.budget -= marketingCampaignCost;
    }

    public double getBudget() {
        return this.budget;
    }

    
}
