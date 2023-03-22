package alten;

public class LinkedList {

	private Node head;

	static class Node {

		private int data;
		private Node next;


		public Node(int data) {
			this.data = data;
		}
	}


	public static void insert(LinkedList list, int data) {

		Node newNode = new Node(data);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public static void display(LinkedList list) {

		Node last = list.head;
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.next;
		}
	}


	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		LinkedList.insert(list, 1);
		LinkedList.insert(list, 2);
		LinkedList.insert(list, 3);
		LinkedList.insert(list, 4);

		LinkedList.display(list);
		System.out.println();
		LinkedList.display(list);

	}

}
