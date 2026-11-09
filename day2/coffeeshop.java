void main(){

    String itemName = "Latte";
    double unitPrice = 4.50;
    double taxRate = 1.62;
    boolean isMember = true;
    int quantity = 5;
    double subtotal = 0.0;
    double total = 0.0;

    total = unitPrice * quantity;
    subtotal = total * taxRate;

    IO.println(itemName + " x " + quantity + " @ " + unitPrice + " = " + total);
    IO.println("Tax: " + taxRate);
    IO.println("Total: " + subtotal);
    IO.println("Member: " + isMember);

}