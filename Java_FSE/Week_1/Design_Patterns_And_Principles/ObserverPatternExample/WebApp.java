public class WebApp implements Observer {

    private String company;

    public WebApp(String company) {
        this.company = company;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Web App (" + company + ") : " + stockName + " = ₹" + price);
    }
}
