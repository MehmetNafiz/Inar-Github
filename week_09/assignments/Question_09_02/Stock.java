package week_09.assignments.Question_09_02;

public class Stock {
    String symbol;
    String name;

    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol,String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this. previousClosingPrice = previousClosingPrice;
        this. currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return ((currentPrice -previousClosingPrice) / previousClosingPrice) * 100;
    }

}
