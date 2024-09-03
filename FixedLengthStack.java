package atividade1;

public class FixedLengthStack implements ISimpleStack {
	private char[] dadosDaPilha;
	private int topo;

	public FixedLengthStack(int tamanho) {
 
		this.dadosDaPilha = new char[tamanho];
		this.topo = 0;
	}

	public void push(char dado) {
		if (isFull()) {
			System.out.println("Pilha Cheia");
			return;
		}
		this.dadosDaPilha[topo++] = dado;
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Pilha vazia");
			return (char) 0;
		}
		return this.dadosDaPilha[--topo];

	}

	public boolean isEmpty() {
		return this.topo == 0;
	}

	public boolean isFull() {
		return this.topo == this.dadosDaPilha.length;
	}
	 public void reset() {
		  for(int i = 0; i < this.dadosDaPilha.length; i++) {
			  this.dadosDaPilha[i] = 0;
		  }
	   }
	   
	   public char peek() {
		   char aux;
		   aux = this.dadosDaPilha[topo];
		   return aux;
	   }
	   
	   public int size() {
		   return this.topo;
	   }

}
