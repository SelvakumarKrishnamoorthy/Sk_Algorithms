package org.selva.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TowerOfHanoi problem = new TowerOfHanoi();
		problem.toh(3, 'A', 'B', 'C');

	}

	public void toh(int discs , char src , char dest , char aux) {
		if (discs == 1) {
			System.out.println("moved disc "+ discs+ " from src rod "+ src + " to dest rod "+dest);
		}else {
			toh(discs-1, src , aux , dest);
			System.out.println("moved disc "+ discs+ " from src rod "+ src + " to dest rod "+dest);
			toh(discs-1, aux , dest , src);
		}
	}
}
