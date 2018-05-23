package EC_VubirMoto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Menu extends JFrame {
 
	private static final long serialVersionUID = 1L;

	Menu(String s){
		super(s);
	 
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(800,600);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	getContentPane().setLayout(null);   
        	
    	JLabel l_nazva = new JLabel("Мотоцикли");
    	l_nazva.setHorizontalAlignment(SwingConstants.CENTER);
    	l_nazva.setBounds(23, 5, 750  , 57 );
    	getContentPane().add(l_nazva);
    	l_nazva.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 40));
    	l_nazva.setForeground(Color.DARK_GRAY);
    	
    	JButton b_EC = new JButton("Підбір мотоцикла");
    	b_EC.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	b_EC.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new EC ("EC",3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
    			setVisible(false);
    		}
    	});
    	b_EC.setForeground(Color.MAGENTA);
    	b_EC.setBounds(33, 65, 721, 37);
    	b_EC.setToolTipText("Експертна система, що рекомендує Вам вид спорту.");
    	getContentPane().add(b_EC);
    	
    	JButton b_Vpravu = new JButton("Мережі магазинів");
    	b_Vpravu.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	b_Vpravu.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		}
    	});
    	b_Vpravu.setForeground(Color.MAGENTA);
    	b_Vpravu.setToolTipText("Як себе розвивати?");
    	b_Vpravu.setBounds(33, 109, 721, 37);
    	getContentPane().add(b_Vpravu);
    	
    	JButton b_Pravula = new JButton("Правила дорожнього руху");
    	b_Pravula.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	b_Pravula.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    		}
    	});
    	b_Pravula.setForeground(Color.MAGENTA);
    	b_Pravula.setBounds(33, 154, 721, 37);
    	b_Pravula.setToolTipText("Інструкції щодо повних видів спорту.");
    	getContentPane().add(b_Pravula);
    	
    	JButton b_Normu = new JButton("Ремонт та обслуговування");
    	b_Normu.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	b_Normu.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		}
    	});
    	b_Normu.setForeground(Color.MAGENTA);
    	b_Normu.setBounds(33, 243, 721, 37);
    	b_Normu.setToolTipText("Нормативи із основних видів спорту, які викладаються у школі.");
    	getContentPane().add(b_Normu);
    	
    	JButton b_Test = new JButton("Мотоклуби");
    	b_Test.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	b_Test.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		}
    	});
    	b_Test.setForeground(Color.MAGENTA);
    	b_Test.setBounds(33, 199, 721, 37);
    	b_Test.setToolTipText("Тестування учнів та перегляд результатів (для учителя).");
    	getContentPane().add(b_Test);
    	
    	JButton b_Rozklad = new JButton("Автошколи");
    	b_Rozklad.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	b_Rozklad.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    		}
    	});
    	b_Rozklad.setForeground(Color.MAGENTA);
    	b_Rozklad.setBounds(33, 288, 721, 37);
    	b_Rozklad.setToolTipText("Перегляд розкладу занять із фізичної культури");
    	getContentPane().add(b_Rozklad);
    	
    	JLabel label = new JLabel("");
    	label.setHorizontalAlignment(SwingConstants.CENTER);
    	label.setBounds(33, 338, 721, 214);    	
    	label.setIcon(new ImageIcon("res/kartunka_menu (zmenhena).png"));
    	getContentPane().add(label);
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("res/fon/fon_menu.jpg"));
    	lblNewLabel.setBounds(0, 0, 794, 565);
    	getContentPane().add(lblNewLabel);
    
    	setVisible(true);
    	
	}
}
