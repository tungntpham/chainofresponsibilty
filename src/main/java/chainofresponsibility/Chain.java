package chainofresponsibility;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Chain class that maintain the array of processor and passing
 * of input data through each processor in the chain.
 */
public class Chain {
	Queue<Processor> chain;
	
	public Chain() {
		chain = new LinkedList<Processor>();
	}
	
	public void addProcessor(Processor processor) {
		chain.add(processor);
	}
	
	/**
	 * Pass data through each processor in the chain
	 * @param data
	 */
	public void process(Data data) {
		chain.forEach((p) -> {
			p.process(data);
		});
	}
}
