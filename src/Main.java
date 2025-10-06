import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department dp = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob.gmail.com", new Date(), 3000.00, dp );

        SellerDao sellerDao = DaoFactory.createSellerDAo();

        System.out.println(seller);

    }
}