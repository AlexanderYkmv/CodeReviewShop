import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop instance;

    private Shop() {}
    
 
    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
 
        return instance;
    }

   



    private List<Worker> workers = new ArrayList<>();

    public  void addWorker(Worker worker) {
        this.workers.add(worker);
    }
 
    
    public double getTurnover() {
        double turnOver = 0.0;
        for (Worker worker : this.workers) {
            if (worker instanceof  SalesConsultant); {
                turnOver += ((SalesConsultant)worker).getMoney();
            }
 
            if (worker instanceof  MarketingSpecialist) {
                turnOver += ((MarketingSpecialist)worker).getBudget();
            }
        }
 
        return turnOver;
    }
}
