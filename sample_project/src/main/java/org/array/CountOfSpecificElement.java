package org.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class CountOfSpecificElement {
    public static void main(String[] args) {
       String[] vehicleNumbers = {"MH01AB1234", "DL02CD1122", "DL04AC3322", "GJ01BN4565", "MH04AT8899"};

       long count= Arrays.stream(vehicleNumbers).filter(vehicle->vehicle.substring(0,2).equals("MH")).collect(Collectors.counting());
        System.out.println(count);
    }
}
