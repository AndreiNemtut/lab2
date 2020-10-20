package com.company;
import javax.swing.*;
public class Main {

    private static final int HOUR_PRICE = 40, MINUTE_PRICE = 1;
    public static void main(String[] args) {
        int totalMinutesNumber, hoursNumber, additionalMinutesNumber, totalPrice;
        totalMinutesNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter down below the number of minutes you used the equipment:"));
        hoursNumber = totalMinutesNumber / 60;
        additionalMinutesNumber = totalMinutesNumber % 60;
        totalPrice = (hoursNumber * HOUR_PRICE) + (additionalMinutesNumber * MINUTE_PRICE);
        JOptionPane.showMessageDialog(null, "You have used the equipment for:\n\nHours - " + hoursNumber + "\nMinutes - " + additionalMinutesNumber + "\n\nThe total price is: " + totalPrice + "$\n");
    }
}
