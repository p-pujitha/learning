/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.springsecuritykeycloak.Utils;

//import com.imimobile.profileManager.config.SecurityConfig;
import com.pujitha.springsecuritykeycloak.config.KeyCloakResolver;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.rotation.AdapterTokenVerifier;
import org.keycloak.common.VerificationException;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 *
 * @author ppujita5
 */
@Component
public class HelperUtil {
    
    @Autowired
    KeyCloakResolver keyCloakResolver;
    
    public  AccessToken getIdFromAccessToken (String accesstoken){
         try {
             KeycloakDeployment deployment = keyCloakResolver.KeycloakConfigResolver().resolve(null);
            AccessToken token = HelperUtil.verifyAccessToken(accesstoken, deployment);
            System.out.println("Token --- >" + token);
            System.out.println("Token ID --- >" + token.getId());
            return token;
        } catch (Exception ex) {
            ex.printStackTrace();

        }
         return null;
    }

    public static AccessToken verifyAccessToken(String token, KeycloakDeployment deployment) throws VerificationException {

        AccessToken accessToken = AdapterTokenVerifier.verifyToken(token, deployment);
        if(accessToken != null)
            return accessToken;
        else
            return null;
    }
}
