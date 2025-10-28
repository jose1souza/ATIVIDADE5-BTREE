package view;

import model.BTree;

public class Main {
	public static void main(String[] args) {
		BTree b = new BTree(3); // Criando a árvore
		b.Insert(10); // inserção de números
		b.Insert(20);
		b.Insert(30);
		b.Insert(50);
		b.Insert(60);
		b.Insert(70);
		b.Insert(90);

		b.Show(); // mostrando a árvore

		if (b.Contain(60)) { // número existe na árvore?
			System.out.println("\nfound");
		} else {
			System.out.println("not found");
		}
		
		if (b.Contain(20)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}
}
