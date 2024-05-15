package DAO;

import DAOImpl.SellerDaoIDBC;

public class DaoFactory {

    public static SellerDAO createSellerDao() {
        return new SellerDaoIDBC();
    }
}
