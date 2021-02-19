package edu.escuelaing.arep;

import edu.escuelaing.calculadora.Calculadora;
import org.json.JSONObject;
import static spark.Spark.*;

public class App {

    public static void main( String[] args ){
        port(getPort());
        get("/", (req, res) -> {
            String funcion = req.queryParams("funcion");
            Double valor = Double.parseDouble(req.queryParams("valor"));
            JSONObject json = new JSONObject();
            json.put("/resultado/", Calculadora.calcular(funcion, valor));
            return json;
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
    return 4567;
    }
}
