package DAO;

import DAOImpl.DepartmentDaoJDBC;
import DAOImpl.SellerDaoIDBC;
import DB.DB;

public class DaoFactory {

    public static SellerDAO createSellerDao() {
        return new SellerDaoIDBC(DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
