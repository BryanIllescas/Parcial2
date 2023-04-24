package Seguridad.Modelo;



import Seguridad.Controlador.clsCompras;
import Seguridad.Modelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class daoCompras {

    private static final String SQL_SELECT = "SELECT compid, compfecha, compmonto, compmoneda, compestado FROM tbl_compras";
    private static final String SQL_INSERT = "INSERT INTO tbl_compras(compfecha, compmonto, compmoneda, compestado) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_compras SET compfecha=?, compmonto=?, compmoneda=?, compestado=? WHERE compid = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_compras WHERE compid=?";
    private static final String SQL_SELECT_ID = "SELECT compid, compfecha, compmonto, compmoneda, compestado FROM tbl_compras WHERE compid = ?";

    public static clsCompras getComprasPorId(clsCompras modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<clsCompras> consultaCompras() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<clsCompras> compras = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("compid");
                Date fecha = rs.getDate("compfecha");
                double monto = rs.getDouble("compmonto");
                String moneda = rs.getString("compmoneda");
                String estado = rs.getString("compestado");
                clsCompras compra = new clsCompras();
                compra.setIdCompra(id);
                compra.setFechaCompra(fecha);
                compra.setMontoCompra(monto);
                compra.setMonedaCompra(moneda);
                compra.setEstadoCompra(estado);
                compras.add(compra);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return compras;
    }

    public int ingresaCompra(clsCompras compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setDate(1, (Date) compra.getFechaCompra());
            stmt.setDouble(2, compra.getMontoCompra());
            stmt.setString(3, compra.getMonedaCompra());
            stmt.setString(4, compra.getEstadoCompra());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsCompras actualizaCompra(clsCompras compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setDate(1, (Date) compra.getFechaCompra());
            stmt.setDouble(2, compra.getMontoCompra());
            stmt.setString(3, compra.getMonedaCompra());
            stmt.setString(4, compra.getEstadoCompra());
            stmt.setInt(5, compra.getIdCompra());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ResultSet rs = null;
        Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return compra;
    }    

    public List<clsCompras> obtenerCompras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int deleteCompra(clsCompras compra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void modificarCompras(clsCompras modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
