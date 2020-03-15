package com.singleton;

public class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() { // we can also achieve this by keeping the synchronized keyword
											// after static
		if (INSTANCE == null)
			synchronized (Singleton.class) {// By keeping Singleton.class only one thread can access the class

				if (INSTANCE == null)// double check
					try {
						Thread.sleep(2000);
						INSTANCE = new Singleton();

					} catch (Exception e) {
						e.printStackTrace();
					}

			}

		return INSTANCE;

		// let us understand this while our first thread in the 2nd if() and 2nd thread
		// in the first if() there may be a chance of creating two instances so by
		// keeping the synchronized() only one thread will enter and we need to double
		// check it whether it has instance or not

	}
}
