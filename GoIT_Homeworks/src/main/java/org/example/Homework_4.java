package org.example;

public class Homework_4 {}
    class ATM{
        public int countBanknotes(int sum){
            int[] banknoteValues = new int[]{500,200,100,50,20,10,5,2,1};
            int totalQuantity = 0;
            int counter = 0;
            while(sum>0){
                int value = banknoteValues[counter];
                int thisQuantity = sum/value;
                totalQuantity+=thisQuantity;
                sum-= value*thisQuantity;
                counter++;
            }
            return totalQuantity;
        }
    }

