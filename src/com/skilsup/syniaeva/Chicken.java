package com.skilsup.syniaeva;

// второй способ создания потока - имплементировать интерфейс Runnable

public class Chicken implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);        //Приостанавливает поток на 1 секунду, следует обратить внимание на тот факт, что в случае, когда мы имплементируем интерфейс Runnable,
				// то используем статический метод sleep() класса Thread
			}
			catch (InterruptedException e) {
			}
			System.out.println("Курица");
			DisputeResolver.result="Курица";
		}
	}

}
