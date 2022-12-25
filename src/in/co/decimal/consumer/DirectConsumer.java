package in.co.decimal.consumer;

import java.util.List;
import java.util.logging.Logger;



public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		List<String> sortedList = bubbleSort.sort(List.of("Vikas", "Basant", "Kumar", "Prince"));
		logger.info(sortedList.toString());
	}
}
