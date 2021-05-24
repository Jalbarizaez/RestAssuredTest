package com.albarizaez;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class comidaTest  {

    public static String url = "https://iloptckdce.execute-api.us-east-2.amazonaws.com/PruebaApi/?number=2";
    private static Gson gson = new Gson();

    @Test
    public void getComida(){
        String response = RestAssured.given().when().get(url).asString();
        Comida comida = gson.fromJson(response,Comida.class);
        System.out.println(comida.getComida());
        int id = comida.getId();
        System.out.println(comida.getDescripcion());
        System.out.println(comida.getId());
        System.out.println(comida.getPrecio());
        Assert.assertEquals(id,2);
    }
}
