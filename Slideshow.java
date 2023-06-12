import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class Slideshow extends JFrame{
    JLabel pic[] = new JLabel[7];
    JButton next = new JButton("Next");
    JButton back = new JButton("Back");
    JButton random = new JButton("Random");
    Random randomNum = new Random();
    int opened = 1;
    
    public static void main(String[] args){ 
      new Slideshow();
    }
    
    public Slideshow(){
        super("AT Photo Slideshow");
        
        for (int i = 1; i < 7; i++) {
           pic[i] = new JLabel(new ImageIcon("C:/Users/USERNAME/Documents/"+ i +".jpg"));
           pic[i].setBounds(10, 10, 400, 400);
           pic[i].setVisible(false);
           add(pic[i]);
        }
        
         next.setBounds(10,430,95,30); 
         next.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               next();
            }  
         });  
         add(next);
         
         back.setBounds(100,430,95,30); 
         back.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               back();
            }  
         });  
         add(back);
         
         random.setBounds(190,430,95,30); 
         random.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               random();
            }  
         });  
         add(random);
        
        pic[1].setVisible(true);
                      
        setLayout(null);
        setSize(438, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void next() {
       pic[opened].setVisible(false);
       if (opened == 6) {
         opened = opened;
       } else {
         opened = opened + 1;
       }
       pic[opened].setVisible(true);
    }
    
    public void back() {
       pic[opened].setVisible(false);
       if (opened == 1) {
         opened = opened;
       } else {
         opened = opened - 1;
       }
       pic[opened].setVisible(true);
    }
    
    public void random() {
       pic[opened].setVisible(false);
       int rand = 0;
       while (true) {
          rand = randomNum.nextInt(7);
          if(rand !=0)
            break;
       }
       opened = rand;
       pic[rand].setVisible(true);
    }
}
