package alpha;
import org.apache.logging.log4j.*;
public class Demo {
	private static Logger log =LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("this a an debug msg");
		log.info("object is present");
		log.error("this a error msg");
		log.fatal("this an fatal msg");

	}

}
