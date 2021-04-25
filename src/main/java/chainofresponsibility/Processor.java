package chainofresponsibility;

/**
 * A simple processor class which add its name to the passed data.
 */
public class Processor {
	private String name;
	
	public Processor(String name) {
		this.name = name;
	}
	
	/**
	 * Add name to the process data
	 * @param data
	 */
	public void process(Data data) {
		data.set(data.get() + ", " + name);
	}
}
