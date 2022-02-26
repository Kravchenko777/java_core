package lesson8.presentation;

import java.sql.*;

public class Demo {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    // Показать singleton DriveManager-a
    public static void main(String[] args)  {
        try {
            // load JDBC driver
            Class.forName("org.sqlite.JDBC");

            //protocol - db type - db location
            connection = DriverManager.getConnection("jdbc:sqlite:lesson8db.db");
            statement = connection.createStatement();

            // Пример очистки при запуске
            performDropTable();

            // Пример создания БД
            performCreateDB();

            // Примеры вставки записей, autoCommit
            populateDB();

            // Пример обновления записей
            performUpdateDb();

            // Удаление записей
            performDeleteRows();

            // Демонстрация prepared statement
            performPreparedStatement();

            // Пример вычитки данных
            readStudentsFromDB();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    private static void performPreparedStatement() throws SQLException {
        // Демонстрация prepared statement
        preparedStatement = connection.prepareStatement("INSERT INTO students (name, score) VALUES (?,?)");
        for (int i = 1; i < 10; i++) {
            preparedStatement.setString(1,"ВАСЯ" + i);
            preparedStatement.setInt(2,i);
//                preparedStatement.execute();
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
    }

    private static void performDeleteRows() throws SQLException {
        statement.executeUpdate("DELETE FROM students WHERE id > 9000");
    }

    private static void performUpdateDb() throws SQLException {
        performUpdateStudents("UPDATE students SET score = 0 WHERE id > 1");
    }

    private static void performUpdateStudents(String s) throws SQLException {
        statement.executeUpdate(s);
    }

    private static void populateDB() throws SQLException {
        /*-------------- Демонстрация простой вставки ----------- */
        //            for (int i = 1; i < 11; i++) {
        //                statement.executeUpdate(
        //                    "INSERT INTO students (name, score) VALUES ('student" + i + "'," + i +");"
        //                );
        //            }

        /*-------------- AUTO COMMIT (привести аналогию с bufferedOutputStream) ----------- */

                     /* Засечь время выполнения вставки 10к записей */
        //            long start = System.currentTimeMillis();
        //            for (int i = 1; i < 10_000; i++) {
        //                statement.executeUpdate(
        //                    "INSERT INTO students (name, score) VALUES ('student" + i + "'," + i +");"
        //                );
        //            }
        //            System.out.println(System.currentTimeMillis() - start);

        /* Засечь время выполнения с выкл autoCommit */
        long start = System.currentTimeMillis();
        connection.setAutoCommit(false);
        for (int i = 1; i < 10_000; i++) {
            statement.executeUpdate(
                "INSERT INTO students (name, score) VALUES ('student" + i + "'," + i +");"
            );
        }
        connection.commit();
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void performDropTable() throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS students");
    }

    private static void performCreateDB() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name STRING, score INTEGER NOT NULL);");
    }

    private static void readStudentsFromDB() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
        // В данном случае result set выгружает всю результирующую выборку
        while (resultSet.next()) {
            System.out.println(
                resultSet.getInt(1) + " | " +
                    resultSet.getString(2) + " | " +
                    resultSet.getDouble("score") + " | "
            );
        }
    }

}
