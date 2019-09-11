/**
 * Clase: ControladorAPIgorest
 * 
 * @version: 0.1
 *  
 * @since: 11/09/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Rafael Avila Llorente
 * 
 * Copyrigth: CECAR
 */


package edu.cecar.controladores;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
import us.monoid.web.Resty;

/**
 *
 *  Clase
 */
public class ControladorAPIgorest {
    
    public static void main(String[] args) {
        
        try {
            JSONObject jsonRoot = new Resty().json("https://gorest.co.in/public-api/users?_format=json&access-token=iH1oWP8APwBMVOXbKc0IEBi9uy2czigTB7cn").object();
            
            JSONObject jsonMeta = jsonRoot.getJSONObject("_meta");
            System.out.println(jsonMeta.get("totalCount"));
            
            JSONArray JSONArrayResult = jsonRoot.getJSONArray("result");
            
            for (int i = 0; i < JSONArrayResult.length(); i++) {
                
                System.out.println(JSONArrayResult.getJSONObject(i).get("email")+ " & " + JSONArrayResult.getJSONObject(i).get("last_name"));
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladorAPIgorest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
