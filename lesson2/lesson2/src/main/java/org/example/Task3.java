// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
// строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {

    // подключаем логгирование
    private static Logger logger = Log.log(Task3.class.getName());

    public void parseJson(String json) {

        JSONParser parser = new JSONParser();
        StringBuilder builder = new StringBuilder();
        try {

            Object obj = parser.parse(json);

            // получение массива
            JSONArray students = (JSONArray) obj;

            Iterator i = students.iterator();

            // берем каждое значение из массива json отдельно
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                builder.append("Студент " + innerObj.get("фамилия") +
                        " получил " + innerObj.get("оценка") + " по предмету " +
                        innerObj.get("предмет"));
                logger.log(Level.INFO, String.valueOf(builder));
                builder.setLength(0);
            }


        } catch (ParseException e) {
            logger.log(Level.INFO, "Нет данных.");

        }

    }

    public void parsJsonFile(String path) {

        JSONParser jsonParser = new JSONParser();
        StringBuilder builder = new StringBuilder();

        try {
            // считывание файла JSON
            FileReader reader = new FileReader(path);
            JSONArray students = (JSONArray) jsonParser.parse(reader);

            Iterator i = students.iterator();

            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                builder.append("Студент " + innerObj.get("фамилия") +
                        " получил " + innerObj.get("оценка") + " по предмету " +
                        innerObj.get("предмет"));
                logger.log(Level.INFO, String.valueOf(builder));
                builder.setLength(0);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}


