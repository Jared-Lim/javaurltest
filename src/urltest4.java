import java.io.IOException;

public class urltest4 {
	public static void main(String[] args) throws IOException {
		urltest3 TEST = new urltest3();
		System.out.println(TEST.parser("http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ&limit=5"));
	}
}
