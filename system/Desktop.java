package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("1024 * 768(4.73)");
	}
	
		public static void main(String args[]) {
			Desktop desk=new Desktop();
			desk.computerModel();
			desk.desktopSize();
			}	
	}


