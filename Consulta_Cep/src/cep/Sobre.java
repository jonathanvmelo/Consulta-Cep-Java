package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		getContentPane().setBackground(SystemColor.control);
		getContentPane().setForeground(SystemColor.textHighlight);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(650, 380, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP");
		lblNewLabel.setBounds(41, 45, 306, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Autor: Jonathan Volpato de Melo");
		lblNewLabel_1.setBounds(41, 83, 250, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setBounds(41, 126, 72, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("https://www.republicavirtual.com.br/");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(110, 126, 219, 14);
		getContentPane().add(lblWebService);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/jonathanvmelo/");
			}
		});
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setToolTipText("Linkedin");
		btnLinkedin.setBackground(SystemColor.control);
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLinkedin.setBorder(null);
		btnLinkedin.setBounds(65, 196, 48, 48);
		getContentPane().add(btnLinkedin);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/jonathanvmelo/Consulta-Cep-Java");
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setBorder(null);
		btnGitHub.setToolTipText("Projeto");
		btnGitHub.setBackground(SystemColor.control);
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/icons8-github-48.png")));
		btnGitHub.setBounds(134, 196, 48, 48);
		getContentPane().add(btnGitHub);
	}
	
	// METODO PARA ABRIR UM SITE DENTRO DO SISTEMA DO USU??RIO.
	// PARA LINK EXTERNO USAR URL;
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch(Exception e ) {
			System.out.println(e);
			e.printStackTrace();
			}
	}
}
