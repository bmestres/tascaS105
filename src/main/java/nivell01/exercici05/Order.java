package nivell01.exercici05;

import java.io.Serializable;

public class Order implements Serializable {
    private int num;
    private String idClient;
    private double totalAmount;
    private boolean isProcessed;

    public Order(){
        this.num = -1;
        this.idClient = "";
        this.totalAmount = -1;
        isProcessed = false;
    }

    @Override
    public String toString() {
        return String.format("Order info:\nNum: %d\nClient ID: %s\nTotal amount: %.1f\nProcessed: %b ",
                this.num, this.idClient, this.totalAmount, this.isProcessed);
    }
}
