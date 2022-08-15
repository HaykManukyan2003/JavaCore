package Chapter10.exceptionHandling.log4j;

import java.util.logging.Logger;

public class Log4JExample {

    static final Logger logger = Logger.getLogger(String.valueOf(Log4JExample.class));

    public static void main(String[] args) {

        logger.info("log some information");

    }
}
