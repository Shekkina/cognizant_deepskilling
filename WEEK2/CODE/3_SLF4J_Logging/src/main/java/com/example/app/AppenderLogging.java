
package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLogging {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLogging.class);

    public static void main(String[] args) {
        logger.info("Logging to both console and file with logback appenders");
    }
}
