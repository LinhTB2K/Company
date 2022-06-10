
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import learn.com.data.Employee;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String... args) throws SQLException {
//        fetchData();
        System.out.println("Số :");
        int empno = scan.nextInt();
        System.out.println("Chữ :");
        String ename = scan.nextLine();
        System.out.println("Chữ :");
        String job = scan.nextLine();
        System.out.println("Số :");
        int mgr = scan.nextInt();
        System.out.println("Số :");
        int sal = scan.nextInt();
        System.out.println("Số :");
        int comm = scan.nextInt();
        System.out.println("Số :");
        int eptno = scan.nextInt();
        System.out.println("Số :");
        int id = scan.nextInt();
        System.out.println("Chữ :");
        String name = scan.nextLine();
        System.out.println("Chữ :");
        String email = scan.nextLine();
        System.out.println("Chữ :");
        String country = scan.nextLine();
        System.out.println("Chữ :");
        String password = scan.nextLine();
        
        Employee ep = new Employee( empno, ename, job, mgr, sal, comm, eptno, id, name, email, country,password);
//        ep.setName(ep.getEname());
//        ep.setJob(ep.getJob());
//        ep.setComm(ep.getComm());
//        ep.setMgr(ep.getMgr());
//        ep.setEmpNo(ep.getEmpNo());
//        ep.setDeptNo(ep.getDeptNo());
//        ep.setSal(ep.getSal());
        
        ThemDuLieu(ep);
        int a = scan.nextInt();
        XoaDuLieu(a);

    }

    public static int fetchData() throws SQLException {
        String SQL_QUERY = "select * from emp";
        List<Employee> employees = null;
        try (Connection con = DataSource.getConnection();
                PreparedStatement pst = con.prepareStatement(SQL_QUERY);
                ResultSet rs = pst.executeQuery();) {
            con.setAutoCommit(false);
            employees = new ArrayList<>();
            Employee employee;
            while (rs.next()) {
                employee = new Employee();
                employee.setEmpNo(rs.getInt("empno"));
                employee.setEname(rs.getString("ename"));
                employee.setJob(rs.getString("job"));
                employee.setMgr(rs.getInt("mgr"));
                employee.setHiredate(rs.getDate("hiredate"));
                employee.setSal(rs.getInt("sal"));
                employee.setComm(rs.getInt("comm"));
                employee.setDeptNo(rs.getInt("deptno"));
                employees.add(employee);
                System.out.println(rs.getInt("empno") + "  " + rs.getString("ename")
                        + "  " + rs.getString("job") + "  " + rs.getInt("mgr") + "  " + rs.getInt("sal") + "  " + rs.getInt("comm") + "  " + rs.getInt("deptno"));
                con.commit();
                con.close();
            }
        }
        return employees.size();

    }

    public static int ThemDuLieu(Employee ep) throws SQLException {
        Connection cnn = DataSource.getConnection();
        if (cnn == null) {
            return -1;
        }
        String sql = "insert into emp values (8,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cnn.prepareStatement(sql);
            cnn.setAutoCommit(false);
            for (int i = 1; i < 4; i++) {
                pst.setString(1, ep.getEname());
                pst.setString(2, ep.getJob());
                pst.setInt(3, ep.getMgr());
                pst.setDate(4, ep.getHiredate());
                pst.setInt(5, ep.getSal());
                pst.setInt(6, ep.getComm());
                pst.setInt(7, ep.getDeptNo());
            }
            int n = pst.executeUpdate();
//            cnn.commit();
            cnn.close();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }

    public static int XoaDuLieu(int id) throws SQLException {
        Connection cnn = DataSource.getConnection();
        cnn.setAutoCommit(false);
        if (cnn == null) {
            return -1;
        }
        String sql = "DELETE FROM users WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            int n = stm.executeUpdate();
//            cnn.commit(); 
            cnn.close();

//nếu muốn xóa thì mặc định commit là true hoặc có thể bỏ comment dòng bên trên.
//Do dòng này xét điều kiện: "nếu mọi thứ ỏn thì code sẽ chạy"
            return n;
        } catch (SQLException ex) {
            cnn.rollback();
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}
