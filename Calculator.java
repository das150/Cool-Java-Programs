import java.awt.event.*;
import javax.swing.*;
 
public class Calculator extends JFrame implements ActionListener  {
   private JFrame frame;
   private JTextField number1;
   private JTextField number2;
   JLabel resultLabel;
   JButton addButton;
   JButton minusButton;
   JButton subtractButton;
   JButton divideButton;
   private int operation;
 
   public static void main(String[] args) {
      Calculator window = new Calculator();
      window.frame.setVisible(true);
   }
 
   public Calculator() {
      frame = new JFrame();
      frame.setTitle("Calculator");
      frame.setBounds(100, 100, 325, 275);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 500, 400);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      number1 = new JTextField();
      number1.setBounds(150, 25, 150, 25);
      panel.add(number1);
      number2 = new JTextField();
      number2.setBounds(150, 75, 150, 25);
      panel.add(number2);
      
      JLabel number1Label = new JLabel("First Number:");
      number1Label.setBounds(10, 30, 100, 10);
      panel.add(number1Label);
      
      JLabel number2Label = new JLabel("Second Number:");
      number2Label.setBounds(10, 80, 100, 10);
      panel.add(number2Label);
      
      addButton = new JButton("+");
      addButton.setBounds(10, 120, 45, 35);
      panel.add(addButton);
      addButton.addActionListener(this);
      
      minusButton = new JButton("-");
      minusButton.setBounds(92, 120, 45, 35);
      panel.add(minusButton);
      minusButton.addActionListener(this);
      
      subtractButton = new JButton("*");
      subtractButton.setBounds(175, 120, 45, 35);
      panel.add(subtractButton);
      subtractButton.addActionListener(this);
      
      divideButton = new JButton("/");
      divideButton.setBounds(253, 120, 45, 35);
      panel.add(divideButton);
      divideButton.addActionListener(this);
            
      resultLabel = new JLabel("<html><font color='red'>No Result Yet</font></html>");
      resultLabel.setBounds(10, 180, 100, 35);
      panel.add(resultLabel);
   }
 
   public void calculateResult(int operation) {
         switch(operation) {
         case 1:
            resultLabel.setText("<html><font color='red'>Result: "+(Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText()))+"</font></html>");
            break;
         case 2:
            resultLabel.setText("<html><font color='red'>Result: "+(Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText()))+"</font></html>");
            break;
         case 3:
            resultLabel.setText("<html><font color='red'>Result: "+(Double.parseDouble(number1.getText()) *  Double.parseDouble(number2.getText()))+"</font></html>");
            break;
         case 4:
            resultLabel.setText("<html><font color='red'>Result: "+(Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText()))+"</font></html>");
            break;
         }
   }
 
   public void actionPerformed(ActionEvent click) {
      if (click.getSource() == addButton) {
         operation = 1;
         calculateResult(operation);
      } else if (click.getSource() == minusButton) {
         operation = 2;
         calculateResult(operation);
      } else if (click.getSource() == subtractButton) {
         operation = 3;
         calculateResult(operation);
      } else if (click.getSource() == divideButton) {
         operation = 4;
         calculateResult(operation);
      }
   }
}
