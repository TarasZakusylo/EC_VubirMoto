package EC_VubirMoto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EC_rezultat extends JFrame {

	private static final long serialVersionUID = 1L;

	public EC_rezultat(String s_rezultat, int indekator_dostovirnosti) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\u041F\u0440\u043E\u0439\u0442\u0438 \u0449\u0435 \u0440\u0430\u0437");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EC("EC", 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(52, 41, 344, 59);
		getContentPane().add(btnNewButton);

		JButton btnMenu = new JButton("\u041C\u0435\u043D\u044E");
		btnMenu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Мотоцикли");
				setVisible(false);
			}
		});
		btnMenu.setBounds(394, 41, 328, 59);
		getContentPane().add(btnMenu);

		JLabel label = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Verdana", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 113, 764, 34);
		getContentPane().add(label);

		JLabel label_1 = new JLabel(s_rezultat);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 158, 764, 53);
		getContentPane().add(label_1);

		String s_indekator_dostovirnosti = null;
		String s_emblema = null;

		switch (indekator_dostovirnosti) {
		case 0: {
			s_indekator_dostovirnosti = "норма";
			s_emblema = "res/like.png";
		}
			break;
		case 1: {
			s_indekator_dostovirnosti = "нестандарта ситуація";
			s_emblema = "res/warning.png";
		}
			break;
		case 2: {
			s_indekator_dostovirnosti = "критична ситуація";
			s_emblema = "res/error.png";
		}
			break;
		}

		ImageIcon logo_emblema = new ImageIcon(s_emblema);
		JLabel l_logo_emblema = new JLabel(logo_emblema);

		l_logo_emblema.setBounds(622, 453, 100, 100);
		getContentPane().add(l_logo_emblema);

		JLabel label_2 = new JLabel(
				"\u0420\u0456\u0432\u0435\u043D\u044C \u0434\u043E\u0441\u0442\u043E\u0432\u0456\u0440\u043D\u043E\u0441\u0442\u0456: "
						+ s_indekator_dostovirnosti);
		label_2.setFont(new Font("Verdana", Font.BOLD, 20));
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(84, 494, 525, 34);
		getContentPane().add(label_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 224, 738, 239);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("res/rartunku_vudiv/" + s_rezultat + " (зменшена).png"));

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("res/fon/fon_rezultatu_EC.jpg"));
		label_4.setBounds(0, 0, 782, 553);
		getContentPane().add(label_4);

		setVisible(true);

	}
}
