package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoR {
	private static Logger log =LogManager.getLogger(DemoR.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("DemoR this a an debug msg");
		log.info("DemoR object is present");
		log.error("DEmoR this a error msg");
		log.fatal("DemoR this an fatal msg");

	}

}
