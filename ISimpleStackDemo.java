package atividade1;

public class ISimpleStackDemo {
	public static void main(String[] args) {
		ISimpleStack fixed = new FixedLengthStack(5);
		ISimpleStack dynamic = new DynamicStack(5);
		char aux = 'b';
		char aux2 = 'c';
		
		
		dynamic.pop();
		fixed.pop();
		fixed.isEmpty();
		fixed.isFull();
		dynamic.push(aux);
		dynamic.push(aux2);
		
		int tam = dynamic.size();
		System.out.println(tam);
	}
	

}
