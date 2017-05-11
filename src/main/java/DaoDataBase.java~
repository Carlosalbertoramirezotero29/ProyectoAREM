
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 ********+
 * @author 2107713
 */
public class DaoDataBase {

    private static int idIngreso = 0;
    private static Map<Integer, Cliente> client = new HashMap<>();

    public DaoDataBase() {
        client.put(idIngreso, new Cliente(890700010, "GILBERTO HURTADO Y CIA. S.C.A.             ", 4587559, "CARRERA 5 NO. 30-61                 ", "ACTIVIDADES INMOBILIARIAS                      ", "IBAGUE     ", "ventas@gilbertoHurtado.com.co ", "04/01/2004", "FRANCISCO JOSE HURTADO PEREZ  "));
        idIngreso++;
        client.put(idIngreso, new Cliente(830015816, "GRUPO EMPRESARIAL DE INVERSIONES Y CIA LTDA", 5874488, "B/GRANDE CRA.3 EDIF.EJECUTIVO OF.702", "ADECUACION DE OBRAS DE CONSTRUCCION            ", "BOGOTA D.C.", "ventas@grupoInversiones.com.co", "12/11/2010", "JOSE MARIA BARRERO CORTES     "));
        idIngreso++;
        client.put(idIngreso, new Cliente(860000868, "TEJIDOS LONDRES LTDA                       ", 7166428, "CALLE 60 A SUR CARRERA 105          ", "COMERCIO AL POR MAYOR                          ", "BOGOTA D.C.", "ventas@tejidoslonderes.com.co ", "07/02/2008", "ARTURO HARKER BORDA           "));
        idIngreso++;
        client.put(idIngreso, new Cliente(860508544, "SUPRA S.A.                                 ", 4169813, "CALLE 10 N.8-27                     ", "COMERCIO AL POR MENOR                          ", "BOGOTA D.C.", "ventas@supra.com.co           ", "09/01/2004", "LUIS HERNANDO HERNANDEZ PATINO"));
        idIngreso++;
        client.put(idIngreso, new Cliente(860001056, "ALMACEN SANITARIO LTDA                     ", 4196678, "CALLE 10 NO. 37 A 51                ", "COMERCIO AL POR MAYOR                          ", "BOGOTA D.C.", "ventas@sanitario.com.co       ", "05/11/2006", "EDGAR CARDENAS RUIZ           "));
        idIngreso++;
        client.put(idIngreso, new Cliente(890316640, "REPRESENTACIONES FERCON LTDA.              ", 4196423, "CARRERA 11 # 41 - 46                ", "COMERCIO AL POR MAYOR                          ", "CALI       ", "ventas@fercon.com.co          ", "11/01/2003", "VERA PATRICIA HEILBRON ANDRADE"));
        idIngreso++;
        client.put(idIngreso, new Cliente(890937016, "DISTRIBUIDORA TROPITODO LIMITADA           ", 4785169, "AVENIDA PEDRO DE HEREDIA # 22-88    ", "COMERCIO AL POR MAYOR                          ", "ITAGUI     ", "ventas@tropitodo.com.co       ", "10/09/2014", "ALVARO GONZALEZ SISTAC        "));
        idIngreso++;
        client.put(idIngreso, new Cliente(800156111, "CONSIMEX S.A.                              ", 4120069, "CARRERA 5 # 12-16 OFICINA 607       ", "ALMACENAMIENTO Y OTRAS ACTIVIDADES RELACIONADAS", "BOGOTA D.C.", "ventas@consimex.com.co        ", "07/08/2013", "JAIME EDUARDO CABAL CABAL     "));
        idIngreso++;
        client.put(idIngreso, new Cliente(860041299, "GARCIA WERNHER Y CIA S EN C.               ", 2004987, "CALLE 75 NO. 7-30                   ", "OTRAS ACTIVIDADES EMPRESARIALES                ", "BOGOTA D.C.", "ventas@wernher.com.co         ", "10/09/2007", "ALFONSO GARCIA GALVIS         "));
        idIngreso++;
        client.put(idIngreso, new Cliente(890311341, "LISTOS S.A.                                ", 2778945, "CALLE 21N 8N21 PISO 3               ", "OTRAS ACTIVIDADES EMPRESARIALES                ", "CALI       ", "ventas@listos.com.co          ", "06/01/2015", "BERNARDO JIMENEZ LOZANO       "));

    }

    public String getClients() {
        String res = "<style>\n"
                + "table, th, td {\n"
                + "    border: 1px solid black;\n"
                + "    border-collapse: collapse;"
                + "    font-family: Arial, Helvetica, sans-serif;"
                + "}\n"
                + "</style>"
                + "<table style=\"width:100%\">\n"
                + "  <tr>\n"
                + "    <th>NIT</th>\n"
                + "    <th>Nombre empresa</th> \n"
                + "    <th>Telefono</th>\n"
                + "    <th>Direccion</th>\n"
                + "    <th>Ciudad</th>\n"
                + "    <th>Email</th>\n"
                + "    <th>Representante legal</th>\n"
                + "    <th>Actividad</th>\n"
                + "    <th>Fecha inicio de contrato</th>\n"
                + "  </tr>\n";
        ArrayList<Cliente> arreglo = new ArrayList(client.values());
        for (int i = 0; i < arreglo.size(); i++) {
            res += "<tr>";
            res += "<td>" + arreglo.get(i).getID() + "</td><td>" + arreglo.get(i).getNombreEmpresa() + "</td><td>" + arreglo.get(i).getTelefono() + "</td><td>" + arreglo.get(i).getDireccion() + "</td><td>" + arreglo.get(i).getCiudad() + "</td><td>" + arreglo.get(i).getEmail() + "</td><td>" + arreglo.get(i).getRepresentante() + "</td><td>" + arreglo.get(i).getSectorActividad() + "</td><td>" + arreglo.get(i).getFechaInicioContrato() + "</td>";
            res += "</tr>";
        }
        res += "</table>";
        return res;
    }

}
