package com.example.jogovelhaandroid;
public class Pecas {
	public int matriz[][] = new int[3][3];
	public boolean fim;

	public Pecas() {
		super();
		this.matriz = new int[3][3];
		this.fim = false;
	}

	// GETTERS AND SETTERS
	public int[][] getMatriz() {
		return matriz;
	}

	public void imprime() {
		int i2 = 0;
		for (int i = 0; i < 3; i++) {
			while (i2 < 3) {
				System.out.print(this.matriz[i][i2] + "|");
				i2++;
			}
			System.out.println();
			i2 = 0;
		}
	}

	public void checagem() {
		// X=1 && O=2
		int i2 = 0;
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				if (matriz[i][0] == 1 && matriz[i][0] == matriz[1][1] && matriz[i][0] == matriz[2][2]) {
					System.out.println("Voc� Venceu X!");
					setFim(true);
					System.out.println(isFim());
					break;
				}
				if (matriz[i][0] == 2 && matriz[i][0] == matriz[1][1] && matriz[i][0] == matriz[2][2]) {
					System.out.println("Voc� Venceu O!");
					setFim(true);
					System.out.println(isFim());
					break;
				}
				if (matriz[i][0] == 1 && matriz[i][0] == matriz[i + 1][0] && matriz[i][0] == matriz[2][0]) {
					System.out.println("Voc� Venceu X!");
					setFim(true);
					System.out.println(isFim());
					break;
				}
				if (matriz[i][0] == 2 && matriz[i][0] == matriz[i + 1][0] && matriz[i][0] == matriz[2][0]) {
					System.out.println("Voc� Venceu O!");
					setFim(true);
					System.out.println(isFim());
					break;
				}
			}
			while (i2 < 3) {
				if (i == 0 && i2 == 1) {
					if (matriz[i][i2] == 1 && matriz[i][i2] == matriz[i + 1][i2]
							&& matriz[i][i2] == matriz[i + 2][i2]) {
						System.out.println("Voc� Venceu X!");
						setFim(true);
						System.out.println(isFim());
						break;
					}
					if (matriz[i][i2] == 2 && matriz[i][i2] == matriz[i + 1][i2]
							&& matriz[i][i2] == matriz[i + 2][i2]) {
						System.out.println("Voc� Venceu O!");
						setFim(true);
						System.out.println(isFim());
						break;
					}
				}

				if (i == 0 && i2 == 2) {
					if (matriz[i][i2] == 1 && matriz[i][i2] == matriz[i + 1][i2]
							&& matriz[i][i2] == matriz[i + 2][i2]) {
						System.out.println("Voc� Venceu X!");
						setFim(true);
						System.out.println(isFim());
						break;
					}
					if (matriz[i][i2] == 2 && matriz[i][i2] == matriz[i + 1][i2]
							&& matriz[i][i2] == matriz[i + 2][i2]) {
						System.out.println("Voc� Venceu O!");
						setFim(true);
						System.out.println(isFim());
						break;
					}
				}

				if (i2 == 0) {
					if (matriz[i][i2] == 1 && matriz[i][i2] == matriz[i][i2 + 1]
							&& matriz[i][i2] == matriz[i][i2 + 2]) {
						System.out.println("Voc� Venceu X!");
						setFim(true);
						System.out.println(isFim());
						break;
					}
					if (matriz[i][i2] == 2 && matriz[i][i2] == matriz[i][i2 + 1]
							&& matriz[i][i2] == matriz[i][i2 + 2]) {
						System.out.println("Voc� Venceu O!");
						setFim(true);
						System.out.println(isFim());
						break;
					}
				}
				i2++;
			}
			i2 = 0;
			if (i == 2) {
				if (matriz[i][0] == 1 && matriz[i][0] == matriz[i - 1][1] && matriz[i][0] == matriz[i - 2][2]) {
					System.out.println("Voc� Venceu X!");
					setFim(true);
					System.out.println(isFim());
					break;
				}
				if (matriz[i][0] == 2 && matriz[i][0] == matriz[i - 1][1] && matriz[i][0] == matriz[i - 2][2]) {
					System.out.println("Voc� Venceu O!");
					setFim(true);
					System.out.println(isFim());
					break;
				}
			}
		}
	}

	public void setMatriz(int x, int y, int valor) {
		this.matriz[x][y] = valor;
	}

	public boolean isFim() {
		return fim;
	}

	public void setFim(boolean fim) {
		this.fim = fim;
	}
	
	
}
