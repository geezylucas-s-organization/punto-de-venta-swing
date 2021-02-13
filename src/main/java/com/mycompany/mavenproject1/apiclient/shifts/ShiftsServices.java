/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.shifts;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

/**
 *
 * @author geezylucas
 */
public interface ShiftsServices {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @PUT("api/shifts")
    Call<ResponseBody> closeShift(@Body CloseShiftRequest closeShiftRequest, @Header("Authorization") String authHeader);

}
