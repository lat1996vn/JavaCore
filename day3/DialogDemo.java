import java.awt.Frame;
import java.awt.Dialog;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;  
import java.awt.event.*;  
class DialogDemo {  
    private static Dialog d;  
    DialogDemo() {  
        Frame f= new Frame();
        //creat a dialog from a exist frame  
        d = new Dialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                DialogDemo.d.setVisible(false);  
            }  
        });  
        d.add( new Label ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new DialogDemo();  
    }  
}  