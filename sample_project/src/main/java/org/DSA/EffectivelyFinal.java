//package org.DSA;
//
//public class EffectivelyFinal {
//    public static void main(String[] args) {
//
//        calculateValue(124, 53);
//    }
//
//    private static void calculateValue(int operand1, int operand2) {
//        // Operands and remainder are effectively final here
//        int rem = 0;
//
//        // Remainder lost its effectively final property
//        // here because it gets its second assignment
//        rem = operand1 % 5;
//        class operators {
//
//            // Method 1
//            void setNum()
//            {
//
//                // operand1 lost its effectively final
//                // property here because it gets its second
//                // assignment
//                operand1 = operand2 % 2;
//            }
//
//            // Method 2
//            int add()
//            {
//
//                // It does not compile because rem is not
//                // effectively final
//                return rem + operand2;
//            }
//
//            // Method 3
//            int multiply()
//            {
//
//                // It does not compile because both
//                // remainder and operand1 are not
//                // effectively final
//                return rem * operand1;
//            }
//        }
//    }
//
//}
