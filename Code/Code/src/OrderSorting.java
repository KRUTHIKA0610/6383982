class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return orderId + " " + customerName + " ₹" + totalPrice;
    }
}

public class OrderSorting {

    static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
    }

    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    static void printOrders(Order[] orders) {
        for (Order o : orders) System.out.println(o);
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Aarthi", 2999),
            new Order(2, "Bala", 750),
            new Order(3, "Chitra", 12500),
            new Order(4, "Dinesh", 6000)
        };

        Order[] bubbleSorted = orders.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort:");
        printOrders(bubbleSorted);

        Order[] quickSorted = orders.clone();
        quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sort:");
        printOrders(quickSorted);
    }
}
