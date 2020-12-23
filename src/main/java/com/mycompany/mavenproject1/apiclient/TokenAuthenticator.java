/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient;

import com.mycompany.mavenproject1.apiclient.auth.AuthResponse;
import com.mycompany.mavenproject1.sqlite.SQLiteJDBC;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Route;
import retrofit2.Call;

/**
 *
 * @author geezylucas
 */
public class TokenAuthenticator implements Authenticator {

    @Override
    public Request authenticate(Route route, okhttp3.Response rspns) throws IOException {
        // Refresh your access_token using a synchronous api request
        String newAccessToken = refreshToken();
        // Add new header to rejected request and retry it
        return rspns.request().newBuilder()
                .header("Authorization", "Bearer " + newAccessToken)
                .build();
    }

    private String refreshToken() throws IOException {
        SQLiteJDBC sqlite = new SQLiteJDBC();
        String token = sqlite.getToken();
        // Refresh your access_token using a synchronous api request
        Call<AuthResponse> newAccessTokenResponseCall = ApiClient.getAuthService().refreshToken("Bearer " + token, true);
        AuthResponse authResponse = newAccessTokenResponseCall.execute().body();
        if (authResponse != null) {
            sqlite.updateToken(authResponse.getToken());
            return authResponse.getToken();
        }
        return null;
    }
}
