package multiThreading.synchronization;

import java.util.HashMap;
import java.util.Map;

public class SharedProductResource {
    private Map<String,Integer> products=new HashMap<String, Integer>();

    public SharedProductResource(){
        products.put("PEN",new Integer(10));
        products.put("BOOK",new Integer(1));
        products.put("CYCLE",new Integer(2));

    }

    public String buyProduct(String key)
    {
        if(products.containsKey(key))
        {
            Integer qty=products.get(key);
            if(!qty.equals(new Integer(0)))
            {
                products.put(key,(qty-1));
                return "Processing successful --" +key+ " is out for delivery to "+Thread.currentThread().getName();

            }
        }
        return "Product out of stock "+Thread.currentThread().getName();

    }
}
