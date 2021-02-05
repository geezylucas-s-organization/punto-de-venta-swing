/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.persons;

import com.mycompany.mavenproject1.apiclient.ClassBase;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 *
 * @author User
 */
public interface PersonsService {

    @GET("api/fillcatalogs/clients")
    Call<ClassBase<PersonsResponse>> getClients(@Header("Authorization") String authHeader);
    
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("api/fillcatalogs/persons")
    Call<ResponseBody> addClient(@Body PersonsResponse newClient, @Header("Authorization") String authHeader);
}
