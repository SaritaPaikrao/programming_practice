package stock_market;
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        testPriceRecord();
        testStockCollection();
        testGetBiggestChange();
    }
    public static void testPriceRecord() {
        // Test basic PriceRecord functionality
        System.out.println("Running testPriceRecord");
        Stock testStock = new Stock("AAPL", "Apple Inc.");
        PriceRecord testPriceRecord = new PriceRecord(testStock, 100, "2023-07-01");

        Assert.assertEquals(testPriceRecord.stock, testStock);
        Assert.assertEquals(testPriceRecord.price, 100);
        Assert.assertEquals(testPriceRecord.date, "2023-07-01");
    }

    private static StockCollection makeStockCollection(Stock stock, Object[][] priceData) {
        StockCollection stockCollection = new StockCollection(stock);
        for (Object[] priceRecordData : priceData) {
            PriceRecord priceRecord = new PriceRecord(stock, (int) priceRecordData[0], (String) priceRecordData[1]);
            stockCollection.addPriceRecord(priceRecord);
        }
        return stockCollection;
    }

    public static void testStockCollection() {
        System.out.println("Running testStockCollection");
        // Test basic StockCollection functionality
        Stock testStock = new Stock("AAPL", "Apple Inc.");
        StockCollection stockCollection = new StockCollection(testStock);

        Assert.assertEquals(0, stockCollection.getNumPriceRecords());
        System.out.println("stockCollection.getNumPriceRecords()");
        Assert.assertEquals(-1, stockCollection.getMaxPrice());
        Assert.assertEquals(-1, stockCollection.getMinPrice());
        Assert.assertEquals(-1.0, stockCollection.getAvgPrice(), 0.001);

        /*
         * Price Records: Price: 110 112 90 105 Date: 2023-06-29 2023-07-01 2023-06-28
         * 2023-07-06
         */
        Object[][] priceData = { { 110, "2023-06-29" }, { 112, "2023-07-01" }, { 90, "2023-06-28" },
                { 105, "2023-07-06" } };
        testStock = new Stock("AAPL", "Apple Inc.");
        stockCollection = makeStockCollection(testStock, priceData);

        Assert.assertEquals(priceData.length, stockCollection.getNumPriceRecords());
        Assert.assertEquals(112, stockCollection.getMaxPrice());
        Assert.assertEquals(90, stockCollection.getMinPrice());
        Assert.assertEquals(104.25, stockCollection.getAvgPrice(), 0.1);
    }
    public static void testGetBiggestChange() {
        System.out.println("Running testGetBiggestChange");
        Stock testStock = new Stock("AAPL", "Apple Inc.");
        StockCollection stockCollection = new StockCollection(testStock);

        Assert.assertNull(stockCollection.getBiggestChange());

        Object[][] priceData = {
                { 110, "2023-06-29" },
                { 112, "2023-07-01" },
                { 90,  "2023-06-25" },
                { 105, "2023-07-06" }
        };
        stockCollection = makeStockCollection(testStock, priceData);

        Assert.assertArrayEquals(
                new Object[] { 20, "2023-06-25", "2023-06-29" },
                stockCollection.getBiggestChange()
        );

        Object[][] priceData2 = {
                { 200, "2000-01-04" },
                { 210, "1999-12-30" },
                { 190, "2000-01-03" },
                { 180, "2000-01-01" }
        };
        stockCollection = makeStockCollection(testStock, priceData2);

        Assert.assertArrayEquals(
                new Object[] { -30, "1999-12-30", "2000-01-01" },
                stockCollection.getBiggestChange()
        );
    }
}

