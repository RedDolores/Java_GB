//Дана строка sql-запроса "select * from students where ". Сформируйте часть
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
// ниже в виде json-строки. Если значение null, то параметр не должен попадать в
// запрос. Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
// "city":"Moscow", "age":"null"}


package org.example;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task1 {
    private static Logger logger = Log.log(Task1.class.getName());

    private String convertToString(CharSequence s) {

        return s.subSequence(0, s.length()).toString();

    }

    private String[] getItemsJson(StringBuilder builder) {


        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length() - 1);
        String items = convertToString(builder);
        return items.split(", ");

    }

    public void getSqlRequest(String sql, String json) {

        JSONParser parser = new JSONParser();
        StringBuilder builder = new StringBuilder();
        try {
            if (sql.isEmpty()) {
                throw new Exception();
            }
            Object obj = parser.parse(json);
            JSONObject jsonObj = (JSONObject) obj;

            builder.append(jsonObj.keySet());
            String[] keysJson = getItemsJson(builder);
            builder.setLength(0);

            builder.append(jsonObj.values());
            String[] valuesJson = getItemsJson(builder);
            builder.setLength(0);

//            for (int i = 0; i < valuesJson.length; i++) {
//                System.out.println(i + "-el: " + keysJson[i]);
//            }
//            for (int i = 0; i < valuesJson.length; i++) {
//                System.out.println(i + "-el: " + valuesJson[i]);
//            }

            builder.append(sql);

            for (int i = 0; i < keysJson.length; i++) {
                if (valuesJson[i].equals("null")) {
                    continue;
                }
                builder.append(keysJson[i] + " = \"" + valuesJson[i] + "\""
                        + " AND ");
            }
            builder.delete(builder.length() - 5, builder.length());
            logger.log(Level.INFO, String.valueOf(builder));


        } catch (ParseException e) {
            logger.log(Level.INFO, "Нет данных json.");

        } catch (Exception e) {
            logger.log(Level.INFO, "Нет данных sql.");

        }

    }

}



