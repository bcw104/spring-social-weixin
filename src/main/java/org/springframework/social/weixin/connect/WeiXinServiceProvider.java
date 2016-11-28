package org.springframework.social.weixin.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.weixin.api.WeiXin;

/**
 * Created by zhiwen on 2016/11/28.
 */
public class WeiXinServiceProvider extends AbstractOAuth2ServiceProvider<WeiXin> {

    public WeiXinServiceProvider(String clientId, String clientSecret) {
        super(getOAuth2Template(clientId, clientSecret));
    }

    private static OAuth2Template getOAuth2Template(String clientId, String clientSecret) {
        OAuth2Template oAuth2Template = new OAuth2Template(clientId, clientSecret,
                "https://open.weixin.qq.com/connect/qrconnect",
                "https://api.weixin.qq.com/sns/oauth2/access_token");
        oAuth2Template.setUseParametersForClientAuthentication(true);
        return oAuth2Template;
    }

    @Override
    public WeiXin getApi(String accessToken) {
        return null;
    }
}
