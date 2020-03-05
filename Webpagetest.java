import java.io.*;
import java.net.MalformedURLException; 
import java.net.URL; 

public class Webpagetest {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "Webpagetest.txt";
		
        try {
        // Create a URL for the desired page
        URL url = new URL("https://en.wikipedia.org/wiki/Weather");       

        // Read all the text returned by the server
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String str;
		PrintStream fileStream = new PrintStream("Webpagetest.txt");
		System.setOut(fileStream);
        while ((str = in.readLine()) != null) {
            str = in.readLine().toString();
            
			
			System.out.println(str);
            // str is one line of text; readLine() strips the newline character(s)
        }
        in.close();
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		}
		
		
    }
}