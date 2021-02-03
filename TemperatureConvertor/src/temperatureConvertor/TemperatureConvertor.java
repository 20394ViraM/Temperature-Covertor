package temperatureConvertor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConvertor {

	private JFrame frmTemperatureConvertor;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldq;
	private JTextField textFielda;

	/**
	 * Launch the application.  Completed at 10.28 pm jan 1,2021
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConvertor window = new TemperatureConvertor();
					window.frmTemperatureConvertor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TemperatureConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTemperatureConvertor = new JFrame("Temperature Convertor");
		frmTemperatureConvertor.setBounds(100, 100, 487, 285);
		frmTemperatureConvertor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTemperatureConvertor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the Temperature :");
		lblNewLabel.setBounds(27, 20, 299, 16);
		frmTemperatureConvertor.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From ");
		lblNewLabel_1.setBounds(27, 52, 61, 16);
		frmTemperatureConvertor.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setBounds(27, 80, 61, 16);
		frmTemperatureConvertor.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Celsius", "Kelvin"}));
		comboBox1.setBounds(83, 48, 126, 27);
		frmTemperatureConvertor.getContentPane().add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Celsius", "Kelvin"}));
		comboBox2.setBounds(83, 75, 126, 27);
		frmTemperatureConvertor.getContentPane().add(comboBox2);
		
		textField1 = new JTextField();
		textField1.setBounds(221, 47, 130, 26);
		frmTemperatureConvertor.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(221, 75, 130, 26);
		frmTemperatureConvertor.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton Gobtn = new JButton("Go");
		Gobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String s1 = "" +comboBox1.getItemAt(comboBox1.getSelectedIndex());
				
				String s2 = "" +comboBox2.getItemAt(comboBox2.getSelectedIndex());
				
				if(s1.equals("Select") || s2.equals("Select")) {
					s1= "";
					s2= "";
				}else {
					textField1.setText(s1);
					textField2.setText(s2);
				}
				
			}
		});
		Gobtn.setBounds(375, 49, 85, 47);
		frmTemperatureConvertor.getContentPane().add(Gobtn);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Temperature :");
		lblNewLabel_3.setBounds(27, 108, 176, 16);
		frmTemperatureConvertor.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Resulted Temperature :");
		lblNewLabel_4.setBounds(27, 174, 155, 16);
		frmTemperatureConvertor.getContentPane().add(lblNewLabel_4);
		
		textFieldq = new JTextField();
		textFieldq.setBounds(27, 136, 206, 26);
		frmTemperatureConvertor.getContentPane().add(textFieldq);
		textFieldq.setColumns(10);
		
		textFielda = new JTextField();
		textFielda.setColumns(10);
		textFielda.setBounds(27, 202, 206, 26);
		frmTemperatureConvertor.getContentPane().add(textFielda);
		
		JButton Submitbtn = new JButton("Submit");
		Submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Double a = Double.parseDouble(textFieldq.getText());
				//Double b = Double.parseDouble(textFielda.getText());
				//Fahrenheit
				//Celsius
				//Kelvin
				
				if(textField1.getText().equals("Fahrenheit") && textField2.getText().equals("Fahrenheit")) {
					
					textFielda.setText(a+" F");
					
				}else if(textField1.getText().equals("Celsius") && textField2.getText().equals("Celsius")) {
					
					textFielda.setText(a+" C");
					
				}else if(textField1.getText().equals("Kelvin") && textField2.getText().equals("Kelvin")) {
					
					textFielda.setText(a+" K");
					
				}else if(textField1.getText().equals("Fahrenheit") && textField2.getText().equals("Kelvin")) {
					
					double k1=(a-32)*5/9+273.15;
					textFielda.setText(String.format("%.2f", k1)+" K");
					
					
				}else if(textField1.getText().equals("Celsius") && textField2.getText().equals("Kelvin")) {
					
					double k2=a+273.15;
					textFielda.setText(String.format("%.2f", k2)+" K");
					
				}else if(textField1.getText().equals("Fahrenheit") && textField2.getText().equals("Celsius")) {
					
					double c1=(a-32)/9*5;
					textFielda.setText(String.format("%.2f", c1)+" C");
					
				}else if(textField1.getText().equals("Kelvin") && textField2.getText().equals("Celsius")) {
					
					double c2=a-273.15;
					textFielda.setText(String.format("%.2f", c2)+" C");
					
				}else if(textField1.getText().equals("Celsius") && textField2.getText().equals("Fahrenheit")) {
					
					double f1=(9*a)/5+32 ;
					textFielda.setText(String.format("%.2f", f1)+" F");
					
				}else if(textField1.getText().equals("Kelvin") && textField2.getText().equals("Fahrenheit")) {
					
					double f2=(a-273.15)*9/5+32;
					textFielda.setText(String.format("%.2f", f2)+" F");
					
				}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog( frmTemperatureConvertor ,"Enter Valid Number");
				}
			}
		});
		Submitbtn.setBounds(295, 160, 117, 47);
		frmTemperatureConvertor.getContentPane().add(Submitbtn);
	}
}
