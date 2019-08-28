package se01.day04.mylinked;

class MyLinked<E>{
	public int size;
	//链表的头
	class Node<E>{
		Node<E> next;//下一个节点
		E e;//当前元素
		Node<E> prev;//上一个节点
		public Node() {}
		public Node(Node next, Object obj, Node footer) {
			super();
			this.next = next;
			this.obj = obj;
			this.prev = footer;
		}
		public Node getHead() {
			return next;
		}
		public void setHead(Node head) {
			this.next = head;
		}
		public Object getObj() {
			return obj;
		}
		public void setObj(Object obj) {
			this.obj = obj;
		}
		public Node getFooter() {
			return prev;
		}
		public void setFooter(Node footer) {
			this.prev = footer;
		}
	}
	
	//add
	public boolean add(Object e) {
		
		return false;
	}
	//remove
	public boolean remove(Object e) {
		
		return false;
	}
	//contains
	public boolean contains(Object e) {
		
		return false;
	}
	//size
	public int size() {
		
		return 0;
	}
	@Override
	public String toString() {
		return "MyLinked [size=" + size + "]";
	}
	
}
