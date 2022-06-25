package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.Dimension;
import javax.swing.JComboBox;
//import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Restaurants {

	private JFrame frame;
	private JTextField jtxtChickenBurger;
	private JTextField jtxtChickenBurgerMeal;
	private JTextField jtxtTandooriZingerBurger;
	private JTextField jtxtQty;
	private JTextField jtxtDisplay;
	private JTextField jtxtAlmond;
	private JTextField jtxtLemon;
	private JTextField jtxtPhirni;
	private JTextField jtxtKheer;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(22, 107, 531, 230);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Label_1 = new JLabel("Chicken Burger");
		Label_1.setFont(new Font("Serif", Font.BOLD, 25));
		Label_1.setBounds(22, 10, 228, 39);
		panel.add(Label_1);
		
		JLabel Label_2 = new JLabel("Chicken Burger meal");
		Label_2.setFont(new Font("Serif", Font.BOLD, 25));
		Label_2.setBounds(22, 46, 256, 39);
		panel.add(Label_2);
		
		JLabel Label_3 = new JLabel("Tandoori Zinger Burger");
		Label_3.setFont(new Font("Serif", Font.BOLD, 25));
		Label_3.setBounds(20, 86, 276, 33);
		panel.add(Label_3);
		
		jtxtChickenBurger = new JTextField();
		jtxtChickenBurger.setBounds(306, 26, 175, 19);
		panel.add(jtxtChickenBurger);
		jtxtChickenBurger.setColumns(10);
		
		jtxtChickenBurgerMeal = new JTextField();
		jtxtChickenBurgerMeal.setColumns(10);
		jtxtChickenBurgerMeal.setBounds(306, 62, 175, 19);
		panel.add(jtxtChickenBurgerMeal);
		
		jtxtTandooriZingerBurger = new JTextField();
		jtxtTandooriZingerBurger.setColumns(10);
		jtxtTandooriZingerBurger.setBounds(306, 99, 175, 19);
		panel.add(jtxtTandooriZingerBurger);
		
		jtxtQty = new JTextField();
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(296, 173, 175, 19);
		panel.add(jtxtQty);
		
		JLabel Label_1_1 = new JLabel("Drinks");
		Label_1_1.setFont(new Font("Serif", Font.BOLD, 25));
		Label_1_1.setBounds(20, 129, 228, 39);
		panel.add(Label_1_1);
		
		JLabel Label_1_2 = new JLabel("Qty");
		Label_1_2.setFont(new Font("Serif", Font.BOLD, 25));
		Label_1_2.setBounds(300, 124, 106, 39);
		panel.add(Label_1_2);
		
		final JComboBox jcmbdrink = new JComboBox();
		jcmbdrink.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jcmbdrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Tea", "Ice Tea", "Coffee", "Ice Coffee", "Cola", "Coke", "Orange", "Apple Juice"}));
		jcmbdrink.setBackground(Color.WHITE);
		jcmbdrink.setForeground(Color.BLACK);
		jcmbdrink.setBounds(22, 172, 153, 21);
		panel.add(jcmbdrink);
		
		final JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jCTax.setBounds(296, 199, 93, 21);
		panel.add(jCTax);
		
		final JCheckBox jCDelivery = new JCheckBox("Home Delivery");
		jCDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jCDelivery.setBounds(22, 199, 166, 21);
		panel.add(jCDelivery);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 129, 511, 2);
		panel.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(563, 107, 323, 230);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDesserts = new JLabel("Desserts");
		lblDesserts.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		lblDesserts.setBounds(114, 10, 115, 39);
		panel_2.add(lblDesserts);
		
		JLabel Label_1_3 = new JLabel("Almond Malai Kulfi");
		Label_1_3.setFont(new Font("Serif", Font.BOLD, 20));
		Label_1_3.setBounds(10, 47, 219, 39);
		panel_2.add(Label_1_3);
		
		JLabel Label_1_3_1 = new JLabel("Lemon Tart");
		Label_1_3_1.setFont(new Font("Serif", Font.BOLD, 20));
		Label_1_3_1.setBounds(10, 84, 219, 39);
		panel_2.add(Label_1_3_1);
		
		JLabel Label_1_3_2 = new JLabel("Pistachio Phirni");
		Label_1_3_2.setFont(new Font("Serif", Font.BOLD, 20));
		Label_1_3_2.setBounds(10, 131, 219, 39);
		panel_2.add(Label_1_3_2);
		
		JLabel Label_1_3_3 = new JLabel("Coconut Kheer");
		Label_1_3_3.setFont(new Font("Serif", Font.BOLD, 20));
		Label_1_3_3.setBounds(10, 169, 219, 39);
		panel_2.add(Label_1_3_3);
		
		jtxtAlmond = new JTextField();
		jtxtAlmond.setColumns(10);
		jtxtAlmond.setBounds(191, 61, 110, 19);
		panel_2.add(jtxtAlmond);
		
		jtxtLemon = new JTextField();
		jtxtLemon.setColumns(10);
		jtxtLemon.setBounds(191, 98, 110, 19);
		panel_2.add(jtxtLemon);
		
		jtxtPhirni = new JTextField();
		jtxtPhirni.setColumns(10);
		jtxtPhirni.setBounds(191, 140, 110, 19);
		panel_2.add(jtxtPhirni);
		
		jtxtKheer = new JTextField();
		jtxtKheer.setColumns(10);
		jtxtKheer.setBounds(191, 180, 110, 19);
		panel_2.add(jtxtKheer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(896, 107, 425, 412);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 34, 377, 368);
		panel_1.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea jtxtReceipts = new JTextArea();
		jtxtReceipts.setBounds(0, 0, 372, 341);
		panel_6.add(jtxtReceipts);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtDisplay.setBounds(10, 10, 246, 53);
		panel_7.add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn9.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn9.setBackground(Color.LIGHT_GRAY);
		
		jbtn9.setBounds(10, 79, 50, 50);
		panel_7.add(jbtn9);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn8.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn8.setBackground(Color.LIGHT_GRAY);
		jbtn8.setBounds(87, 79, 50, 50);
		panel_7.add(jbtn8);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn7.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn7.setBackground(Color.LIGHT_GRAY);
		jbtn7.setBounds(170, 79, 50, 50);
		panel_7.add(jbtn7);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn6.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn6.setBackground(Color.LIGHT_GRAY);
		jbtn6.setBounds(10, 139, 50, 50);
		panel_7.add(jbtn6);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn5.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn5.setBackground(Color.LIGHT_GRAY);
		jbtn5.setBounds(87, 139, 50, 50);
		panel_7.add(jbtn5);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn4.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn4.setBackground(Color.LIGHT_GRAY);
		jbtn4.setBounds(170, 139, 50, 50);
		panel_7.add(jbtn4);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn3.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn3.setBackground(Color.LIGHT_GRAY);
		jbtn3.setBounds(10, 199, 50, 50);
		panel_7.add(jbtn3);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn2.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn2.setBackground(Color.LIGHT_GRAY);
		jbtn2.setBounds(87, 199, 50, 50);
		panel_7.add(jbtn2);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn1.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn1.setBackground(Color.LIGHT_GRAY);
		jbtn1.setBounds(170, 199, 50, 50);
		panel_7.add(jbtn1);
		
		JButton jbtnequal = new JButton("=");
		jbtnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(jtxtDisplay.getText());
				if(operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					jtxtDisplay.setText(answer);
				}
				
				else if (operations == "+") {
					result = firstnum + secondnum;
			        answer = String.format("%.2f",result );
							jtxtDisplay.setText(answer);
							
				}
	        	else if (operations == "*") {
					result = firstnum*secondnum;
					answer = String.format("%.2f", result);
					jtxtDisplay.setText(answer);
					
				}
			}
		});
		jbtnequal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnequal.setBackground(Color.LIGHT_GRAY);
		jbtnequal.setBounds(283, 10, 50, 50);
		panel_7.add(jbtnequal);
		
		JButton jbtnadd = new JButton("+");
		jbtnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText("");
				operations = "+";
			}
		});
		jbtnadd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnadd.setBackground(Color.LIGHT_GRAY);
		jbtnadd.setBounds(261, 79, 50, 50);
		panel_7.add(jbtnadd);
		
		JButton jbtnsub = new JButton("-");
		jbtnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText("");
				operations = "-";
			}
		});
		jbtnsub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnsub.setBackground(Color.LIGHT_GRAY);
		jbtnsub.setBounds(261, 139, 50, 50);
		panel_7.add(jbtnsub);
		
		JButton jbtnmultiply = new JButton("*");
		jbtnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText("");
				operations = "*";
			}
		});
		jbtnmultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnmultiply.setBackground(Color.LIGHT_GRAY);
		jbtnmultiply.setBounds(261, 199, 50, 50);
		panel_7.add(jbtnmultiply);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtn0.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtn0.setBackground(Color.LIGHT_GRAY);
		jbtn0.setBounds(87, 259, 50, 50);
		panel_7.add(jbtn0);
		
		JButton jbtndecimal = new JButton(".");
		jbtndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtDisplay.getText()+ jbtndecimal.getText();
				jtxtDisplay.setText(EnterNumber);
			}
		});
		jbtndecimal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtndecimal.setBackground(Color.LIGHT_GRAY);
		jbtndecimal.setBounds(10, 259, 50, 50);
		panel_7.add(jbtndecimal);
		
		JButton jbtnback = new JButton("\u2190");
		jbtnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(jtxtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
					strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
					backspace=strB.toString();
					jtxtDisplay.setText(backspace);
					
					
					
				}
			}
		});
		jbtnback.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtnback.setBackground(Color.LIGHT_GRAY);
		jbtnback.setBounds(170, 259, 50, 50);
		panel_7.add(jbtnback);
		
		JButton jbtnC = new JButton("C");
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
			}
		});
		jbtnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnC.setBackground(Color.LIGHT_GRAY);
		jbtnC.setBounds(261, 259, 50, 50);
		panel_7.add(jbtnC);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(22, 347, 531, 172);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Label_5 = new JLabel("Cost of Drinks");
		Label_5.setFont(new Font("Serif", Font.BOLD, 25));
		Label_5.setBounds(36, 26, 171, 27);
		panel_3.add(Label_5);
		
		JLabel Label_6 = new JLabel("Cost of Meal");
		Label_6.setFont(new Font("Serif", Font.BOLD, 25));
		Label_6.setBounds(36, 71, 171, 28);
		panel_3.add(Label_6);
		
		JLabel Label_7 = new JLabel("Cost of Delivery");
		Label_7.setFont(new Font("Serif", Font.BOLD, 25));
		Label_7.setBounds(36, 118, 197, 27);
		panel_3.add(Label_7);
		
		final JLabel jlblCostofDrinks = new JLabel("");
		jlblCostofDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDrinks.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblCostofDrinks.setBounds(306, 29, 164, 20);
		jlblCostofDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_3.add(jlblCostofDrinks);
		
		final JLabel jlblCostofMeal = new JLabel("");
		jlblCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofMeal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		jlblCostofMeal.setBounds(306, 71, 164, 20);
		panel_3.add(jlblCostofMeal);
		
		final JLabel jlblCostofDelivery = new JLabel("");
		jlblCostofDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDelivery.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblCostofDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		jlblCostofDelivery.setBounds(306, 118, 164, 20);
		panel_3.add(jlblCostofDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(563, 347, 323, 172);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		final JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		jlblTax.setBounds(128, 30, 164, 20);
		panel_4.add(jlblTax);
		
		final JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		jlblSubTotal.setBounds(128, 74, 164, 20);
		panel_4.add(jlblSubTotal);
		
		final JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		jlblTotal.setBounds(128, 112, 164, 20);
		panel_4.add(jlblTotal);
		
		JLabel Label_9 = new JLabel("Tax");
		Label_9.setFont(new Font("Serif", Font.BOLD, 25));
		Label_9.setBounds(10, 16, 81, 34);
		panel_4.add(Label_9);
		
		JLabel Label_10 = new JLabel("Sub Total");
		Label_10.setFont(new Font("Serif", Font.BOLD, 25));
		Label_10.setBounds(10, 66, 108, 28);
		panel_4.add(Label_10);
		
		JLabel Label_11 = new JLabel("Total");
		Label_11.setFont(new Font("Serif", Font.BOLD, 25));
		Label_11.setBounds(10, 104, 94, 34);
		panel_4.add(Label_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(22, 529, 1299, 113);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jbtnEXIT = new JButton("EXIT");
		jbtnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbtnEXIT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnEXIT.setBounds(765, 47, 102, 21);
		panel_5.add(jbtnEXIT);
		
		JButton jbtnRESET = new JButton("RESET");
		jbtnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			jlblCostofDelivery.setText(null);
			jlblSubTotal.setText(null);
			jlblTotal.setText(null);
			jlblTax.setText(null);
			jlblCostofDelivery.setText(null);
			jlblCostofDrinks.setText(null);
			jlblCostofMeal.setText("0");
			jlblSubTotal.setText(null);
			jlblTax.setText(null);
			jlblTotal.setText(null);
			jtxtChickenBurger.setText(null);
			jtxtChickenBurgerMeal.setText(null);
			jtxtTandooriZingerBurger.setText(null);
			jtxtAlmond.setText(null);
			jtxtLemon.setText(null);
			jtxtKheer.setText(null);
			jtxtPhirni.setText(null);
			jtxtQty.setText(null);
			jcmbdrink.setSelectedItem("Select a drink");
			
			
				
			}
		});
		jbtnRESET.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnRESET.setBounds(557, 47, 109, 21);
		panel_5.add(jbtnRESET);
		
		JButton jbtnRECEIPT = new JButton("RECEIPT");
		jbtnRECEIPT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						double Qty1 = Double.parseDouble(jtxtChickenBurger.getText());
						double Qty2 = Double.parseDouble(jtxtChickenBurgerMeal.getText());
						double Qty3 = Double.parseDouble(jtxtTandooriZingerBurger.getText());
						double Qty4 = Double.parseDouble(jtxtAlmond.getText());
						double Qty5 = Double.parseDouble(jtxtLemon.getText());
						double Qty6 = Double.parseDouble(jtxtPhirni.getText());
						double Qty7 = Double.parseDouble(jtxtKheer.getText());
						
						
						jtxtReceipts.append("\t\nRestaurant Management System :\n\n"
						+"Chicken Burger :\t\t"+Qty1
						+"\nChicken Burger Meal:\t\t"+Qty2
						+"\nTandoori Zinger Burger:\t\t"+Qty3+
						"\nAlmond Malai Khulfi:\t\t"+Qty4+
						"\nLemon Tart       :\t\t"+Qty5+
						"\nPistachio Phirni:\t\t"+Qty6+
						"\nCoconut Kheer    :\t\t"+Qty7
						+"\n----------------\t\t"+
						"\nTax:\t\t"  + jlblTax.getText()+
						"\nSub Toatal :\t\t" + jlblSubTotal.getText() + 
						"\nTotal  :\t\t"+ jlblTotal.getText() +
						"\nTHANKS FOR VISITING \t\t");
						
						
					
			}
		});
		
	
		jbtnRECEIPT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnRECEIPT.setBounds(343, 47, 125, 21);
		panel_5.add(jbtnRECEIPT);
		
		JButton jbtnTOTAL = new JButton("TOTAL");
		jbtnTOTAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ChickenBurger = Double.parseDouble(jtxtChickenBurger.getText());
				double iChickenBurger = 2.39;
				double Burger;
				Burger = (ChickenBurger * iChickenBurger);
				String pMeal = String.format("%.2f", Burger);
				jlblCostofMeal.setText(pMeal);
				
				double ChickenBurgerMeal = Double.parseDouble(jtxtChickenBurgerMeal.getText());
				double iChickenBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = (ChickenBurgerMeal * iChickenBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostofMeal.setText(cbMeal);
				
				double TandooriZingerBurger = Double.parseDouble(jtxtTandooriZingerBurger.getText());
				double TandooriZingerBurgerPrice = 3.39;
				double TandooriBurger;
				TandooriBurger = ( TandooriZingerBurger*TandooriZingerBurgerPrice );
				String tandoori = String.format("%.2f",TandooriBurger +BurgerMeal + Burger);
				jlblCostofMeal.setText(tandoori);
				
			double AlmondMalaiKhulfi = Double.parseDouble(jtxtAlmond.getText());
			double AlmondMalaiKhulfiPrice = 5;
			double AlmondKhulfi;
			AlmondKhulfi = (AlmondMalaiKhulfi*AlmondMalaiKhulfiPrice);
			String Almond = String.format("%.2f", AlmondKhulfi + TandooriBurger +BurgerMeal + Burger);
			jlblCostofMeal.setText(Almond);
			
			double LemonTart = Double.parseDouble(jtxtLemon.getText());
			double LemonTartPrice = 4;
			double Lemon;
			Lemon = (LemonTart*LemonTartPrice);
			String Lemondes = String.format("%.2f", Lemon +AlmondKhulfi + TandooriBurger +BurgerMeal + Burger);
			jlblCostofMeal.setText(Lemondes);
			
			double PistachioPhirni = Double.parseDouble(jtxtPhirni.getText());
			double PistachioPhirniPrice = 6;
			double Pistachio;
			Pistachio = (PistachioPhirni*PistachioPhirniPrice);
			String Phirni = String.format("%.2f", Pistachio +Lemon +AlmondKhulfi + TandooriBurger +BurgerMeal + Burger);
			jlblCostofMeal.setText(Phirni);
			
			double CoconutKheer = Double.parseDouble(jtxtKheer.getText());
			double CoconutKheerPrice = 3;
			double Coconut;
			Coconut = (CoconutKheer*CoconutKheerPrice);
			String Kheer= String.format("%.2f", Coconut + Pistachio +Lemon +AlmondKhulfi + TandooriBurger +BurgerMeal + Burger);
			jlblCostofMeal.setText(Kheer);
			
			
			
			
			
			
			
			
			
				//-----------delivery---------
				double iDelivery = 3.39;
				if(jCDelivery.isSelected()) {
					String pDelivery=String.format("%.2f", iDelivery);
					jlblCostofDelivery.setText(pDelivery);
				}
				else {
					jlblCostofDelivery.setText("0");
				}
				//-------------Drinks--------
					double Drinks = Double.parseDouble(jtxtQty.getText());
					double Tea = 1.20*Drinks;
					double Ice_Tea = 0.90*Drinks;
					double Cola = 2.10*Drinks;
					double Ice_Coffee = 1.10*Drinks;
					double Coke = 1.60*Drinks;
					double Orange= 1.70*Drinks;
					double Apple_Juice = 1.99*Drinks;
					double Coffee = 2.50*Drinks;
					
					if (jcmbdrink.getSelectedItem().equals("Apple Juice")) {
						String cApple_Juice = String.format("%.2f",Apple_Juice);
						jlblCostofDrinks.setText(cApple_Juice);
					}
					if (jcmbdrink.getSelectedItem().equals("Tea")) {
						String cTea = String.format("%.2f",Tea);
						jlblCostofDrinks.setText(cTea);
					}
					if (jcmbdrink.getSelectedItem().equals("Ice Tea")) {
						String cIce_Tea = String.format("%.2f",Ice_Tea);
						jlblCostofDrinks.setText(cIce_Tea);
					}
					if (jcmbdrink.getSelectedItem().equals("Cola")) {
						String cCola = String.format("%.2f",Cola);
						jlblCostofDrinks.setText(cCola);
					}
					if (jcmbdrink.getSelectedItem().equals("Coke")) {
					String cCoke = String.format("%.2f",Coke);
					jlblCostofDrinks.setText(cCoke);
					}
					if (jcmbdrink.getSelectedItem().equals("Ice Coffee")) {
						String cIce_Coffee = String.format("%.2f",Ice_Coffee);
					jlblCostofDrinks.setText(cIce_Coffee);
					}
					if (jcmbdrink.getSelectedItem().equals("Orange")) {
						String cOrange = String.format("%.2f",Orange);
						jlblCostofDrinks.setText(cOrange);
					}
				    if (jcmbdrink.getSelectedItem().equals("Coffee")) {
						String cCoffee = String.format("%.2f",Coffee);
						jlblCostofDrinks.setText(cCoffee);
					}
					if(jcmbdrink.getSelectedItem().equals("Select a drink")){
						jlblCostofDrinks.setText("0");
					}
			        //--------Tax Rate--------------
					double cTotal1 = Double.parseDouble(jlblCostofDrinks.getText());
					double cTotal2 = Double.parseDouble(jlblCostofMeal.getText());
					double cTotal3 = Double.parseDouble(jlblCostofDelivery.getText());
					double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
					if(jCTax.isSelected()) 
					{
						String iTotal = String.format("%.2f",AllTotal);
						jlblTax.setText(iTotal);
					}
					//------------Total-------
					double cTotal4 = Double.parseDouble(jlblTax.getText());
					
					double subTotal = (cTotal1+cTotal2+cTotal3);
					String isubTotal = String.format("� %.2f",subTotal);
					jlblSubTotal.setText(isubTotal);
					double allTotal = (cTotal1+cTotal2+cTotal3+AllTotal);
					String iTotal = String.format("� %.2f",allTotal);
					jlblTotal.setText(iTotal);
					
					String iTaxTotal = String.format("� %.2f", cTotal4);
					jlblTax.setText(iTaxTotal);
			}
		});
		jbtnTOTAL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnTOTAL.setBounds(142, 47, 109, 21);
		panel_5.add(jbtnTOTAL);
		
		JLabel Label = new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		Label.setFont(new Font("Times New Roman", Font.ITALIC, 64));
		Label.setBounds(112, 35, 1097, 62);
		frame.getContentPane().add(Label);
	}
}
