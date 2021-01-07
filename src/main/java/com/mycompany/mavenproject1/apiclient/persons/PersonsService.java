/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.persons;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 *
 * @author User
 */
public interface PersonsService {

    @GET("api/fillcatalogs/clients")
    Call<List<PersonsResponse>> getClients(@Header("Authorization") String authHeader);
}
