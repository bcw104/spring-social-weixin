package org.springframework.social.weixin.api;

import org.springframework.social.ApiBinding;

/**
 * Created by zhiwen on 2016/11/28.
 */
public interface WeiXin extends ApiBinding {

    ProfileOperations profileOperations();
}
