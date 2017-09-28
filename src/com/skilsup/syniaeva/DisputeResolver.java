package com.skilsup.syniaeva;

public class DisputeResolver {

	public static String result;

	public static void main(String[] args) {

		// создание потоков
		Chicken chicken = new Chicken();
		Egg egg = new Egg();
		System.out.println("Спор начат...");

		/* обратите внимание на разные способы запуска потоков, созданных разными способами:
		* если потом - потомок класса Thread, то на нашем объекте мы вызываем метом start()
		*  если же класс- поток был создан путем имплементации интерцейса Runnable, то для того, чтобы
		*  стартовать данный поток, нам необходимо будет создать экземпляр класса Thread и в конструктор
		*  ему передать екзмепляр нашего класса - потока, потомка Runnable
		* */

		Thread chickenThread = new Thread(chicken);
		chickenThread.start();
		egg.start();

		// join нужен для того, чтобы основной поток, который неявным образом запускается при
		// запуске метода main() дождался завершения потоков chickenThread и egg
		try {
			egg.join();
			chickenThread.join();
		}
		catch (InterruptedException e) {

		}
		System.out.println("Первым появилось(лась) " + result);
		System.out.println("Спор закончен!");
	}
}




