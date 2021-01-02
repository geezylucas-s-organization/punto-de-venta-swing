/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.products;

import java.util.List;
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
public interface ProductService {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("api/fillcatalogs/products")
    Call<ResponseBody> addProduct(@Body AddProductRequest product, @Header("Authorization") String authHeader);

    @GET("api/fillcatalogs/products")
    Call<List<ProductsResponse>> getProducts(@Header("Authorization") String authHeader);
}
