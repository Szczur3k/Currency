package pl.MateuszLukaszczyk.Model;

public enum Currency {

    PLN(3.55),
    USD(4.55),
    EUR(5.55);

    private double amount;

    Currency(double amount){
        this.amount = amount;
    }

    double getAmount(){
        return amount;
    }

}
