package com.clevertap.apns.clients;


import com.clevertap.apns.ApnsClient;
import com.clevertap.apns.Notification;
import com.clevertap.apns.NotificationResponse;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class SyncOkHttpApnsClientTest {

    @Test
    public void test() throws IOException, CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        final ApnsClient client = new ApnsClientBuilder()
                .withProductionGateway()
                .inSynchronousMode()
                .withCertificate(new FileInputStream(""))
                .withPassword("")
                .withProductionGateway()
                .withDefaultTopic("")
                .build();
        final String goodToken = "";

        Notification n = new Notification.Builder(goodToken)
                .topic("com.qiwi.sovest")
                .alertBody("Hello").build();

        NotificationResponse result = client.push(n);


    }

}
