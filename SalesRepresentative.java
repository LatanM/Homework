package Hw2Latan;

public class SalesRepresentative {
    private int sales;
    private int quota;
    private String name;

    public SalesRepresentative(int sales, int quota, String name) {
        this.sales = sales;
        this.quota = quota;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRevenue() {
        return sales * quota;
    }

    public String toString() {
        return name + " " + getRevenue();
    }


}
