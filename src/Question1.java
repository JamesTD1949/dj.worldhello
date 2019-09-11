import javax.swing.*;

public class Question1 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your name: ");

        String className = JOptionPane.showInputDialog("Please enter your class name: ");

        String snacksAsString = JOptionPane.showInputDialog("Please enter the number of snacks you would like: ");

        int snacks = Integer.parseInt(snacksAsString);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nClass: " + className + "\nTotal Cost: £" + cost(snacks),"Confirm Dialog",JOptionPane.INFORMATION_MESSAGE);
    }

    public static int cost(int x)
    {
        return x*2;
    }
}
