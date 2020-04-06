package beta;
import org.apache.logging.log4j.*;
public class Demo2 {
	private static Logger log =LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Demo2 this a an debug msg");
		log.info("Demo2 object is present");
		log.error("Demo2 this a error msg");
		log.fatal("Demo2 this an fatal msg");

	}

}
