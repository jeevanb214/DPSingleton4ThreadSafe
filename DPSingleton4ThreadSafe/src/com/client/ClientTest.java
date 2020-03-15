package com.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {

		ExecutorService executorService = null;
		MyThread myThread=new MyThread();
		try {
			executorService = Executors.newFixedThreadPool(4);//if we put 1 then one by one thread is going to be executed
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}

	}
}
