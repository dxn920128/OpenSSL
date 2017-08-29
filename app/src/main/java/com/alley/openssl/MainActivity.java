package com.alley.openssl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;

import com.alley.openssl.util.JniUtils;

public class MainActivity extends AppCompatActivity {
    private TextView tvSignature;
    private static final String TEST_DATA = "13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————13bcdfasg5456!@#$%^&*()_+=~`/|?><:'-+*./数据加解密测试————";
    private static final String TEST_KEY = "JA2F8AKJF3D7HF12HJD86D4";

    private static final String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\n" + "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKLy3gcwWwy+mhcr\n" + "gcXccrRu+UQUHDwvogZbGjbBDGsyt5hY69FtwIy/45tdj42xb4Tr0o1qKjuXHmIt\n" + "zWAlgm+e9Fi4vwj6sIIbgdvYhi2dm/N2abNzEMJ2WsG2kei64qsaZtlawWv9k2GG\n" + "ChP63MR79Z9+ucBzu+SZp+XrEt9DAgMBAAECgYB4Tr51KlOfJj7YqounDWs3ItQx\n" + "WnO6UCTdcnf5QzErGIgLGGQL/W9zu92NgVeS8xV2WzLarC7AToPlUxHWUftpxqCa\n" + "alQ+HtJ2zROnbblMwmEcnwsPXD8SncjJGDg1mSxkhi/jw1riPg36Exw1VGgmww4b\n" + "+iMboCv3ApBDdxn7yQJBAM7rgodIHGf11d9+TO+PUkglc9AfCDMXQraDirU6JjCh\n" + "6AVJXH76k2oLz4DCvd3CCBcM5qGmdAzTK/X1MSToGgUCQQDJmVtKiJkPOe/N2Vi3\n" + "MkIIalnqZ9GFYtDjUV3dgI1QVgLQ8qpN2y98j8PU9nM/BpU0fU4qSX36vPCfYn0e\n" + "mS6nAkABiAKmR6VWK56Skde16iScvhI2VxRzdFedDCopny2LLJeP+nQByI7wuPen\n" + "J0nKa1Yt/X1zcsznD2UC4/aiJEmVAkACL+a8pUS71I4UdqIuwp3Sx4yYLW4pe0v2\n" + "22AgUg+2amh3adqNI66dNFYUjmPrsB+YRS++57M1MC2QHRpsZY8LAkAKFNUtX47a\n" + "4LYofojZrEdcz9O8xisB4bsv04G+WiM4bqTrlQo/6Y3YofvaP5jGSwBW8K/w6KPX\n" + "D0VGzyfqFiL7\n" + "-----END PRIVATE KEY-----\n";

    private static final String TEST_PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----\n" + "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCi8t4HMFsMvpoXK4HF3HK0bvlE\n" + "FBw8L6IGWxo2wQxrMreYWOvRbcCMv+ObXY+NsW+E69KNaio7lx5iLc1gJYJvnvRY\n" + "uL8I+rCCG4Hb2IYtnZvzdmmzcxDCdlrBtpHouuKrGmbZWsFr/ZNhhgoT+tzEe/Wf\n" + "frnAc7vkmafl6xLfQwIDAQAB\n" + "-----END PUBLIC KEY-----\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setSubView();

        initEvent();
    }

    private void initView() {
        tvSignature = (TextView) findViewById(R.id.sample_text);
    }

    private void setSubView() {
        JniUtils jni = new JniUtils();

        Log.i("body", "原始数据长度：->" + TEST_DATA.length());
        byte[] encodeByHmacSHA1 = jni.encodeByHmacSHA1(TEST_DATA.getBytes());
        String hmacSHA1 = Base64.encodeToString(encodeByHmacSHA1, Base64.NO_WRAP);
        Log.i("body", "hmacSHA1签名编码->" + hmacSHA1 + "\n签名长度->" + hmacSHA1.length());
        tvSignature.setText(hmacSHA1);

        Log.i("body", "MD5->摘要" + jni.MD5(TEST_DATA.getBytes()));

        String xory = Base64.encodeToString(jni.xOr(TEST_DATA.getBytes()), Base64.NO_WRAP);
        Log.i("body", "异或加密编码->" + xory);
        Log.i("body",  "编码长度：->" + xory.length());
        String xoryDec = new String(jni.xOr(Base64.decode(xory, Base64.NO_WRAP)));
        Log.i("body", "异或解密->" + xoryDec);
        Log.i("body", "解密后数据长度：->" + xoryDec.length());

        byte[] encodeAES = jni.encodeByAES(TEST_KEY.getBytes(), TEST_DATA.getBytes());
        String aesPsw = Base64.encodeToString(encodeAES, Base64.NO_WRAP);
        Log.i("body", "AES加密编码->" + aesPsw);
        Log.i("body", "编码长度：->" + aesPsw.length());
        byte[] decodeAES = jni.decodeByAES(TEST_KEY.getBytes(), Base64.decode(aesPsw, Base64.NO_WRAP));
        Log.i("body", "AES解密->" + new String(decodeAES));
        Log.i("body", "AES解密长度->" + new String(decodeAES).length());

        byte[] encodeByRSAPubKey = jni.encodeByRSAPubKey(TEST_PUBLIC_KEY.getBytes(), TEST_DATA.getBytes());
        String encodeByPubKey = Base64.encodeToString(encodeByRSAPubKey, Base64.NO_WRAP);
        Log.i("body", "RSA公钥加密编码->" + encodeByPubKey);
        Log.i("body",  "编码长度：->" + encodeByPubKey.length());
        byte[] decodeByRSAPrivateKey = jni.decodeByRSAPrivateKey(TEST_PRIVATE_KEY.getBytes(), encodeByRSAPubKey);
        String decodeByRSAPK = new String(decodeByRSAPrivateKey);
        Log.i("body", "RSA私钥解密->" + decodeByRSAPK);
        Log.i("body", "RSA公加私解是否相同->" + TEST_DATA.equals(decodeByRSAPK));

        byte[] encodeByRSAPrivateKey = jni.encodeByRSAPrivateKey(TEST_PRIVATE_KEY.getBytes(), TEST_DATA.getBytes());
        String encodeByPrivateKey = Base64.encodeToString(encodeByRSAPrivateKey, Base64.NO_WRAP);
        Log.i("body", "RSA私钥加密编码->" + encodeByPrivateKey);
        Log.i("body", "编码长度：->" + encodeByPrivateKey.length());
        byte[] decodeByRSAPubKey = jni.decodeByRSAPubKey(TEST_PUBLIC_KEY.getBytes(), encodeByRSAPrivateKey);
        String decodeByPubKey = new String(decodeByRSAPubKey);
        Log.i("body", "RSA公钥解密->" + decodeByPubKey);
        Log.i("body", "RSA私加公解是否相同->" + TEST_DATA.equals(decodeByPubKey));

        byte[] signByRSAPrivateKey = jni.signByRSAPrivateKey(TEST_PRIVATE_KEY.getBytes(), TEST_DATA.getBytes());
        String signByRSAKey = Base64.encodeToString(signByRSAPrivateKey, Base64.NO_WRAP);
        Log.i("body", "RSA私钥签名编码->" + signByRSAKey + "\n编码长度->" + signByRSAKey.length());
        int verifySign = jni.verifyByRSAPubKey(TEST_PUBLIC_KEY.getBytes(), TEST_DATA.getBytes(), signByRSAPrivateKey);
        Log.i("body", "RSA公钥验证签名-> " + verifySign);

    }

    private void initEvent() {

    }
}