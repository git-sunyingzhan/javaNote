package se02.day04;

class Player extends Thread{
	private String name;
	private int time;
	public Player(String name,int time) {
		this.name = name;
		this.time = time;
	}
	
	@Override
	public void run() {
		System.out.println("玩家："+name+"出发了");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("玩家："+name+"经过"+time+"到了。");
	}
	
}
public class JionThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Player p1 = new Player("成龙",8000);
		Player p2 = new Player("李小龙",3000);
		Player p3 = new Player("释小龙",5000);
		Player p4 = new Player("史泰龙",6000);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p1.join();
		p2.join();
		p3.join();
		p4.join();
		
		System.out.println("人齐了。");
	}

}
