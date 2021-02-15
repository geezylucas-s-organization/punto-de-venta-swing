/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient;

import com.mycompany.mavenproject1.apiclient.auth.AuthService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.mavenproject1.apiclient.persons.PersonsService;
import com.mycompany.mavenproject1.apiclient.products.CategoryService;
import com.mycompany.mavenproject1.apiclient.products.ProductService;
import com.mycompany.mavenproject1.apiclient.sells.SalesService;
import com.mycompany.mavenproject1.apiclient.shifts.ShiftsServices;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author geezylucas
 */
public class ApiClient {

    private static Retrofit getRetrofit() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssz")
                .create();

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .authenticator(new TokenAuthenticator())
                .build();

        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl("http://192.168.0.80:8080")
                .build();
    }

    public static AuthService getAuthService() {
        return getRetrofit().create(AuthService.class);
    }

    public static CategoryService getCategoryService() {
        return getRetrofit().create(CategoryService.class);
    }

    public static ProductService getProductService() {
        return getRetrofit().create(ProductService.class);
    }

    public static PersonsService getPersonsService() {
        return getRetrofit().create(PersonsService.class);
    }

    public static SalesService getSalesService() {
        return getRetrofit().create(SalesService.class);
    }

    public static ShiftsServices getShiftsService() {
        return getRetrofit().create(ShiftsServices.class);
    }
}
