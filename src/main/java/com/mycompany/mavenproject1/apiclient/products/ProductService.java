/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.products;

import com.mycompany.mavenproject1.apiclient.ClassBase;
import com.mycompany.mavenproject1.apiclient.sells.ProductsSaleRequest;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 *
 * @author geezylucas
 */
public interface ProductService {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("api/fillcatalogs/products")
    Call<ResponseBody> addProduct(@Body AddProductRequest product, @Header("Authorization") String authHeader);

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @PUT("api/fillcatalogs/products/{id}")
    Call<ResponseBody> editProduct(@Path("id") Integer id, @Body AddProductRequest product, @Header("Authorization") String authHeader);

    @DELETE("api/fillcatalogs/products/{id}")
    Call<ResponseBody> deleteProduct(@Path("id") Integer id, @Header("Authorization") String authHeader);

    @GET("api/fillcatalogs/products")
    Call<ClassBase<ProductsResponse>> getProducts(@Header("Authorization") String authHeader);

    @GET("api/restock/productbybarcode/{barcode}")
    Call<ProductsResponse> getProductByBarcodeWithQuantity(@Path("barcode") String barcode, @Header("Authorization") String authHeader);

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("api/restock")
    Call<ResponseBody> addStock(@Body AddStockRequest addStock, @Header("Authorization") String authHeader);

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("api/restock/removestock")
    Call<ResponseBody> removeStock(@Body ProductsSaleRequest productSaleRequest, @Header("Authorization") String authHeader);
}
