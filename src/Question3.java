import javax.swing.*;

public class Question3 {
    public static void main(String[] args) {

        double rate = 0, tax = 0;

        String name = JOptionPane.showInputDialog("Please enter your name: ");

        String taxAsString = JOptionPane.showInputDialog("Please enter your taxable income: ");

        double taxable = Double.parseDouble(taxAsString);

        if(taxable>20000 && taxable<=36000)
        {
            rate = 0.2;

            tax = taxCalc(rate,taxable);

        }
        else if(taxable>36000)
        {
            rate = 0.41;

            tax = taxCalc(rate,taxable);
        }

        double net = taxable-tax;

        JOptionPane.showMessageDialog(null,"Gross Income: $" + taxAsString
                + "\nTax Rate: " + rate + "%\nTax Due: $" + tax + "\nNet Income: $" + net);




    }

    public static double taxCalc(double x, double y)
    {
        return y*x;
    }
}
