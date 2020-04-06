package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class DemoRahul {
	private static Logger log =LogManager.getLogger(DemoRahul.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("DemoRahul this a an debug msg");
		log.info("DemoRahul object is present");
		log.error("DEmoRahul this a error msg");
		log.fatal("DemoRahul this an fatal msg");

	}

}
