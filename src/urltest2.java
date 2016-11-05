import java.io.*;
import java.net.*;

public class urltest2 {
	public static void main(String[] args) throws InterruptedException {
	    URL url;
	    InputStream is = null;
	    BufferedReader br;
	    String line;

	    try {
	    	System.out.println("TEST");
	    	Thread.sleep(1000);
	        url = new URL("http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ&limit=5");
	        System.out.println("TEST");
	    	Thread.sleep(1000);
	        is = url.openStream();  // throws an IOException
	        System.out.println("TEST");
	    	Thread.sleep(1000);
	        br = new BufferedReader(new InputStreamReader(is));

	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	    } catch (MalformedURLException mue) {
	         mue.printStackTrace();
	    } catch (IOException ioe) {
	         ioe.printStackTrace();
	    } finally {
	        try {
	            if (is != null) is.close();
	        } catch (IOException ioe) {
	            // nothing to see here
	        }
	    }
	}
}
