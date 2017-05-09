
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Carlos Alberto Ramirez Otero
 */
public class DaoProducts {

    private static Map<String, Map<String, Integer>> productCatalog = new HashMap<>();

    public DaoProducts() {
        productCatalog.put("Mujer", new HashMap<>());
        productCatalog.put("Hombre", new HashMap<>());
        productCatalog.put("Joven", new HashMap<>());

        productCatalog.get("Mujer").put("Romane", 64650);
        productCatalog.get("Mujer").put("Meryl", 54900);
        productCatalog.get("Mujer").put("Osiris", 78650);
        productCatalog.get("Mujer").put("Agustin", 80800);
        productCatalog.get("Mujer").put("Waelle", 39560);

        productCatalog.get("Hombre").put("Henley", 49900);
        productCatalog.get("Hombre").put("Micropunto", 58900);
        productCatalog.get("Hombre").put("Estampada", 44900);
        productCatalog.get("Hombre").put("Casual", 48650);

        productCatalog.get("Joven").put("Avengers", 58400);
        productCatalog.get("Joven").put("Astronauta", 59900);
        productCatalog.get("Joven").put("Mickey", 26900);
        productCatalog.get("Joven").put("Dora la Celadora", 55600);
        productCatalog.get("Joven").put("Shen Long", 43900);
        productCatalog.get("Joven").put("Minnie", 20900);
        productCatalog.get("Joven").put("Frozen", 42900);
        productCatalog.get("Joven").put("Soy Luna", 45650);
    }

    public String getPijamas(String genero) {
        String res = "<style>\n"
                + "table, th, td {\n"
                + "    border: 1px solid black;\n"
                + "    border-collapse: collapse;"
                + "    font-family: Arial, Helvetica, sans-serif;"
                + "}\n"
                + "</style>"
                + "<table style=\"width:100%\">\n"
                + "  <tr>\n"
                + "    <th>Nombre</th>\n"
                + "    <th>Precio</th> \n"
                + "  </tr>\n";
        Iterator it = productCatalog.get(genero).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            res += "<tr>";
            res += "<td>" + e.getKey() + "</td><td>" + e.getValue() + "</td>";
            res += "</tr>";
        }
        res += "</table>";
        return res;

    }

    public int getValueProduct(String genero, String tipo) {
        if (productCatalog.containsKey(genero)) {
            if (productCatalog.get(genero).containsKey(tipo)) {
                return productCatalog.get(genero).get(tipo);
            }
        }
        return -1;
    }

}
