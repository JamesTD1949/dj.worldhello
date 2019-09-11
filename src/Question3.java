import javax.swing.*;

public class Question3 {
    public static void main(String[] args) {

        double rate = 0, tax = 0;

        String name = JOptionPane.showInputDialog("Please enter your name: ");

        String taxAsString = JOptionPane.showInputDialog("Please enter your taxable income: ");

        int taxable = int.parseInt(taxAsString);

        if(taxAsString>20000 && taxable<=36000)
        {
            rate = 0.2;

            tax = taxCalc(rate,taxable);

        }
        else if(taxable>36000)
        {
            rate = 0.41;

            tax = taxCalc(rate,taxable);
        }

        JOptionPane.showMessageDialog(null,"Gross Income: £" + taxAsString
                + "\n");




    }

    public static int taxCalc(double x, int y)
    {
        return y*x;
    }
}
