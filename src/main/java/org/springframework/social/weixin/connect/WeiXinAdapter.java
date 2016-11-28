package org.springframework.social.weixin.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.weixin.api.WeiXin;
import org.springframework.social.weixin.api.WeiXinProfile;

/**
 * Created by zhiwen on 2016/11/28.
 */
public class WeiXinAdapter implements ApiAdapter<WeiXin>{

    public boolean test(WeiXin weiXin) {
        try {
            weiXin.profileOperations().getUserProfile();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void setConnectionValues(WeiXin weiXin, ConnectionValues values) {
        WeiXinProfile weiXinProfile = weiXin.profileOperations().getUserProfile();
        values.setProviderUserId(weiXinProfile.getOpenid());
        values.setDisplayName(weiXinProfile.getNickname());
        values.setProfileUrl(null);
        values.setImageUrl(weiXinProfile.getHeadimgurl());
    }

    public UserProfile fetchUserProfile(WeiXin weiXin) {
        WeiXinProfile profile = weiXin.profileOperations().getUserProfile();
        return new UserProfileBuilder()
                .setName(profile.getNickname())
                .build();
    }

    public void updateStatus(WeiXin weiXin, String message) {

    }
}
