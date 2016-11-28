package org.springframework.social.weixin.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.weixin.api.WeiXin;

/**
 * Created by zhiwen on 2016/11/28.
 */
public class WeiXinConnectionFactory extends OAuth2ConnectionFactory<WeiXin> {

    public WeiXinConnectionFactory(String consumerKey, String consumerSecret) {
        super("weixin", new WeiXinServiceProvider(consumerKey, consumerSecret), new WeiXinAdapter());
    }
}
