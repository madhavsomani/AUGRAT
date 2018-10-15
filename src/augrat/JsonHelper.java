/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augrat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonHelper {

     public static JsonBugBlockModels bugBlockJsonRead(String bugBlockJsonLoc)
    {
      BufferedReader reader = null;
      JSONObject configObject = null;
      JsonBugBlockModels JsonBugBlockModel = new JsonBugBlockModels();
         
    try {
        reader = new BufferedReader(new FileReader(bugBlockJsonLoc));

        StringBuilder jsonData = new StringBuilder();
        String data = "";
        while( (data = reader.readLine()) != null ) {
            jsonData.append(data);
        }

        configObject = new JSONObject(jsonData.toString());
        System.out.println(configObject);
       
    } catch (IOException | JSONException e) {
        
        showErrorMessage("Error in Loading Json", e);
        return null;
    }
    
     try {
       if(configObject != null)
       {
        JsonBugBlockModel.nameOfBug = configObject.getJSONObject("AUGRATBugBlock").getString("nameOfBug");
        JsonBugBlockModel.className = configObject.getJSONObject("AUGRATBugBlock").getString("className");
        JsonBugBlockModel.methodName = configObject.getJSONObject("AUGRATBugBlock").getString("methodName");
        JsonBugBlockModel.numberOfLines = configObject.getJSONObject("AUGRATBugBlock").getInt("numberOfLines");
        JsonBugBlockModel.bugInfo = configObject.getJSONObject("AUGRATBugBlock").getString("bugInfo");
        
       }
        
    } catch(JSONException e) {
        showErrorMessage("Json String Import Error: ", e);
        return null;
    }
     
     try{
     
         JSONArray headersArray = configObject.getJSONObject("AUGRATBugBlock").getJSONArray("headers");
        for(int i = 0; i < headersArray.length(); i++) {
            JsonBugBlockModel.headers.add(headersArray.getString(i));
        }
        
        JSONArray bugBlockArray = configObject.getJSONObject("AUGRATBugBlock").getJSONArray("bugBlock");
        for(int i = 0; i < bugBlockArray.length(); i++) {
            JsonBugBlockModel.bugBlock.add(bugBlockArray.getString(i));
        }
        
     }
     catch(JSONException e){
         showErrorMessage("Json bugBlock and Header Import Error: ", e);
         return null;
     }
     
     return JsonBugBlockModel;
     
  }
    private static void showErrorMessage(String missing_Configuration_Information, Exception e) {
        JOptionPane.showMessageDialog(null, missing_Configuration_Information + "\n Error: " + e.toString(),"AUGRAT",JOptionPane.ERROR_MESSAGE);
    }
}
