package org.example;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    static {
        //полный путь до файла с конфигами
        try (FileInputStream in = new FileInputStream("log.config")) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
