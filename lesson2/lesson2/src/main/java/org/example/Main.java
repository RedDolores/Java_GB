package org.example;



public class Main {
    public static void main(String[] args) {


        String sql = "SELECT * FROM students WHERE ";
        String jsonTask1 = "{\"name\":\"Ivanov\", \"country\":\"Russia\"," +
                " \"city\":\"Moscow\", \"age\":\"null\"}";

        Task1 task1 = new Task1();
        task1.getSqlRequest(sql, jsonTask1);

        String jsonTask3 = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\"," +
                "\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\"," +
                "\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                " {\"фамилия\":\"Краснов\",\"оценка\":\"5\"," +
                "\"предмет\":\"Физика\"}]";
        String path = "students.json";

        Task3 task3 = new Task3();
        task3.parseJson(jsonTask3);
        task3.parsJsonFile(path);

        Task4 task4 = new Task4();
        task4.calculator();
    }
}