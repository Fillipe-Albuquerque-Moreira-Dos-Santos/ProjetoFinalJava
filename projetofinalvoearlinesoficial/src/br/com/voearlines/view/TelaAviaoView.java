package br.com.voearlines.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;


public class TelaAviaoView extends JFrame implements ActionListener  {
	
	public TelaAviaoView() {

	setTitle("Cadastro de Aviões");
	setResizable(false);
	setSize(820, 420);
	setLocationRelativeTo(null);
	setLayout(new FlowLayout());

	JLabel imagem = new JLabel();
	Icon fundo = new ImageIcon("C:\\Users\\Senhor Sheshomaru\\Desktop\\projetoavaliacaodois\\projetofinalvoearlinesoficial\\imagem\\aviao.jpg");
	imagem.setIcon(fundo);
	add(imagem);
	
	
	 JMenuBar menuBar = new JMenuBar();
	 setJMenuBar(menuBar);
	 
	   JMenu cadAeronaves = new JMenu("Cadastro de Aeronaves");
	   JMenu sobre = new JMenu("Sobre");
       menuBar.add(cadAeronaves);
       menuBar.add(sobre);
       
       JMenuItem ca = new JMenuItem("Cadastrar Aeronave");
       JMenuItem cadtipo= new JMenuItem("Cadastrar Tipo de Aeronave");
       JMenuItem sistema= new JMenuItem("Sistema");
   
       cadAeronaves.add(ca);
       cadAeronaves.add(cadtipo);
       sobre.add(sistema);
   
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Evento - Click

	}

	}
	
