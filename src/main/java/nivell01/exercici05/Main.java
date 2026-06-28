package nivell01.exercici05;

public class Main {

    public static void main(String[] args) {
        DirectoryContentManager.objectSerialize("order.ser", new Order());
        Order deserializedOrder = (Order)DirectoryContentManager.objectDeserialize("order.ser");
        System.out.println(deserializedOrder);
    }
}
