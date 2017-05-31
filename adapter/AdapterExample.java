/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class AdapterExample {
    public static void main(String[] args) {
        final String address = "1.3.4.5";
        HttpFtpAdapter adapter = new HttpFtpAdapter(address);
        String response = adapter.httpPostRequest("File content");
        System.out.println("Http post request response from FTP is " + response);
    }
}

class Ftp {

    private String address;

    public Ftp(final String address) {
        this.address = address;
    }

    public String sendFile(final String file) {
        // send file to address
        return "FTP response";
    }
}

class HttpFtpAdapter {

    private Ftp ftp;

    public HttpFtpAdapter(final String address) {
        ftp = new Ftp(address);
    }

    public String httpGetRequest(final String file) {
        return ftp.sendFile(file);
    }

    public String httpPostRequest(final String file) {
        return ftp.sendFile(file);
    }
}

