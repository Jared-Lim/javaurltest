import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class urltest3 {
	public String parser(String urlstr) throws IOException {
		URL url;
		URLConnection urlc;
		StringBuilder html = new StringBuilder();
		
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
		
		return html.toString();
	}
}
