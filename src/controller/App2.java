package controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.Pecas;

public class App2 {
//Versão com GUI FUNCIONANDO!!!
//Não dá para escolher se será o X ou O
	static public int a;
//***Melhor versão 
	public static void main(String[] args) {
		Pecas m1 = new Pecas();
		Color lightOrange = new Color(255, 153, 0);
		Color lightBlue = new Color(51, 204, 255);

		Container caixa = new Container();
		JFrame janela = new JFrame("JOGO DA VELHA 1.1");
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);//Importante para não rodar a jvm em segundo plano
		JFrame victory = new JFrame();
		victory.setBounds(100, 100, 200, 100);
		JLabel vicl = new JLabel();
		victory.add(vicl);

		JFrame janelaEscolha = new JFrame("Escolha");
		janelaEscolha.setBounds(100, 100, 200, 100);
		janelaEscolha.setDefaultCloseOperation(janelaEscolha.EXIT_ON_CLOSE);
		janela.setBounds(100, 100, 250, 150);
		JLabel escolhatxt = new JLabel("Escolha um:");
		janelaEscolha.add(escolhatxt);
		JButton escX = new JButton("X");
		ActionListener escx = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 1;
				janelaEscolha.dispose();
			}
		};
		escX.addActionListener(escx);

		JButton escO = new JButton("O");
		ActionListener esco = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 2;
				janelaEscolha.dispose();
			}
		};
		escO.addActionListener(esco);

		JPanel painel = new JPanel();
		JPanel painelesc = new JPanel();
		painelesc.add(escX);
		painelesc.add(escO);
		janelaEscolha.getContentPane().add(painelesc);
		GridLayout tabela = new GridLayout();
		tabela.setRows(3);
		tabela.setColumns(3);

		JButton x0y0 = new JButton();
		ActionListener set00 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x0y0.setText("O");
					m1.setMatriz(0, 0, 2);
					m1.checagem();
					x0y0.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x0y0.setText("X");
					m1.setMatriz(0, 0, 1);
					m1.checagem();
					x0y0.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x0y0.addActionListener(set00);

		JButton x0y1 = new JButton();
		ActionListener set01 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x0y1.setText("O");
					m1.setMatriz(0, 1, 2);
					m1.checagem();
					x0y1.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x0y1.setText("X");
					m1.setMatriz(0, 1, 1);
					m1.checagem();
					x0y1.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x0y1.addActionListener(set01);

		JButton x0y2 = new JButton();
		ActionListener set02 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x0y2.setText("O");
					m1.setMatriz(0, 2, 2);
					m1.checagem();
					x0y2.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x0y2.setText("X");
					m1.setMatriz(0, 2, 1);
					m1.checagem();
					x0y2.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x0y2.addActionListener(set02);

		painel.add(x0y0);
		painel.add(x0y1);
		painel.add(x0y2);

		JButton x1y0 = new JButton();
		ActionListener set10 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x1y0.setText("O");
					m1.setMatriz(1, 0, 2);
					m1.checagem();
					x1y0.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x1y0.setText("X");
					m1.setMatriz(1, 0, 1);
					m1.checagem();
					x1y0.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x1y0.addActionListener(set10);

		JButton x1y1 = new JButton();
		ActionListener set11 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x1y1.setText("O");
					m1.setMatriz(1, 1, 2);
					m1.checagem();
					x1y1.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x1y1.setText("X");
					m1.setMatriz(1, 1, 1);
					m1.checagem();
					x1y1.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x1y1.addActionListener(set11);

		JButton x1y2 = new JButton();
		ActionListener set12 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x1y2.setText("O");
					m1.setMatriz(1, 2, 2);
					m1.checagem();
					x1y2.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x1y2.setText("X");
					m1.setMatriz(1, 2, 1);
					m1.checagem();
					x1y2.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x1y2.addActionListener(set12);

		painel.add(x1y0);
		painel.add(x1y1);
		painel.add(x1y2);

		JButton x2y0 = new JButton();
		ActionListener set20 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x2y0.setText("O");
					m1.setMatriz(2, 0, 2);
					m1.checagem();
					x2y0.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x2y0.setText("X");
					m1.setMatriz(2, 0, 1);
					m1.checagem();
					x2y0.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x2y0.addActionListener(set20);

		JButton x2y1 = new JButton();
		ActionListener set21 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x2y1.setText("O");
					m1.setMatriz(2, 1, 2);
					m1.checagem();
					x2y1.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x2y1.setText("X");
					m1.setMatriz(2, 1, 1);
					m1.checagem();
					x2y1.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x2y1.addActionListener(set21);

		JButton x2y2 = new JButton();
		ActionListener set22 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a % 2 == 0) {
					x2y2.setText("O");
					m1.setMatriz(2, 2, 2);
					m1.checagem();
					x2y2.setBackground(lightBlue);
					if (m1.isFim()) {
						vicl.setText("Vencedor: O");
						victory.setVisible(true);
					}
					a++;
				} else {
					x2y2.setText("X");
					m1.setMatriz(2, 2, 1);
					m1.checagem();
					x2y2.setBackground(lightOrange);
					if (m1.isFim()) {
						vicl.setText("Vencedor: X");
						victory.setVisible(true);
					}
					a++;
				}
			}
		};
		x2y2.addActionListener(set22);

		painel.add(x2y0);
		painel.add(x2y1);
		painel.add(x2y2);
		janela.getContentPane().add(painel);

		painel.setLayout(tabela);
		caixa = janela.getContentPane();
		janela.setVisible(true);
		janelaEscolha.setVisible(true);

	}

}
