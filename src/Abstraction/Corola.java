package Abstraction;

public class Corola extends StopAndStart {


	@Override
	void start() {
		System.out.println("The car engine is starting on push button");
		
	}

	@Override
	void stop() {
		System.out.println("the car engin is stop by turn of the button");
		
	}
}
