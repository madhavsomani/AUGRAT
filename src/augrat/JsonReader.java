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

public class JsonReader {

     public static void bugBlockJsonRead(String bugBlockJsonLoc)
    {
      BufferedReader reader;
      JSONObject configObject;
      JsonBugBlockModels JsonBugBlockModel = new JsonBugBlockModels();
         // read the configuration information
    try {
        reader = new BufferedReader(new FileReader(bugBlockJsonLoc));

        StringBuilder jsonData = new StringBuilder();
        String data = "";
        while( (data = reader.readLine()) != null ) {
            jsonData.append(data);
        }

        configObject = new JSONObject(jsonData.toString());
        System.out.println(configObject);
        
        JsonBugBlockModel.nameOfBug = configObject.getJSONObject("AUGRATBugBlock").getString("nameOfBug");
        JsonBugBlockModel.className = configObject.getJSONObject("AUGRATBugBlock").getString("className");
        JsonBugBlockModel.methodName = configObject.getJSONObject("AUGRATBugBlock").getString("methodName");
        JsonBugBlockModel.numberOfLines = configObject.getJSONObject("AUGRATBugBlock").getInt("numberOfLines");
        JsonBugBlockModel.bugInfo = configObject.getJSONObject("AUGRATBugBlock").getString("bugInfo");
        
        
      //  JsonBugBlockModel.headers = configObject.getJSONObject("AUGRATBugBlock").getJSONObject("headers");
        
       // JsonBugBlockModel.bugBlock = configObject.getJSONObject("AUGRATBugBlock").getString("bugBlock");
        
    } catch (IOException | JSONException e) {
        
        showErrorMessage("Missing Configuration Information", e);
    }
    
    // get the switcher delay information from the configuration object
    double delay = 10; // default to 10 minutes if the config information is wrong
    try {
       
    } catch(Exception e) {
        showErrorMessage("Configuration Error: ", e);
    }
    
  }

    private static void showErrorMessage(String missing_Configuration_Information, Exception e) {
        JOptionPane.showMessageDialog(null, missing_Configuration_Information + "\n Error: " + e.toString(),"AUGRAT",JOptionPane.ERROR_MESSAGE);
    }
}
