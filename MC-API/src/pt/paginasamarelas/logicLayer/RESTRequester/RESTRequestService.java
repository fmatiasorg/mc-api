package pt.paginasamarelas.logicLayer.RESTRequester;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.codehaus.jackson.map.ObjectMapper;

import pt.paginasamarelas.dataLayer.entities.Request;
import pt.paginasamarelas.logicLayer.operations.PropertiesReader;

public class RESTRequestService {
	
	public String makeRequest(Request request) throws IOException {
		
			PropertiesReader props = new PropertiesReader();
			StringBuffer response = new StringBuffer();
	        try
	        {
	 
		        // 1. URL
		        URL url = new URL(props.getUrl());
		 
		        // 2. Open connection
		        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		 
		        // 3. Specify POST method
		        conn.setRequestMethod("POST");
		 
		        // 4. Set the headers
		        //conn.setRequestProperty("Content-Type", "application/json");
		        //conn.setRequestProperty("Authorization", "key="+apiKey);
		 
		        conn.setDoOutput(true);
		 
		        // 5. Add JSON data into POST request body 
		 
		        //`5.1 Use Jackson object mapper to convert Advertiser object into JSON
		        ObjectMapper mapper = new ObjectMapper();
		 
		        // 5.2 Get connection output stream
		        DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
		 
		        // 5.3 Copy Content "JSON" into 
		        mapper.writeValue(wr, request);
		 
		        // 5.4 Send the request
		        wr.flush();
		 
		        // 5.5 close
		        wr.close();
		 
		        // 6. Get the response
		        int responseCode = conn.getResponseCode();
		        System.out.println("\nSending 'POST' request to URL : " + url);
		        System.out.println("Response Code : " + responseCode);
		 
		        BufferedReader in = new BufferedReader(
		                    new InputStreamReader(conn.getInputStream(), "UTF-8"));
			     // FM 19.05.2016 ------------------------------------------ ^
		        String inputLine;
		        
		 
		        while ((inputLine = in.readLine()) != null) 
		        {
		            response.append(inputLine);
		        }
		        in.close();
		 
		        // 7. Print result
		        System.out.println("Response length:" + response.toString().length());
		        if (response.toString().length()>100001) {
			        System.out.println(response.toString().substring(0,100000));
		        }
			    else {
			        System.out.println(response.toString());
			    }		 
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        return response.toString();
	    }
		

}
