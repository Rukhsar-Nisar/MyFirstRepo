
import javax.swing.*;
import java.awt.*;
public class BookShop  {
    BookShop() {

        JFrame f = new JFrame("        BOOK SHOP    ");

        //BOOK_NAME
        JLabel l1 = new JLabel(" Book Name  : ");
        l1.setBounds(20,20,100,100);
        JTextField t1 = new JTextField("       ");
        t1.setBounds(100,50,140,30);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        f.add(l1);
        f.add(t1);

        //PRICE
        JLabel l2 = new JLabel(" Price : ");
        l2.setBounds(20,60,90,90);
        JTextField t2 = new JTextField("        ");
        t2.setBounds(102,90,140,30);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        f.add(l2);
        f.add(t2);

        //AUTHOR_1
        JLabel l3 = new JLabel(" Author 1 : ");
        l3.setBounds(20,75,120,120);
        JTextField t3 = new JTextField("        ");
        t3.setBounds(102,120,140,30);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        f.add(l3);
        f.add(t3);

        //AUTHOR_2
        JLabel l4 = new JLabel(" Author 2 : ");
        l4.setBounds(20,100,120,120);
        JTextField t4 = new JTextField("        ");
        t4.setBounds(102,150,140,30);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        f.add(l4);
        f.add(t4);
    }


    public static void main(String[] args) {
        new BookShop();
    }
}