import javax.swing.*;

public class Question6 {
    public static void main(String[] args) {

        String input;

       // while(!input.equals("q") && !input.equals("Quit")){

            input = JOptionPane.showInputDialog(null,"Please enter your operation code and two numbers seperated by a single space or q or quit to exit):: ");

            while (!input.equals("q") && !input.toLowerCase().equals("quit"))
            {
                char code = input.charAt(0);

                String firstString = input.substring(input.indexOf(' '),input.lastIndexOf(' '));

                String lastString = input.substring(input.lastIndexOf(' '));

                double firstNum = Double.parseDouble(firstString),secondNum = Double.parseDouble(lastString),result;

                switch (code) {

                    case 'A':
                        result = firstNum + secondNum;
                        JOptionPane.showMessageDialog(null, result);
                        break;

                    case 'S':
                        result = firstNum - secondNum;
                        JOptionPane.showMessageDialog(null, result);
                        break;

                    case 'M':
                        result = firstNum * secondNum;
                        JOptionPane.showMessageDialog(null, result);
                        break;

                    case 'D':
                        result = firstNum / secondNum;
                        JOptionPane.showMessageDialog(null, result);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Incorrect Operator code chosen!!");
                        break;
                }

                input = JOptionPane.showInputDialog(null,"Please enter another  operation code and two numbers seperated by a single space (or q or quit to exit): ");
            }

        }



    }

