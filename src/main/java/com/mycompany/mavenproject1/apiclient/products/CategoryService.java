/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.products;

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
 * @author geezylucas
 */
public interface CategoryService {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("/api/fillcatalogs/categories")
    Call<ResponseBody> addCategory(@Body AddCategoryRequest category, @Header("Authorization") String authHeader);

    @GET("/api/fillcatalogs/categories")
    Call<ClassBase<CategoriesResponse>> allCategories(@Header("Authorization") String authHeader);
}
