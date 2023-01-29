package ru.nemesh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.* ;

import com.sun.net.httpserver.HttpServer;

class Senda {

    public static int checkOrg (String reg,String key) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("reg");
        list.add("key");
        Stream stream = list.stream();

        URL url = new URL("https://api-fns.ru/api/egr");    //Создаем объект URL с путем к странице
        URLConnection connection = url.openConnection();   //  Создаем двустороннее соединение

// получили поток для отправки данных
//        OutputStream output = connection.getOutputStream();   //Получаем поток вывода
//        output.write(Integer.parseInt(reg)); // отправляем данные               //Выводим в него данные
//        output.write(Integer.parseInt(key)); // отправляем данные               //Выводим в него данные

// получили поток для чтения данных
        InputStream input = connection.getInputStream();       //Получаем поток ввода
        int data = input.read(); // читаем данные               // Читаем из него данные

//        int serverPort = 8000;
//        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort), 0);
//        server.createContext("/api/hello", (exchange -> {
//            String respText = "Hello!";
//            exchange.sendResponseHeaders(200, respText.getBytes().length);
//            OutputStream output = exchange.getResponseBody();
//            output.write(respText.getBytes());
//            output.flush();
//            exchange.close();
//        }));
//        server.setExecutor(null); // creates a default executor
//        server.start();

        ///https://api-fns.ru/api/egr
        /// API: Метод egr
        /// поле 1  req *
        /// поле 2  key *
        //return serverPort;
        return data;
    }
}


//    URL url = new URL("http://httpbin.org/post");
//    URLConnection conn = url.openConnection();
//        conn.setDoOutput(true);
//                conn.setDoInput(true);
//                try (OutputStream outputStream = conn.getOutputStream();
//                PrintStream sender = new PrintStream(outputStream) )
//                {
//
//                sender.println();
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
//
//                byte[] buffer = new byte[0];
//                try (InputStream inputStream = conn.getInputStream();
//                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)))
//                {
//                while (reader.ready())
//                System.out.println(reader.readLine());
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
//                String string = new String(buffer);
//                System.out.println(string);