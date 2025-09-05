/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int discount = 10;
    private int saving = price* discount; // multiply them and store in saving.
    private boolean discountActive = false;
    private int amountLeftToPay;
    private int totalCount;
    private int currentPrice = discountActive ? price / 2 : price; 
    private int amountLleftToPay = currentPrice - balance; // after printing discountActive = false;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        int saving = price * discount;
    }
 
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the next ticket.
     */
    public int getBalance()
    {
        return balance; 
    }

    public int RefundBalance(){
        int amount = balance;
        balance = 0;
        return amount;
    }
    
    public void activateDiscount(){
        discountActive = true;
    }
    
    public int emptyMachine() {
        int oldTotal = total;
        total = 0;
        return oldTotal;
    }
    
    public void affordable (int budget) {
        if (price > budget){
            System.out.println("Too expensive");
        }
        else{
                System.out.println("Just right");
            
        }
    }
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount <= 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " + amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    
    {  
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            System.out.println("saving");

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else{ 
            System.out.println("Please insert" + amountLeftToPay + "more cents.");
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
