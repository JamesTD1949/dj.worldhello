import javax.swing.*;

public class Question4 {
    public static void main(String[] args) {

        String input="";
        Integer counter=0,total=0;


        while(!input.equals("q")) {

            input = JOptionPane.showInputDialog(null, "Please enter an integer: ");

            if (input != "q") {

                int checker = 0;
                for (int i = 0; i < input.length(); i++) {
                    if (i == 0 && (input.charAt(i) == '-' || Character.isDigit(input.charAt(i))))
                    {
                        checker++;
                    }
                    else if (Character.isDigit(input.charAt(i)))
                    {
                        checker++;
                    }
                }

                if (checker == input.length() && checker!=0) {
                    int num = Integer.parseInt(input);

                    counter++;
                    total += num;
                }
            }

        }

        System.out.println("Total: " + total + "\nNumbers Input: " + counter);

    }
}
