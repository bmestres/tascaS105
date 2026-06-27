package nivell01.exercici05;

import java.io.Serializable;

public class Order implements Serializable {
    private int num;
    private String idClient;
    private double totalAmount;
    private Product[] line;
    private boolean isProcessed;

    public Order(){
        this.num = -1;
        this.idClient = "";
        this.totalAmount = -1;
        this.line = null;
        isProcessed = false;
    }
}
