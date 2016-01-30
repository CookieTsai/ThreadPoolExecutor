package sample.qrcode;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * Created by Cookie on 16/1/30.
 */
public class SampleMain {
    public static void main(String[] args) throws Exception {
        String context = "http://tsai-cookie.blogspot.com/2016/01/qrcode-with-logo-java-sample.html";
        ByteArrayOutputStream stream = QRCodeUtils.encodeWithLogo(context);
        FileOutputStream out = new FileOutputStream("output.png");
        out.write(stream.toByteArray());
        stream.close();
        out.close();
    }
}