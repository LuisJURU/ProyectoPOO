package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla extends JFrame {

	private JPanel contentPane;

	
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 265, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label Titulo = new Label("Copiadora");
		Titulo.setFont(new Font("Dialog", Font.BOLD, 18));
		Titulo.setBounds(93, 10, 93, 22);
		panel.add(Titulo);
		
		Label label_1 = new Label("Ingrese texto:");
		label_1.setBounds(10, 34, 77, 22);
		panel.add(label_1);
		
		TextField txt_1 = new TextField();
		txt_1.setBounds(10, 62, 190, 22);
		panel.add(txt_1);
		
		Label label_2 = new Label("El texto que usted ingreso es: ");
		label_2.setBounds(10, 145, 176, 22);
		panel.add(label_2);
		
		TextField txt_2 = new TextField();
		txt_2.setBounds(10, 173, 190, 22);
		panel.add(txt_2);
		
		Button btn1 = new Button("Copiar");
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String texto = txt_1.getText();
				txt_2.setText(texto);
				
			}
		});
		btn1.setBounds(10, 90, 70, 22);
		panel.add(btn1);
		
		Button btn2 = new Button("Limpiar");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_1.setText("");
				txt_2.setText("");
				
			}
		});
		btn2.setBounds(10, 201, 70, 22);
		panel.add(btn2);
	}
}
