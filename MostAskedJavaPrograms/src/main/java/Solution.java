//import sharedcourses_1.LogEntry;
//import sharedcourses_1.LogFile;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//public class Solution {
//  public static void main(String[] argv) throws IOException {
//    testLogFile();
//    testLogEntry();
//  }
//  public static void testLogFile() throws IOException {
//    System.out.println("Running testLogFile");
//
//    String path = "/content/test/tollbooth_small.log";
//
//    try (BufferedReader reader = new BufferedReader(new FileReader(path));
//    ) {
//      LogFile logFile = new LogFile((List<String>) reader);
//      assertEquals(13, logFile.size());
//      for (LogEntry entry : logFile.logEntries) {
//        assert (entry instanceof LogEntry);
//      }
//    }
//  }
//  public static void testLogEntry() {
//    System.out.println("Running testLogEntry");
//    String logLine = "44776.619 KTB918 310E MAINROAD";
//    LogEntry logEntry = new LogEntry(logLine);
//    assertEquals(44776.619f, logEntry.getTimestamp(), 0.0001f);
//    assertEquals("KTB918", logEntry.getLicensePlate());
//    assertEquals(310, logEntry.getLocation());
//    assertEquals("EAST", logEntry.getDirection());
//    assertEquals("MAINROAD", logEntry.getBoothType());
//    logLine = "52160.132 ABC123 400W ENTRY";
//    logEntry = new LogEntry(logLine);
//    assertEquals(52160.132f, logEntry.getTimestamp(), 0.0001f);
//    assertEquals("ABC123", logEntry.getLicensePlate());
//    assertEquals(400, logEntry.getLocation());
//    assertEquals("WEST", logEntry.getDirection());
//    assertEquals("ENTRY", logEntry.getBoothType());
//  }
//}