import javax.swing.*;

public class Question3 {
    public static void main(String[] args) {

        int rate = 0;

        String name = JOptionPane.showInputDialog("Please enter your name: ");

        String taxAsString = JOptionPane.showInputDialog("Please enter your taxable income: ");

        int taxable = int.parseInt(taxAsString);

        if(taxAsString>20000 && taxable<=36000)
        {
            rate = 0.2;

            taxCalc(rate,taxable);

        }
        else if(taxable>36000)
        {
            rate = 0.41;

            tax
        }


    }
}
