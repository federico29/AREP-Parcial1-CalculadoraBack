package edu.escuelaing.arep;

import edu.escuelaing.calculadora.Calculadora;
import org.json.JSONObject;
import static spark.Spark.*;

public class App {

    public static void main( String[] args ){
        port(getPort());
        get("/", (req, res) -> {
            Double number = Double.parseDouble(req.queryParams("value"));
            String function = req.queryParams("operation");
            JSONObject json = new JSONObject();
            json.put("/resultado/", Calculadora.calcular(function, number));
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
