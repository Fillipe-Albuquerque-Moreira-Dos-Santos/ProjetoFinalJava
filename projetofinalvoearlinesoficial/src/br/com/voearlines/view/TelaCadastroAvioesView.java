package br.com.voearlines.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.voearlines.DAO.AeronaveDAO;
import br.com.voearlines.DAO.TipoAeronaveDAO;
import br.com.voearlines.model.ModeloAeronave;
import br.com.voearlines.model.ModeloTipoAeronave;

public class TelaCadastroAvioesView extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNome, lblModelo, lblcodigo, lblDescricao;
	private JTextField txtNome, txtModelo, txtCodigo;
	private JComboBox jcbTipo;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	/**
	 * Autor Fillipe Albuquerque
	 */
	private static final long serialVersionUID = 1L;

	public TelaCadastroAvioesView() {

		setTitle("Cadastro de Aeronaves");
		// setResizable(false);
		setSize(550, 350);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		contentPane = new JPanel();

		JLabel imagem = new JLabel();
		Icon fundo = new ImageIcon("aviao.jpg");
		imagem.setIcon(fundo);
		add(imagem);

		lblNome = new JLabel("Fabricante");
		lblNome.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblNome.setForeground(SystemColor.white);
		lblNome.setBounds(155, 51, 150, 20);
		contentPane.add(lblNome);
		imagem.add(lblNome);

		txtNome = new JTextField(100);
		txtNome.setFont(new Font("Ubuntu", Font.BOLD, 15));
		txtNome.setForeground(SystemColor.desktop);
		txtNome.setBounds(312, 52, 170, 19);
		contentPane.add(txtNome);
		imagem.add(txtNome);
		txtNome.setColumns(10);

		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblModelo.setForeground(SystemColor.white);
		lblModelo.setBounds(155, 100, 150, 20);
		contentPane.add(lblModelo);
		imagem.add(lblModelo);

		txtModelo = new JTextField(100);
		txtModelo.setFont(new Font("Ubuntu", Font.BOLD, 15));
		txtModelo.setForeground(SystemColor.desktop);
		txtModelo.setBounds(312, 100, 170, 19);
		contentPane.add(txtModelo);
		imagem.add(txtModelo);
		txtModelo.setColumns(10);

		lblcodigo = new JLabel("Código");
		lblcodigo.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblcodigo.setForeground(SystemColor.white);
		lblcodigo.setBounds(155, 150, 170, 20);
		contentPane.add(lblcodigo);
		imagem.add(lblcodigo);

		txtCodigo = new JTextField(100);
		txtCodigo.setFont(new Font("Ubuntu", Font.BOLD, 15));
		txtCodigo.setForeground(SystemColor.desktop);
		txtCodigo.setBounds(312, 150, 170, 19);
		contentPane.add(txtCodigo);
		imagem.add(txtCodigo);
		txtCodigo.setColumns(10);

		lblDescricao = new JLabel("Descrição");
		lblDescricao.setFont(new Font("Ubuntu", Font.BOLD, 20));
		lblDescricao.setForeground(SystemColor.white);
		lblDescricao.setBounds(155, 200, 150, 20);
		contentPane.add(lblDescricao);
		imagem.add(lblDescricao);
		
		
		
		// Dados sobre o JComboBox
		String[] tipos = { "Avião de Guerra","Avião Do Neymar" };
		JComboBox comboBox = new JComboBox(tipos);
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(312, 200, 150, 20);
		contentPane.add(comboBox);
		imagem.add(comboBox);

		// Botões
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Limpar");
		contentPane.add(btnLimpar);
		add(btnLimpar);
		imagem.add(btnLimpar);

		// botão logar
		btnCadastrar.setFont(new Font("Ubuntu", Font.BOLD, 15));
		btnCadastrar.setForeground(SystemColor.desktop);
		btnCadastrar.setBounds(260, 250, 100, 20);
		contentPane.add(btnCadastrar);
		imagem.add(btnCadastrar);
		btnCadastrar.addActionListener(this);

		//  botão Limpar

		btnLimpar.setFont(new Font("Ubuntu", Font.BOLD, 15));
		btnLimpar.setForeground(SystemColor.desktop);
		btnLimpar.setBounds(390, 250, 100, 20);
		contentPane.add(btnLimpar);
		imagem.add(btnLimpar);
		btnLimpar.addActionListener(this);

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtModelo.setText("");
		txtCodigo.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AeronaveDAO dao = new AeronaveDAO();
		ModeloAeronave modelo = new ModeloAeronave();

		if (e.getSource() == btnCadastrar) {
			if (txtNome.getText().trim().isEmpty() || txtModelo.getText().trim().isEmpty() || txtCodigo.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "É obrigatório preencher os campos");
			} else {
				System.out.println("Botao clicado");
				modelo.setFabricante(txtNome.getText());
				modelo.setModelo(txtModelo.getText());
				modelo.setCodigo(txtCodigo.getText());
				dao.cadastraTipoAeronave(modelo);
				JOptionPane.showMessageDialog(null,"O avião foi cadastrado com sucesso no sistema VoeArlines");
				limparCampos();
			}
		} else {
			limparCampos();
		}

	}

}