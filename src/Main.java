import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    /**
     * Count the words number in string.
     * @param input the input string
     * @param word the need to be compared
     * @return the number of words
     */
   public static int wordcount(String input,String word) {
       String regEx="[`~!@#$%^&*()+=|{}':;,/.<>?！￥…（）—【】‘；：”“’。，、？]";
       String[] words = input.split(regEx);
       int count = 0;
       for(int i = 0; i < words.length; i++) {
           if (words[i] == word) {
               count++;
           }
       }
    }



}
