package net.jarit.test;

/**
 * ÄÚ´æ¶ÔÏó
 * 
 * @author dafu
 * @since 2010-11-8
 */
public class MemoryObject {

	private byte[] bytes;

	public MemoryObject(int size) {
		setBytes(new byte[size * 1024 * 1024]);
	}

	public MemoryObject(float size) {
		setBytes(new byte[(int) (size * 1024F * 1024F)]);
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public byte[] getBytes() {
		return bytes;
	}

}
