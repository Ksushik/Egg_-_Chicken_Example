package com.skilsup.syniaeva;

// первый вариант создания потока - наследоваться от класса Thread

class Egg extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);        //Приостанавливает поток на 1 секунду
			}
			catch (InterruptedException e) {
			}
			System.out.println("Яйцо");
			DisputeResolver.result = "яйцо";
		}
	}

}