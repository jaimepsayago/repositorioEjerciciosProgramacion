package unidad4;

public class SimpleLinkedList <E> {
	//inicia clase interna node
	private static class Node<E>{ //clase interna dentro lista recursivo!!!
	//elemento que se guarda
	private E element;
	//referencia al siguiente nodo
	private Node<E> next;
	//constructor
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}

	//getters and setters
	public E getElement() {
		return element;
	}
	
	public void setNext(Node <E> n) {
		next = n;
	}
	public Node<E> getNext(){
		return next;
	}
	
	
	}
	///termina clase interna node
	private Node<E> head = null;
	private Node<E> tail = null;
	//numero de nodos 
	private int size = 0;
	//constructor 
	public SimpleLinkedList() {
		
	}
	
	//metodos
	//size
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	//retornar first element
	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}
	//retornar last element
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	//agregarun dato principio
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if(size==0)
			tail = head;
		size++;
		
	}
	//remover primero
	public E removeFirst() {
		if(isEmpty()) return null;
		E e1 = head.getElement();
		head = head.getNext();
		size --;
		if (size == 0)
			tail = null;
		return e1;
	}
	
	//obtener cualquier elemento
	public E getElementObject(int index) {
		int c = 0;
		Node <E> tmp = head;//nodo temporal
		while (c < index) {
			tmp = tmp.getNext(); // nodo en nodo recorriendo
			c++;
		}
		return tmp.getElement();
	}
	
	//ELEMINAR CUALQUIER ELEMENTO
	
	public E removeElement(int index) {
		int c = 0;
		Node <E> tmp = head;//nodo temporal
		while (c < index-1) {
			tmp = tmp.getNext(); 
			c++;
		}
		E e1 = tmp.getElement();
		head = head.getNext();
		size --;
		return e1;
	}

}
