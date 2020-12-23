package com.mycompany.mavenproject1.apiclient.auth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author geezylucas
 */
public interface AuthService {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("/api/user/authenticate")
    Call<AuthResponse> login(@Body AuthRequest authRequest);

    @GET("/api/user/refreshtoken")
    Call<AuthResponse> refreshToken(@Header("Authorization") String authHeader, @Header("isRefreshToken") boolean isRefreshToken);
}
