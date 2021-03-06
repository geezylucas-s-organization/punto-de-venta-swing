/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.sells;

import com.mycompany.mavenproject1.apiclient.ClassBase;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author User
 */
public interface SalesService {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("api/sell")
    Call<ResponseBody> saleProducts(@Body SaleRequest saleRequest, @Header("Authorization") String authHeader);

    @GET("api/sell/movements")
    Call<ClassBase<MovementsResponse>> movementsWithQuantity(@Header("Authorization") String authHeader);

    @GET("api/sell/returns")
    Call<List<ReturnsResponse>> returnsToday(@Header("Authorization") String authHeader);

    @GET("api/sell/returns/{id}")
    Call<List<DetailReturnResponse>> detailsReturn(@Path("id") int sellId, @Header("Authorization") String authHeader);
}
