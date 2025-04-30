import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
public class Interface extends JFrame{
	
	ImageIcon Logo = new ImageIcon(getClass().getResource("logoWeg150px.png"));
	JLabel Imagem = new JLabel(Logo);
	public Interface() {
		
		
		JFrame telaFundo = new JFrame();
		telaFundo.setLayout(null);
		telaFundo.setTitle("WegOne");
		telaFundo.setSize(600,600);
		telaFundo.setDefaultCloseOperation(telaFundo.EXIT_ON_CLOSE);
		telaFundo.setResizable(false);
		telaFundo.setLocationRelativeTo(null);
		Color padrao = Color.decode("#1c355e");
		telaFundo.getContentPane().setBackground(padrao);

		
		JLabel bemVindo = new JLabel("Welcome to      One");
		bemVindo.setForeground(Color.WHITE);
		bemVindo.setBounds(130,-50,400,200);
		bemVindo.setFont(new Font("Arial",Font.BOLD,35));
		telaFundo.add(bemVindo);
		
		JLabel escolhaIdioma = new JLabel ("Selecione um idioma:");
		escolhaIdioma.setBounds(243,60,150,100);
		escolhaIdioma.setForeground(Color.WHITE);
		telaFundo.add(escolhaIdioma);
		
		ImageIcon Logo = new ImageIcon(getClass().getResource("C:/Users/lorhan_p_melo/Documents/GitHub/ProjetoDeCursoWEg/Projeto/src/imagens/logo150px.png/"));
		JLabel imagem = new JLabel(Logo);
		telaFundo.add(imagem);
		imagem.setBounds(329,20,Logo.getIconWidth(), Logo.getIconHeight());
		
		
		
		
		JButton bPortugues = new JButton("Português");
		bPortugues.setBounds(150,120,300,65);
		bPortugues.setBorder(new LineBorder(Color.WHITE, 2 ,true));
		bPortugues.setFocusPainted(false);
		bPortugues.setForeground(padrao);
		telaFundo.add(bPortugues);
		bPortugues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JFrame telaInicial = new JFrame();
				telaInicial.setLayout(null);
				telaInicial.setTitle("WegOne");
				telaInicial.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaInicial.setLayout(new BorderLayout());
				telaInicial.setDefaultCloseOperation(telaFundo.EXIT_ON_CLOSE);
				telaInicial.setResizable(false);
				telaInicial.setLocationRelativeTo(null);
				Color padrao = Color.decode("#1c355e");
				telaInicial.getContentPane().setBackground(padrao);
				telaInicial.setVisible(true);
				
				telaInicial.add(Imagem);
				Imagem.setHorizontalAlignment(SwingConstants.LEFT);
				Imagem.setVerticalAlignment(SwingConstants.TOP);
				
				
			}
		});
		
		
		JButton bIngles = new JButton("Inglês");
		bIngles.setBounds(150,190,300,65);
		bIngles.setBorder(new LineBorder(Color.WHITE, 2 ,true));
		bIngles.setFocusPainted(false);
		bIngles.setForeground(padrao);
		telaFundo.add(bIngles);
		
		JButton bAlemao = new JButton("Alemão");
		bAlemao.setBounds(150,260,300,65);
		bAlemao.setBorder(new LineBorder(Color.WHITE, 2 ,true));
		bAlemao.setFocusPainted(false);
		bAlemao.setForeground(padrao);
		telaFundo.add(bAlemao);
		
		JButton bFrances = new JButton("Francês");
		bFrances.setBounds(150,330,300,65);
		bFrances.setBorder(new LineBorder(Color.WHITE, 2 ,true));
		bFrances.setFocusPainted(false);
		bFrances.setForeground(padrao);
		telaFundo.add(bFrances);
		
		JButton bEspanhol = new JButton("Espanhol");
		bEspanhol.setBounds(150,400,300,65);
		bEspanhol.setBorder(new LineBorder(Color.WHITE, 2 ,true));
		bEspanhol.setFocusPainted(false);
		bEspanhol.setForeground(padrao);
		telaFundo.add(bEspanhol);
		
		telaFundo.setVisible(true);
	}

}
