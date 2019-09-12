import javax.swing.*;

public class Question5 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null,"Please enter your operation code and two numbers seperated by a single space: ");

        char code = input.charAt(0);

        String firstString = input.substring(input.indexOf(' '),input.lastIndexOf(' '));

        String lastString = input.substring(input.lastIndexOf(' '));

        double firstNum = Double.parseDouble(firstString),secondNum = Double.parseDouble(lastString),result;

        switch (code){

            case 'A':
                result = firstNum+secondNum;
                JOptionPane.showMessageDialog(null,result);
                break;

            case 'S':
                result = firstNum-secondNum;
                JOptionPane.showMessageDialog(null,result);
                break;

            case 'M':
                result = firstNum*secondNum;
                JOptionPane.showMessageDialog(null,result);
                break;

            case 'D':
                result = firstNum/secondNum;
                JOptionPane.showMessageDialog(null,result);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Incorrect Operator code chosen!!");
                break;
        }



    }
}
