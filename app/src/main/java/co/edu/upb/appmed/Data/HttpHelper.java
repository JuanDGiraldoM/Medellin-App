package co.edu.upb.appmed.Data;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Juan D Giraldo M on 2/11/2017.
 */

public class HttpHelper {

    private URL url;

    public HttpHelper(String url) throws Exception {
        this.url = new URL(url);

        //HttpsURLConnection connection = url.openConnectior();
    }
}
