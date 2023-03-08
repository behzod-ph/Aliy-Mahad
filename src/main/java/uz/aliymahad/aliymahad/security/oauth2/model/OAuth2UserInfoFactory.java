package uz.aliymahad.aliymahad.security.oauth2.model;


import uz.aliymahad.aliymahad.enums.AuthProvider;
import uz.aliymahad.aliymahad.exception.OAuth2AuthenticationProcessingException;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        var provider = AuthProvider.valueOf(registrationId.toUpperCase());

        return switch (provider){
            case GOOGLE -> new GoogleOAuth2UserInfo(attributes);

            case FACEBOOK -> new FacebookOAuth2UserInfo(attributes);

            case GITHUB -> new GithubOAuth2UserInfo(attributes);

            default ->throw OAuth2AuthenticationProcessingException.notSupported(registrationId);
        };

    }
}
