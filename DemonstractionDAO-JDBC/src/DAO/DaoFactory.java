package DAO;

import DAOImpl.SellerDaoIDBC;
import DB.DB;

public class DaoFactory {

    public static SellerDAO createSellerDao() {
        return new SellerDaoIDBC(DB.getConnection());
    }
}
