public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is slight.");
        } else if (this.weight > 700 && this.weight <= 1700) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is quite heavy.");
        }
    }
    public void checkYear() {
        if (this.year > 2019 && this.price > 1400) {
            System.out.println("Buy this notebook.");
        } else if (this.year < 2019 && this.year > 2013 && this.price <1400 && this.price < 1400) {
            System.out.println("Think about this notebook.");
        }else {
            System.out.println("Do not buy this notebook.");
        }
    }
}

