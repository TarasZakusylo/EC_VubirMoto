package EC_VubirMoto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EC3 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna12;
	private JSlider sl_putanna13;
	private JSlider sl_putanna14;
	private JSlider sl_putanna15;

	int i_sl_putanna12 = 3;
	int i_sl_putanna13 = 3;
	int i_sl_putanna14 = 3;
	int i_sl_putanna15 = 3;

	SliderListener12 slider12 = new SliderListener12();
	SliderListener13 slider13 = new SliderListener13();
	SliderListener14 slider14 = new SliderListener14();
	SliderListener15 slider15 = new SliderListener15();

	EC3(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2, final int ii_sl_putanna3, final int ii_sl_putanna4,
			final int ii_sl_putanna5, final int ii_sl_putanna6, final int ii_sl_putanna7, final int ii_sl_putanna8, final int ii_sl_putanna9,
			final int ii_sl_putanna10, final int ii_sl_putanna11, final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15, final int ii_sl_putanna16, final int ii_sl_putanna17, final int ii_sl_putanna18,
			final int ii_sl_putanna19) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna12 = ii_sl_putanna12;
		this.i_sl_putanna13 = ii_sl_putanna13;
		this.i_sl_putanna14 = ii_sl_putanna14;
		this.i_sl_putanna15 = ii_sl_putanna15;

		JButton b_menu = new JButton("\u041C\u0435\u043D\u044E");
		b_menu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		b_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Мотоцикли");
				setVisible(false);
			}
		});
		b_menu.setBounds(695, 0, 89, 23);
		getContentPane().add(b_menu);

		JLabel l_nazva = new JLabel(
				"Який мотоцикл Вам підходить ?");
		l_nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_nazva.setBounds(51, 11, 647, 50);
		getContentPane().add(l_nazva);
		l_nazva.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_nazva.setForeground(Color.green);

		JLabel l_komentar = new JLabel(
				"\u041F\u0440\u043E\u0439\u0434\u0456\u0442\u044C, \u0431\u0443\u0434\u044C \u043B\u0430\u0441\u043A\u0430, \u043C\u0456\u043D\u0456\u043E\u043F\u0438\u0442\u0443\u0432\u0430\u043D\u043D\u044F");
		l_komentar.setForeground(Color.WHITE);
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(196, 74, 398, 14);
		getContentPane().add(l_komentar);

		JLabel l_komentar1 = new JLabel(
				"\u0414\u0430\u0432\u0430\u0439\u0442\u0435 \u0432\u0456\u0434\u043F\u043E\u0432\u0456\u0434\u0456 \u0447\u0435\u0441\u043D\u043E \u0442\u0430 \u043D\u0435 \u0437\u0432\u0435\u0440\u0442\u0430\u0439\u0442\u0435 \u0443\u0432\u0430\u0433\u0438, \u044F\u043A\u0449\u043E \u0437\u0430\u043F\u0438\u0442\u0430\u043D\u043D\u044F \u0432\u0438\u044F\u0432\u043B\u044F\u0442\u044C\u0441\u044F \u0434\u0438\u0432\u043D\u0438\u043C\u0438.\r\n");
		l_komentar1.setForeground(Color.WHITE);
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setBounds(-1, 537, 785, 14);

		sl_putanna12 = new JSlider(0, 1, 5, i_sl_putanna12);
		getContentPane().add(l_komentar1);
		sl_putanna12.setOpaque(false);
		sl_putanna12.setMinorTickSpacing(1);
		sl_putanna12.setPaintTicks(true);
		sl_putanna12.setPaintLabels(true);
		sl_putanna12.setBounds(35, 136, 715, 40);
		getContentPane().add(sl_putanna12);

		sl_putanna13 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna13);
		sl_putanna13.setPaintTicks(true);
		sl_putanna13.setPaintLabels(true);
		sl_putanna13.setOpaque(false);
		sl_putanna13.setMinorTickSpacing(1);
		sl_putanna13.setBounds(35, 230, 715, 40);
		getContentPane().add(sl_putanna13);

		sl_putanna14 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna14);
		sl_putanna14.setPaintTicks(true);
		sl_putanna14.setPaintLabels(true);
		sl_putanna14.setOpaque(false);
		sl_putanna14.setMinorTickSpacing(1);
		sl_putanna14.setBounds(35, 332, 715, 40);
		getContentPane().add(sl_putanna14);

		sl_putanna15 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna15);
		sl_putanna15.setPaintTicks(true);
		sl_putanna15.setPaintLabels(true);
		sl_putanna15.setOpaque(false);
		sl_putanna15.setMinorTickSpacing(1);
		sl_putanna15.setBounds(35, 451, 715, 40);
		getContentPane().add(sl_putanna15);

		JLabel label = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(343, 174, 102, 14);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(682, 174, 102, 14);
		getContentPane().add(label_1);

		JLabel label_4 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 174, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(8, 268, 102, 14);
		getContentPane().add(label_5);

		JLabel label_7 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(341, 268, 102, 14);
		getContentPane().add(label_7);

		JLabel label_9 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_9.setForeground(Color.WHITE);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(680, 268, 102, 14);
		getContentPane().add(label_9);

		JLabel label_10 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 371, 102, 14);
		getContentPane().add(label_10);

		JLabel label_12 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label_12.setForeground(Color.WHITE);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(343, 371, 102, 14);
		getContentPane().add(label_12);

		JLabel label_14 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_14.setForeground(Color.WHITE);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(682, 371, 102, 14);
		getContentPane().add(label_14);

		JLabel label_15 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_15.setForeground(Color.WHITE);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 494, 102, 14);
		getContentPane().add(label_15);

		JLabel label_17 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label_17.setForeground(Color.WHITE);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(343, 494, 102, 14);
		getContentPane().add(label_17);

		JLabel label_19 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_19.setForeground(Color.WHITE);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(682, 494, 102, 14);
		getContentPane().add(label_19);

		JLabel l_putanna0 = new JLabel(
				"Ви маєте великий рівень умінь ?");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(35, 96, 715, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.RED);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel(
				"Ви збираєтесь використувувати мотоцикл на шосе ?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(35, 203, 715, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.RED);

		JLabel l_putanna2 = new JLabel(
				"Ви збираєтесь використувувати мотоцикл на бездоріжжі ?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(10, 306, 764, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.RED);

		JLabel l_putanna3 = new JLabel(
				"Ви не бажаєте економити на мотоциклі ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(35, 422, 715, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.RED);

		JButton b_vpered2 = new JButton("Вперед 5/5");
		b_vpered2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b_vpered2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC4("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, i_sl_putanna12, i_sl_putanna13, i_sl_putanna14, i_sl_putanna15,
						ii_sl_putanna16, ii_sl_putanna17, ii_sl_putanna18, ii_sl_putanna19);
				setVisible(false);

			}
		});
		b_vpered2.setBounds(650, 517, 134, 36);
		getContentPane().add(b_vpered2);

		JButton b_nazad1 = new JButton("Назад 3/5");
		b_nazad1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC1("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, i_sl_putanna12, i_sl_putanna13, i_sl_putanna14, i_sl_putanna15,
						ii_sl_putanna16, ii_sl_putanna17, ii_sl_putanna18, ii_sl_putanna19);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(-1, 517, 134, 36);
		getContentPane().add(b_nazad1);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/fon_EC.jpg"));
		label_20.setBounds(-1, 0, 785, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna12.addChangeListener(slider12);
		sl_putanna13.addChangeListener(slider13);
		sl_putanna14.addChangeListener(slider14);
		sl_putanna15.addChangeListener(slider15);

	}

	class SliderListener12 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna12 = (JSlider) e.getSource();
			i_sl_putanna12 = (int) sl_putanna12.getValue();
		}
	}

	class SliderListener13 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna13 = (JSlider) e.getSource();
			i_sl_putanna13 = (int) sl_putanna13.getValue();
		}
	}

	class SliderListener14 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna14 = (JSlider) e.getSource();
			i_sl_putanna14 = (int) sl_putanna14.getValue();
		}
	}

	class SliderListener15 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna15 = (JSlider) e.getSource();
			i_sl_putanna15 = (int) sl_putanna15.getValue();
		}
	}

}
