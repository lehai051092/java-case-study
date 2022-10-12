package action.product;

import common.Constains;
import io.HandleFile;
import model.Product;

import java.util.List;

public class Common {
    public static String checkSku(String sku) {
        boolean checkSku = findSkuInFile(sku);

        if (checkSku) {
            return sku;
        }

        return "";
    }

    public static boolean findSkuInFile(String sku)
    {
        List<Product> products = HandleFile.readDataFromFile(Constains.pathProducts());

        for (Product product : products) {
            if (product.getSku().equals(sku)) {
                return false;
            }
        }

        return true;
    }
}
