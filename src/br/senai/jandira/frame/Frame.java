package br.senai.jandira.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {
	
	public void criarTela() {	
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(300, 350);
		minhaTela.setTitle("Hello, guy!");
		minhaTela.setLayout(null);
		
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Digite seu nome:");
		lblNome.setBounds(20, 5, 100, 30);
		
		JTextField txtNome = new JTextField();
		txtNome.setText("");
		txtNome.setBounds(20, 40, 150, 30);
		
		JButton btnOk = new JButton();
		btnOk.setText("Ok");
		btnOk.setBounds(195, 40, 70, 30);
		btnOk.setBackground(Color.ORANGE);
		
		JLabel lblOla = new JLabel();
		lblOla.setText("");
		lblOla.setBounds(20, 75, 150, 30);
		
		
		minhaTela.getContentPane().add(lblNome);
		minhaTela.getContentPane().add(txtNome);
		minhaTela.getContentPane().add(btnOk);
		minhaTela.getContentPane().add(lblOla);
		minhaTela.setVisible(true);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				lblOla.setText("Olá, " + nome);
				
			}
		});
		
		
		
	}
}
