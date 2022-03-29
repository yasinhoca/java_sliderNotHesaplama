package notHesapla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class form1 extends JFrame {

	private JPanel contentPane;
	private JTextField vtxt;
	private JTextField ftxt;
	private JTextField otxt;
	int v,f;
	float ort;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 392);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider vslider = new JSlider();		
		vslider.setMinorTickSpacing(5);
		vslider.setPaintLabels(true);
		vslider.setMajorTickSpacing(20);
		vslider.setBackground(Color.WHITE);
		vslider.setPaintTicks(true);
		vslider.setBounds(100, 42, 510, 43);
		contentPane.add(vslider);
		
		JLabel lblNewLabel = new JLabel("Vize");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(333, 10, 59, 22);
		contentPane.add(lblNewLabel);
		
		vtxt = new JTextField();
		vtxt.setText("50");
		vtxt.setHorizontalAlignment(SwingConstants.CENTER);
		vtxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		vtxt.setBounds(23, 42, 67, 25);
		contentPane.add(vtxt);
		vtxt.setColumns(10);
		
		JLabel lblFinal = new JLabel("Final");
		lblFinal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblFinal.setBounds(333, 120, 59, 22);
		contentPane.add(lblFinal);
		
		ftxt = new JTextField();
		ftxt.setText("50");
		ftxt.setHorizontalAlignment(SwingConstants.CENTER);
		ftxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ftxt.setColumns(10);
		ftxt.setBounds(23, 152, 67, 25);
		contentPane.add(ftxt);
		
		JSlider fslider = new JSlider();
		fslider.setPaintTicks(true);
		fslider.setPaintLabels(true);
		fslider.setMinorTickSpacing(5);
		fslider.setMajorTickSpacing(20);
		fslider.setBackground(Color.WHITE);
		fslider.setBounds(98, 152, 530, 43);
		contentPane.add(fslider);
		
		JLabel lblOrtalama = new JLabel("Ortalama");
		lblOrtalama.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOrtalama.setBounds(308, 247, 122, 22);
		contentPane.add(lblOrtalama);
		
		otxt = new JTextField();
		otxt.setText("50");
		otxt.setHorizontalAlignment(SwingConstants.CENTER);
		otxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		otxt.setColumns(10);
		otxt.setBounds(21, 282, 67, 25);
		contentPane.add(otxt);
		
		JSlider oslider = new JSlider();
		oslider.setPaintTicks(true);
		oslider.setPaintLabels(true);
		oslider.setMinorTickSpacing(5);
		oslider.setMajorTickSpacing(20);
		oslider.setBackground(Color.RED);
		oslider.setBounds(98, 279, 530, 43);
		contentPane.add(oslider);
		
		v=f=0;
		ort = 0f;
		
		vslider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v = vslider.getValue();
				vtxt.setText(Integer.toString(v));
				f = fslider.getValue();
				ort = (float) ((float) 0.4*v+0.60*f);
				oslider.setValue(Math.round(ort));
				otxt.setText(Integer.toString(Math.round(ort)));
				if(ort>=60) oslider.setBackground(Color.GREEN);
				else oslider.setBackground(Color.RED);
			}
		});
		
		fslider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v = vslider.getValue();
				f = fslider.getValue();
				ftxt.setText(Integer.toString(f));
				ort = (float) ((float) 0.4*v+0.60*f);
				oslider.setValue(Math.round(ort));
				otxt.setText(Integer.toString(Math.round(ort)));
				if(ort>=60) oslider.setBackground(Color.GREEN);
				else oslider.setBackground(Color.RED);
			}
		});
	}
}
