package se01.day04;

class MyLinked<E>{
	private Node header;//链表头
	private int size;//集合大小
	
	//添加元素
	public boolean add(E e) {
		Node node = new Node();
		node.element = e;//设置节点内的元素
		//判断是否存在链表头
		if(header==null) {
			header = node;
			header.prev = header;
			header.next = header;
		}else{
			header.prev.next = node;
			node.next = header;
			node.prev = header.prev;
			header.prev = node;
		}
		size++;
		return true;
	}
	
	
	//删除元素
	public boolean remove(E e) {
		//判断集合是否为空
		if(size==0) {
			return false;
		}
		//判断是否有元素
//		if(!contains(e)) {
//			return false;
//		}
		
		Node node = header;
		do {
			if(node.element.equals(e)) {
				node.prev.next = node.next;
				node.next.prev = node.prev;
				//如果删除的是头节点
				if(node == header) {
					header = header.next;
				}
				size--;
				//如果集合里面只有一个元素且被删了
				if(size==0) {
					header = null;
				}
				return true;
			}
			
			node = node.next;
			
			//如果集合里面没有这个元素
			if(node.equals(header)) {
				System.out.println("the element is not in linked.");
				return false;
			}
		}while(node!=header);
		
		return false;
	}
	
	//判断集合中是否存在指定元素
	public boolean contains(E e) {
		Node node = header;
		do {
			if(node.element.equals(e)) {
				return true;
			}
			node = node.next;
		}while(node!=header);
		return false;
	}
	
	//获取元素个数
	public int size() {
		return size;
	}
	
	//["a","b","c"]
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if(size==0) {
			return sb.append("]").toString();
		}
		Node node = header;
		do {
			sb.append(node.element).append(",");
			node = node.next;
		}while(node!=header);
		sb.replace(sb.length()-1, sb.length(), "]");
		return sb.toString();
	}
	
	//判断是否为空
	public boolean isEmpty() {
		if (size==0) {
			return true;
		}
		return false;
	}
	
	private class Node<E>{
		public Node prev;//上一个节点
		public Node next;//下一个节点
		public E element;
	}
}
public class MyLinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinked<String> ml = new MyLinked<String>();
		ml.add("a");
		ml.add("b");
		ml.add("c");
		System.out.println(ml.remove("e"));
		
	}

}
