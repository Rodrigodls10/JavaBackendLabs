import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.io.OutputStream;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        // Crear el servidor HTTP en el puerto 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/hello", new HelloHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Servidor iniciado en el puerto 8000");
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle (HttpExchange exchange) throws IOException {
            String response = "Hello World!";
            exchange.sendResponseHeaders(200, response.getBytes().length); //responde 200 (ok)
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
