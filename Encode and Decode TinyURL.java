public class Codec {

    // Encodes a URL to a shortened URL.
    public Map<String,String>m1=new HashMap<String,String>();
    static int i=0;
    public String encode(String longUrl) {
        String s="http://tinyurl.com/";
        s+=String.valueOf(i);
       
        m1.put(s,longUrl);
        
        i++;
          
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m1.get(shortUrl);
    }
}