import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodeWithFiles();
        encodingModule.encode();

        EncodingModule encodingModuleNetworkDatabase = new EncodeBasedOnNetworkAndDatabase();
        encodingModuleNetworkDatabase.encode();
    }
}
