package stock_market;

import java.util.*;

public class StockCollection {
    /**
     * Data for a collection of price records for a particular stock, and methods for
     * getting useful statistics about the stock's prices.
     */
    ArrayList<PriceRecord> priceRecords = new ArrayList<>(); // list of PriceRecord objects, the price records for this particular stock
    Stock stock; // Stock, the Stock this StockCollection is for
    StockCollection(Stock stock) {
        this.stock = stock;
    }

    int getNumPriceRecords() {
        /** Returns the number of PriceRecords in this StockCollection */
        System.out.println("priceRecords.size()>>"+priceRecords.size());
        return priceRecords.size();
    }

    void addPriceRecord(PriceRecord priceRecord) {
        /** Adds a PriceRecord to this StockCollection. */
        if (!priceRecord.stock.equals(this.stock)) {
            throw new IllegalArgumentException("PriceRecord's Stock is not the same as the StockCollection's");
        }
        priceRecords.add(priceRecord);
    }

    int getMaxPrice() {
        if (priceRecords.isEmpty()){
            return -1;
        }
        /** Return the maximum price recorded in this StockCollection. */
        return priceRecords.stream().mapToInt(record -> record.price).max().getAsInt();
    }

    int getMinPrice() {
        /** Return the minimum price recorded in this StockCollection. */
        if (priceRecords.isEmpty()) return -1;
        return priceRecords.stream().mapToInt(record -> record.price).min().getAsInt();
    }

    double getAvgPrice() {
        /** Return the average price recorded in this StockCollection. */
        if (priceRecords.isEmpty()) return -1;
        double total = priceRecords.stream().mapToInt(record -> record.price).sum();
        return total / priceRecords.size();
    }
//2) We want to add a new function called "getBiggestChange" to the StockCollection class.
// This function calculates and returns the largest change in stock price between any two
// consecutive days in the price records of a stock along with the dates of the change in a list.
// For example, let's consider the following price records of a stock:
/*Price Records:
    Price:  110         112         90          105
    Date:   2023-06-29  2023-07-01  2023-06-25  2023-07-06

    Stock price changes (sorted based on date):
    Date:     2023-06-25  ->  2023-06-29  ->  2023-07-01 ->  2023-07-06
    Price:        90      ->      110     ->     112     ->     105
    Change:              +20              +2             -7 */

    public Object[] getBiggestChange() {
        if (priceRecords.isEmpty()) return null;
        List<PriceRecord> sortedRecords = priceRecords.stream().sorted(Comparator.comparing(p -> p.date)).toList();
        System.out.println("Sorted priceRecords "+sortedRecords);
        int bestChange = 0;
       String d1 = null , d2 = null;
       for (int i = 1 ; i < sortedRecords.size() ; i++) {
           int change = sortedRecords.get(i).price - sortedRecords.get(i - 1).price;

           if (Math.abs(change) > Math.abs(bestChange)) {
               bestChange = change;
               d1 = sortedRecords.get(i - 1).date;
               d2 = sortedRecords.get(i).date;
           }
       }
        return new Object[]{bestChange, d1, d2};
    }
}
