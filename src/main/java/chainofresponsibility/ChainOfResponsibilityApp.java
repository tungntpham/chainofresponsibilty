package chainofresponsibility;

/**
 * A simple implementation of the "Chain of Responsibility" pattern
 */
public class ChainOfResponsibilityApp {
	public static void main(String[] args) {
		// Original data to be passed through the chain
		Data data = new Data("Original Data");
		// Chain of responsibility
		Chain chain = new Chain();
		// Create some simple processors
		Processor p1 = new Processor("process-1");
		Processor p2 = new Processor("process-2");
		Processor p3 = new Processor("process-3");
		
		// Add the processors to the chain
		chain.addProcessor(p1);
		chain.addProcessor(p2);
		chain.addProcessor(p3);
		
		// Pass the data through the chain
		chain.process(data);
		// Printout final result
		System.out.println(data.get());
	}
}
