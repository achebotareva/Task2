import mylist.List;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 2.3");
        JTextField textField = new JTextField(16);
        textField.setText("1 3 0 1 3 2 1 0 4 0");
        JPanel p = new JPanel();
        JLabel max = new JLabel("");
        JLabel min = new JLabel("");
        // create a new button
        JButton button = new JButton("submit");
        p.add(textField);
        p.add(button);
        p.add(max);
        p.add(min);
        frame.add(p);



        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(textField.getText().isEmpty())
                    return;
                List myList = new List();

                for (String val : textField.getText().split(" ")) {
                    myList.add(Integer.valueOf(val));
                }
                max.setText("Count of local max " + String.valueOf(myList.getLocal(true)));
                min.setText("Count of local min " + String.valueOf(myList.getLocal(false)));
                myList.printAll();
            }
        });

        frame.setSize(300, 300);

        frame.show();

    }
}
