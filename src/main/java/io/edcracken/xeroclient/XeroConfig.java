package io.edcracken.xeroclient;

import com.xero.api.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class XeroConfig implements Config {


    @Value("${xero.AppType:Public}")
    private String appType;
    @Value("${xero.UserAgent:Xero-Java-SDK-Default}")
    private String UserAgent;
    @Value("${xero.ConsumerKey}")
    private String consumerKey;
    @Value("${xero.ConsumerSecret}")
    private String consumerSecret;
    @Value("${xero.PathToPrivateKey}")
    private String pathToPrivateKey;
    @Value("${xero.PrivateKeyPassword}")
    private String privateKeyPassword;
    private String accept = "application/xml";
    private String apiUrl = "https://api.xero.com/api.xro/2.0/";
    private String requestTokenUrl = "https://api.xero.com/oauth/RequestToken";
    private String authenticateUrl = "https://api.xero.com/oauth/Authorize";
    private String accessTokenUrl = "https://api.xero.com/oauth/AccessToken";

    @Override
    public String getPathToPrivateKey() {
        return pathToPrivateKey;
    }

    @Override
    public String getAppType() {
        return appType;
    }

    @Override
    public void setAppType(String appType) {
        this.appType = appType;
    }

    @Override
    public String getUserAgent() {
        return UserAgent;
    }


    @Override
    public String getConsumerKey() {
        return consumerKey;
    }

    @Override
    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    @Override
    public String getConsumerSecret() {
        return consumerSecret;
    }

    @Override
    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }


    @Override
    public String getPrivateKeyPassword() {
        return privateKeyPassword;
    }

    @Override
    public String getAccept() {
        return accept;
    }

    @Override
    public String getApiUrl() {
        return apiUrl;
    }

    @Override
    public String getRequestTokenUrl() {
        return requestTokenUrl;
    }

    @Override
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    @Override
    public String getFilesUrl() {
        return null;
    }

    @Override
    public String getAuthorizeUrl() {
        return null;
    }

    @Override
    public String getRedirectUri() {
        return null;
    }

    @Override
    public String getProxyHost() {
        return null;
    }

    @Override
    public long getProxyPort() {
        return 0;
    }

    @Override
    public boolean getProxyHttpsEnabled() {
        return false;
    }

    @Override
    public int getConnectTimeout() {
        return 0;
    }

    @Override
    public void setConnectTimeout(int connectTimeout) {
    }

    @Override
    public int getReadTimeout() {
        return 0;
    }

    @Override
    public void setReadTimeout(int readTimeout) {

    }

    @Override
    public String getDecimalPlaces() {
        return null;
    }

    @Override
    public void setDecimalPlaces(String decimalPlaces) {

    }

    @Override
    public void setAuthCallBackUrl(String authCallbackUrl) {

    }

}
