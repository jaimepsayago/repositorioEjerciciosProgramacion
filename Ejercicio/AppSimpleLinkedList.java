package unidad4;

public class AppSimpleLinkedList {

	public static void main(String[] args) {
	
	SimpleLinkedList<Integer> listaInteger = new SimpleLinkedList<>();
	
	listaInteger.addFirst(5);
	listaInteger.addFirst(34);
	listaInteger.addFirst(56);
	
	//listaInteger.removeFirst();
	System.out.println("f"+listaInteger.first());
	//System.out.println(listaInteger.last());
	//System.out.println(listaInteger.first());
	//System.out.println(listaInteger.removeElement(1));
	listaInteger.removeElement(0);
	//listaInteger.removeElement(1);
	System.out.println(listaInteger.first());
	//System.out.println(listaInteger.last());
	}

}
