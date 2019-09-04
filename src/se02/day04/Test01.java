package se02.day04;

/*
 * 模拟车过山洞(Cave)
 * 5辆车过山洞，每次只允许1辆车通过，每辆车通过的时间不同
 */

class Cave extends Thread{
	//汽车通过
	public synchronized void crossCar(Car c) {
		System.out.println(c.name+":开始过山洞了。");
		try {
			Thread.sleep(c.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.name+"出山洞了。");
	}
}

class Car extends Thread{
	String name;
	int time;
	Cave cave;
	
	public Car(String name,int time,Cave cave) {
		this.name = name;
		this.time = time;
		this.cave = cave;
	}
	@Override
	public void run() {
		cave.crossCar(this);
	}
}

public class Test01 {

	public static void main(String[] args) {
		Cave cave = new Cave();
		Car c1 = new Car("卡丁车", 6000, cave);
		Car c2 = new Car("过上车", 1000, cave);
		Car c3 = new Car("马车", 8000, cave);
		Car c4 = new Car("小汽车", 3000, cave);
		Car c5 = new Car("摩托车", 5000, cave);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
	}

}
