package ru.nemesh;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Senda {

    public static String checkOrg(String reg, String key) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("reg");
    //    list.add("key");
        Stream stream = list.stream();
//        String a = JsonConvert.convertJson(stream);
        URL url = new URL("https://api-fns.ru/api/egr?req=8601033541&key=5ba4a553d3605f0f89a02b2e0cc0182300c8bab8");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod(String.valueOf("GET"));
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("reg");
        }

        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
        return reg;
    }
}



//        URL url = new URL("https://api-fns.ru/api/egr");    //Создаем объект URL с путем к странице
//        URLConnection connection = url.openConnection();   //  Создаем двустороннее соединение

// получили поток для отправки данных
   //     OutputStream output = connection.getOutputStream();   //Получаем поток вывода
   //     output.write(Integer.parseInt(a));
  //      output.write(Integer.parseInt()); // отправляем данные               //Выводим в него данные
  //      output.write(Integer.parseInt()); // отправляем данные               //Выводим в него данные

// получили поток для чтения данных
//        InputStream input = connection.getInputStream();
//        String data = String.valueOf(input.read()); // читаем данные                // Читаем из него данные
//        String b = JsonConvert.convertString(data);




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
//    }
//}


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