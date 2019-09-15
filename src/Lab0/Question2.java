package Lab0;

import javax.swing.*;

public class Question2 {
    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Please enter your first name: ");

        String secondName = JOptionPane.showInputDialog("Please enter your second name: ");

        String distanceAsString = JOptionPane.showInputDialog("Please enter the distance you cycled (in KM): ");

        double distance = Double.parseDouble(distanceAsString);

        double cost = sponsorCost(distance);

        JOptionPane.showMessageDialog(null,"First Name: " + firstName + "\nSecondName: " + secondName
                + "\nDistance Cycled: " + distance + "\nAmount owed: £" + String.format("%.2f",cost));
    }

    private static double sponsorCost(double x)
    {
        if(x<=10)
        {
            return x*0.07;
        }
        else
        {
            return (10*0.07) + ((x-10)*0.1);
        }
    }
}
