public abstract class Worker {

    private Shop workingShop;
    


    public Worker() {
        this.workingShop = Shop.getInstance();
        this.workingShop.addWorker(this);
    }

}

