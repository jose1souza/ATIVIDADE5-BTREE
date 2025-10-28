package model;

public class Node {
	int T; // ordem
	int n; // número de chaves por nó
	int key[]; // array de chaves
	Node child[]; // array de filhos
	boolean leaf; // é filho?
	
	public Node(int T) {
		this.T = T;
		this.key = new int[2 * T - 1];
		this.child = new Node[2 * T];
		leaf = true;
	}
	
	public int Find(int k) { // procura por uma chave
		for (int i = 0; i < this.n; i++) {
			if (this.key[i] == k) {
				return i;
			}
		}
		return -1;
	};
}
