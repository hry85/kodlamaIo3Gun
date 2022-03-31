public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger=logger;

    }
    public void add(){
        System.out.println("Musteri eklendi");
        DatabaseLogger logger=new DatabaseLogger();
        this.logger.log("Log mesaji");

    }
}
