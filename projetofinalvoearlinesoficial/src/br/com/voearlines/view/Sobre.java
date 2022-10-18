package br.com.voearlines.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sobre extends JFrame {
	
	// Em desenvolvimento
	
	JButton btnRegistrar;
	JTextField txtdescricao;
	JLabel lblSobre;
	JPanel contentPane;

	public Sobre() {

		setTitle("Sobre o sistema");
		//setResizable(false);
		setSize(700, 350);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		contentPane = new JPanel();

		JLabel imagem = new JLabel();
		Icon fundo = new ImageIcon("aviao.jpg");
		imagem.setIcon(fundo);
		add(imagem);

		lblSobre = new JLabel("©2022 Senai - Fillipe Albuquerque -- Versão 1.0");
		lblSobre.setFont(new Font("Ubuntu", Font.BOLD, 30));
		lblSobre.setForeground(SystemColor.white);
		lblSobre.setBounds(60, 70, 750, 150);
		contentPane.add(lblSobre);
		imagem.add(lblSobre);


	

	}

	
	
}
