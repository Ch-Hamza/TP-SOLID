public class EncodeBasedOnNetworkAndDatabase implements EncodingModule {

    private Database database = new MyDatabase();

    @Override
    public void encode() throws IOException
    {
        URL url;
        url = new URL("https", "google.com", "/");
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        this.database.write(encodedString);
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}