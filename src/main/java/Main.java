import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        DaoProducts daopro = new DaoProducts();
        DaoDataBase daodata= new DaoDataBase();
        port(getHerokuAssignedPort());
        get("/cotizacion/:genero/:pijama", (req, res) -> "El precio solicitado es: "+daopro.getValueProduct(req.params(":genero").toString(), req.params(":pijama").toString()));
        get("/clientes", (req, res) -> "Nuestros clientes: <br>"+daodata.getClients());
        get("/cotizacion/:genero", (req, res) -> "Pijamas: <br>"+daopro.getPijamas(req.params(":genero").toString()));


    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }

}
