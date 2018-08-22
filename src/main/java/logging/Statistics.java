package logging;

import org.apache.log4j.Logger;

import java.io.File;
import java.net.MalformedURLException;

public class Statistics {
    private static int catsCount = 0;
    private static int twoChildrenCount = 0;
    private static int personCount = 0;
    private static Logger logger;

    static {
        setupLog4J();
    }


    public static void incrementCatsCount() {
        catsCount++;
    }

    public static void incrementTwoChildrenCount() {
        twoChildrenCount++;
    }

    public static void incrementPersonCount() {
        personCount++;
    }

    public static void print() {
        logger.info("People with cats: " + catsCount);
        logger.info("People with two children: " + twoChildrenCount);
        if (personCount >= 11) {
            logger.info("That's enough people for football team");
        } else {
            logger.info("That's not enough people for football team");
        }
    }

    private static void setupLog4J(){
        try {
            System.setProperty("log4j.configuration", new File("src/main/resources", "log4j.properties").toURL().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        logger = Logger.getLogger(Statistics.class.getName());
    }

}
