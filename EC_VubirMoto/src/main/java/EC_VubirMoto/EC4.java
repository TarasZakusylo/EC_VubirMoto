package EC_VubirMoto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EC4 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna16;
	private JSlider sl_putanna17;
	private JSlider sl_putanna18;
	private JSlider sl_putanna19;

	int i_sl_putanna16 = 3;
	int i_sl_putanna17 = 3;
	int i_sl_putanna18 = 3;
	int i_sl_putanna19 = 3;

	SliderListener16 slider16 = new SliderListener16();
	SliderListener17 slider17 = new SliderListener17();
	SliderListener18 slider18 = new SliderListener18();
	SliderListener19 slider19 = new SliderListener19();

	private int i_sl_putanna10 = 3;
	private int i_sl_putanna11 = 3;

	EC4(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2,
			final int ii_sl_putanna3, final int ii_sl_putanna4, final int ii_sl_putanna5, final int ii_sl_putanna6,
			final int ii_sl_putanna7, final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10,
			final int ii_sl_putanna11, final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15, final int ii_sl_putanna16, final int ii_sl_putanna17, final int ii_sl_putanna18,
			final int ii_sl_putanna19) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna16 = ii_sl_putanna16;
		this.i_sl_putanna17 = ii_sl_putanna17;
		this.i_sl_putanna18 = ii_sl_putanna18;
		this.i_sl_putanna19 = ii_sl_putanna19;

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

		JLabel l_nazva = new JLabel("Який мотоцикл Вам підходить ?");
		l_nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_nazva.setBounds(51, 11, 647, 50);
		getContentPane().add(l_nazva);
		l_nazva.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_nazva.setForeground(Color.green);

		JLabel l_komentar = new JLabel(
				"\u041F\u0440\u043E\u0439\u0434\u0456\u0442\u044C, \u0431\u0443\u0434\u044C \u043B\u0430\u0441\u043A\u0430, \u043C\u0456\u043D\u0456\u043E\u043F\u0438\u0442\u0443\u0432\u0430\u043D\u043D\u044F");
		l_komentar.setForeground(Color.WHITE);
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(193, 74, 398, 14);
		getContentPane().add(l_komentar);

		JLabel l_komentar1 = new JLabel(
				"\u0414\u0430\u0432\u0430\u0439\u0442\u0435 \u0432\u0456\u0434\u043F\u043E\u0432\u0456\u0434\u0456 \u0447\u0435\u0441\u043D\u043E \u0442\u0430 \u043D\u0435 \u0437\u0432\u0435\u0440\u0442\u0430\u0439\u0442\u0435 \u0443\u0432\u0430\u0433\u0438, \u044F\u043A\u0449\u043E \u0437\u0430\u043F\u0438\u0442\u0430\u043D\u043D\u044F \u0432\u0438\u044F\u0432\u043B\u044F\u0442\u044C\u0441\u044F \u0434\u0438\u0432\u043D\u0438\u043C\u0438.\r\n");
		l_komentar1.setForeground(Color.WHITE);
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setBounds(-1, 537, 785, 14);

		sl_putanna16 = new JSlider(0, 1, 5, i_sl_putanna16);
		getContentPane().add(l_komentar1);
		sl_putanna16.setMinorTickSpacing(1);
		sl_putanna16.setOpaque(false);
		sl_putanna16.setPaintTicks(true);
		sl_putanna16.setPaintLabels(true);
		sl_putanna16.setBounds(35, 136, 715, 40);
		getContentPane().add(sl_putanna16);

		sl_putanna17 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna17);
		sl_putanna17.setPaintTicks(true);
		sl_putanna17.setPaintLabels(true);
		sl_putanna17.setOpaque(false);
		sl_putanna17.setMinorTickSpacing(1);
		sl_putanna17.setBounds(35, 230, 715, 40);
		getContentPane().add(sl_putanna17);

		sl_putanna18 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna18);
		sl_putanna18.setPaintTicks(true);
		sl_putanna18.setPaintLabels(true);
		sl_putanna18.setOpaque(false);
		sl_putanna18.setMinorTickSpacing(1);
		sl_putanna18.setBounds(35, 332, 715, 40);
		getContentPane().add(sl_putanna18);

		sl_putanna19 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna19);
		sl_putanna19.setPaintTicks(true);
		sl_putanna19.setPaintLabels(true);
		sl_putanna19.setOpaque(false);
		sl_putanna19.setMinorTickSpacing(1);
		sl_putanna19.setBounds(35, 451, 715, 40);
		getContentPane().add(sl_putanna19);

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
				"\u0412\u0438 \u0437\u0430\u0437\u0432\u0438\u0447\u0430\u0439 \u043F\u0435\u0440\u0448\u0438\u043C\u0438 \u043F\u0440\u043E\u044F\u0432\u043B\u044F\u0454\u0442\u0435 \u0456\u043D\u0456\u0446\u0456\u0430\u0442\u0438\u0432\u0443 \u043F\u0440\u0438 \u0437\u043D\u0430\u0439\u043E\u043C\u0441\u0442\u0432\u0456?");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(35, 96, 715, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.RED);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel(
				"\u0423 \u0432\u0430\u0441 \u0447\u0430\u0441\u0442\u043E \u0431\u0443\u0432\u0430\u044E\u0442\u044C \u0441\u043F\u0430\u0434\u0438 \u0456 \u043F\u0456\u0434\u0439\u043E\u043C\u0438 \u043D\u0430\u0441\u0442\u0440\u043E\u044E?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(35, 203, 715, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.RED);

		JLabel l_putanna2 = new JLabel(
				"\u0412\u0430\u043C \u043D\u0435\u043F\u0440\u0438\u0454\u043C\u043D\u043E \u0437\u043D\u0430\u0445\u043E\u0434\u0438\u0442\u0438\u0441\u044F \u0441\u0435\u0440\u0435\u0434 \u043B\u044E\u0434\u0435\u0439, \u044F\u043A\u0456 \u0436\u0430\u0440\u0442\u0443\u044E\u0442\u044C \u043D\u0430\u0434 \u0442\u043E\u0432\u0430\u0440\u0438\u0448\u0430\u043C\u0438?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(10, 306, 764, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.RED);

		JLabel l_putanna3 = new JLabel(
				"\u042F\u043A \u0432\u0438 \u0432\u0456\u0434\u0447\u0443\u0432\u0430\u0454\u0442\u0435 \u0431\u0430\u043B\u0430\u043D\u0441 / \u0440\u0456\u0432\u043D\u043E\u0432\u0430\u0433\u0443 ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(35, 422, 715, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.RED);

		JButton b_gotovo = new JButton("\u0413\u043E\u0442\u043E\u0432\u043E\r\n");
		b_gotovo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b_gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				switch (ii_sl_putanna10) {
				case 1: {
					i_sl_putanna10 = 5;
				}
					break;
				case 2: {
					i_sl_putanna10 = 4;
				}
					break;
				case 4: {
					i_sl_putanna10 = 2;
				}
					break;
				case 5: {
					i_sl_putanna10 = 1;
				}
					break;
				}

				switch (ii_sl_putanna11) {
				case 1: {
					i_sl_putanna11 = 5;
				}
					break;
				case 2: {
					i_sl_putanna11 = 4;
				}
					break;
				case 4: {
					i_sl_putanna11 = 2;
				}
					break;
				case 5: {
					i_sl_putanna11 = 1;
				}
					break;
				}

				switch (ii_sl_putanna18) {
				case 1: {
					i_sl_putanna18 = 5;
				}
					break;
				case 2: {
					i_sl_putanna18 = 4;
				}
					break;
				case 4: {
					i_sl_putanna18 = 2;
				}
					break;
				case 5: {
					i_sl_putanna18 = 1;
				}
					break;
				}

//				int indekator_komanda, indekator_temperament, indekator_trener, indekator_balans;
				int	indekator_dostovirnosti = 0;

//				double komanda = (ii_sl_putanna0 + ii_sl_putanna1 + ii_sl_putanna2 + ii_sl_putanna3) / 4;
//
//				if (komanda >= 3) {
//					indekator_komanda = 1;
//				} else {
//					indekator_komanda = 0;
//				}
//
//				double temperament = (ii_sl_putanna0 + ii_sl_putanna1 + ii_sl_putanna2 + ii_sl_putanna3 + ii_sl_putanna4
//						+ ii_sl_putanna5 + ii_sl_putanna6 + ii_sl_putanna7 + ii_sl_putanna8 + ii_sl_putanna9
//						+ i_sl_putanna10 + i_sl_putanna11 + ii_sl_putanna12 + ii_sl_putanna13 + ii_sl_putanna14
//						+ ii_sl_putanna15 + ii_sl_putanna16 + ii_sl_putanna17 + i_sl_putanna18 + ii_sl_putanna19) / 20;
//
//				if (temperament >= 3) {
//					indekator_temperament = 1;
//				} else {
//					indekator_temperament = 0;
//				}
//
//				double trener = (ii_sl_putanna8 + ii_sl_putanna9 + i_sl_putanna10 + i_sl_putanna11) / 4;
//
//				if (trener >= 3) {
//					indekator_trener = 1;
//				} else {
//					indekator_trener = 0;
//				}
//
//				double balans = (ii_sl_putanna16 + ii_sl_putanna17 + i_sl_putanna18 + ii_sl_putanna19) / 4;
//
//				if (balans >= 3) {
//					indekator_balans = 1;
//				} else {
//					indekator_balans = 0;
//				}

				String rezultat = "";

				if (ii_sl_putanna0 == 3 && ii_sl_putanna1 == 3 && ii_sl_putanna2 == 3 && ii_sl_putanna3 == 3
						&& ii_sl_putanna4 == 3 && ii_sl_putanna5 == 3 && ii_sl_putanna6 == 3 && ii_sl_putanna7 == 3
						&& ii_sl_putanna8 == 3 && ii_sl_putanna9 == 3 && i_sl_putanna10 == 3 && i_sl_putanna11 == 3
						&& ii_sl_putanna12 == 3 && ii_sl_putanna13 == 3 && ii_sl_putanna14 == 3 && ii_sl_putanna15 == 3
						&& i_sl_putanna16 == 3 && i_sl_putanna17 == 3 && i_sl_putanna18 == 3 && i_sl_putanna19 == 3) {

					int type2 = JOptionPane.WARNING_MESSAGE;
					JOptionPane.showMessageDialog(null, "Помилка! Не змінено жодного поля.", null, type2);

				} else {

//					System.out.println(ii_sl_putanna13);
//					System.out.println(ii_sl_putanna14);
//					System.out.println(ii_sl_putanna15);

					int i_topologia = 1;

					if ((ii_sl_putanna13 <= 2 && ii_sl_putanna14 <= 2)
							|| (ii_sl_putanna13 >= 3 && ii_sl_putanna14 >= 3)) {
						i_topologia = 1; // універсальна топологія
					}

					if (ii_sl_putanna13 >= 3 && ii_sl_putanna14 <= 2) {
						i_topologia = 2; // шосейна топологія
					}

					if (ii_sl_putanna13 <= 2 && ii_sl_putanna14 >= 3) {
						i_topologia = 3; // бездоріжна топологія
					}
					
					switch (i_topologia) {
					case 1: {
						if (ii_sl_putanna15 <= 2) {
							rezultat = "Турист";
						} else {
							rezultat = "Класика";
						}
					}
						break;
					case 2: {
						if (ii_sl_putanna15 <= 2) {
							rezultat = "Чопер";
						} else {
							rezultat = "Спортивний";
						}
					}
						break;
					case 3: {
						if (ii_sl_putanna15 >= 4) {
							rezultat = "Ендуро";
						} else {
							rezultat = "Кросовий";
						}
					}
						break;
					}

					////////

					// if (indekator_komanda == 1) {
					// if (indekator_temperament == 1) {
					// if (indekator_trener == 1) {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить хокей";
					// } else {
					// rezultat = "Вам найкраще підходить баскетбол, футбол,";
					// }
					// } else {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить веслування";
					// } else {
					// rezultat = "Вам найкраще підходить атоспорт";
					// }
					// }
					// } else {
					// if (indekator_trener == 1) {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить хокей";
					// } else {
					// rezultat = "Вам найкраще підходить баскетбол, футбол,";
					// }
					// } else {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить альпінізм";
					// } else {
					// rezultat = "Вам найкраще підходить туризм, автоспорт";
					// }
					// }
					// }
					// } else {
					// if (indekator_temperament == 1) {
					// if (indekator_trener == 1) {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить важка атлетика,";
					// } else {
					// rezultat = "Вам найкраще підходить легка атлетика, плавання";
					// }
					// } else {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить важка атлетика,";
					// } else {
					// rezultat = "Вам найкраще підходить легка атлетика, плавання";
					// }
					// }
					// } else {
					// if (indekator_trener == 1) {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить гімнастика, фігурне катання";
					// } else {
					// rezultat = "Вам найкраще підходить бойові мистецтва, шахи";
					// }
					// } else {
					// if (indekator_balans == 1) {
					// rezultat = "Вам найкраще підходить гірськолижний спорт";
					// } else {
					// rezultat = "Вам найкраще підходить теніс, стрільба, фехтування";
					// }
					// }
					// }
					// }

					///////

					int dostovirnist = 0;

					if ((ii_sl_putanna0 == 1 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 5 && ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna4 == 1 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 5 && ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna8 == 1 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 5 && i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna12 == 1 && ii_sl_putanna13 == 5 && ii_sl_putanna14 == 5 && ii_sl_putanna15 == 5)
							|| (ii_sl_putanna12 == 5 && ii_sl_putanna13 == 1 && ii_sl_putanna14 == 5
									&& ii_sl_putanna15 == 5)
							|| (ii_sl_putanna12 == 5 && ii_sl_putanna13 == 5 && ii_sl_putanna14 == 1
									&& ii_sl_putanna15 == 5)
							|| (ii_sl_putanna12 == 5 && ii_sl_putanna13 == 5 && ii_sl_putanna14 == 5
									&& ii_sl_putanna15 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna0 == 5 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 1 && ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna4 == 5 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 1 && ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna8 == 5 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 1 && i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna12 == 5 && ii_sl_putanna13 == 1 && ii_sl_putanna14 == 1 && ii_sl_putanna15 == 1)
							|| (ii_sl_putanna12 == 1 && ii_sl_putanna13 == 5 && ii_sl_putanna14 == 1
									&& ii_sl_putanna15 == 1)
							|| (ii_sl_putanna12 == 1 && ii_sl_putanna13 == 1 && ii_sl_putanna14 == 5
									&& ii_sl_putanna15 == 1)
							|| (ii_sl_putanna12 == 1 && ii_sl_putanna13 == 1 && ii_sl_putanna14 == 1
									&& ii_sl_putanna15 == 5)) {
						dostovirnist++;
					}

					if (ii_sl_putanna0 == 3 && ii_sl_putanna1 == 3 && ii_sl_putanna2 == 3 && ii_sl_putanna3 == 3) {
						dostovirnist++;
					}

					if (ii_sl_putanna4 == 3 && ii_sl_putanna5 == 3 && ii_sl_putanna6 == 3 && ii_sl_putanna7 == 3) {
						dostovirnist++;
					}

					if (ii_sl_putanna8 == 3 && ii_sl_putanna9 == 3 && i_sl_putanna10 == 3 && i_sl_putanna11 == 3) {
						dostovirnist++;
					}
					if (ii_sl_putanna12 == 3 && ii_sl_putanna13 == 3 && ii_sl_putanna14 == 3 && ii_sl_putanna15 == 3) {
						dostovirnist++;
					}

					if (dostovirnist >= 3) {
						indekator_dostovirnosti = 2;
					}
					if (dostovirnist == 1 || dostovirnist == 2) {
						indekator_dostovirnosti = 1;
					}
					dostovirnist = 0;
					new EC_rezultat(rezultat, indekator_dostovirnosti);
					setVisible(false);
				}
			}
		});
		b_gotovo.setBounds(654, 517, 128, 36);
		getContentPane().add(b_gotovo);

		JButton b_nazad1 = new JButton("Назад 4/5");
		b_nazad1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC2("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, i_sl_putanna10,
						i_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15,
						i_sl_putanna16, i_sl_putanna17, i_sl_putanna18, i_sl_putanna19);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(-1, 517, 128, 36);
		getContentPane().add(b_nazad1);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/fon_EC.jpg"));
		label_20.setBounds(-1, 0, 785, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna16.addChangeListener(slider16);
		sl_putanna17.addChangeListener(slider17);
		sl_putanna18.addChangeListener(slider18);
		sl_putanna19.addChangeListener(slider19);

	}

	class SliderListener16 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna16 = (JSlider) e.getSource();
			i_sl_putanna16 = (int) sl_putanna16.getValue();
		}
	}

	class SliderListener17 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna17 = (JSlider) e.getSource();
			i_sl_putanna17 = (int) sl_putanna17.getValue();
		}
	}

	class SliderListener18 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna18 = (JSlider) e.getSource();
			i_sl_putanna18 = (int) sl_putanna18.getValue();
		}
	}

	class SliderListener19 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna19 = (JSlider) e.getSource();
			i_sl_putanna19 = (int) sl_putanna19.getValue();
		}
	}

}
