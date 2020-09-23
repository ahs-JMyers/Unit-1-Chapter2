/*
 *Joshua Myers
 *Programming III AP CS A
 *Project
 *Date
*/



public class StockTransactionProgram {
public static void main(String[] args){
    //declare variables
    int sharesPurchesed;
    double costOfShares;
    double paidToBroker;
    double paidAfterSale;
    int amountOfStockSold;
    double stockSold;
    double totalMoneySpent;
    double totalMoneyEarned;
    double finalTotal;
    double stockComission = 0.02;
    
    sharesPurchesed = 1000;
    amountOfStockSold = 1000;
    costOfShares = sharesPurchesed * 32.87;
    
    //display the amount of money that Joe spent
    System.out.println("Joe spent $" + costOfShares + " on shares");
    
    paidToBroker = stockComission * costOfShares;
    
    System.out.println("Joe paid the brocker "
            + "before sale $" + paidToBroker);
    
    totalMoneySpent = paidToBroker + costOfShares;
    
    System.out.println("In total Joe spent $" + totalMoneySpent + 
            " on stocks ");
    
    
    stockSold = amountOfStockSold * 33.92;
    
    System.out.println("Joe sold the stock for $" + stockSold);
    
    paidAfterSale = stockSold * stockComission;
    
    System.out.println("Joe paid $" + paidAfterSale + " to the broker when he"
            + " sold stock" );
    
    totalMoneyEarned = stockSold - paidAfterSale;
    
    finalTotal = totalMoneyEarned - totalMoneySpent;
    
    System.out.println("The final total is $" + finalTotal);
    
    
    
}
}
