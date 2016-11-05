import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class urltest3 {
	public static void main(String[] args) throws IOException {
		URL url;
		URLConnection urlc;
		StringBuilder html = new StringBuilder();
		String urlstr = "http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ&limit=5";
		
		System.out.println("Analyzing the following url:\n" + urlstr);
		
		url = new URL(urlstr);
		urlc = url.openConnection();
		urlc.connect();
		urlc = url.openConnection();
		urlc.setRequestProperty("User-Agent", "Mozilla/5.0");
		
		BufferedInputStream in = new BufferedInputStream(urlc.getInputStream());
		int ch;
		while ((ch = in.read()) != -1) {
		    html.append((char) ch);
		}
		System.out.println(html);
	}
}
