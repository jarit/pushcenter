package net.jarit.test;

/**
 * 
 * @author dafu
 * @since 2010-11-8
 */
public class OOMTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Thread.sleep(30000);
		MemoryObject obj1 = new MemoryObject(2);
		MemoryObject obj2 = new MemoryObject(2);
		MemoryObject obj3 = new MemoryObject(4);
		System.out.println("minor gc must happen!");
		MemoryObject obj4 = new MemoryObject(0.5F);
		MemoryObject obj5 = new MemoryObject(1);
		System.out.println("full gc must happen!");
		MemoryObject obj6 = new MemoryObject(2);
		Thread.sleep(20000);
	}

}
