package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RegidtrationModal
{
    @SerializedName("result1")
    @Expose

    private List<RegistrationResult> result1=null;

    public List<RegistrationResult>getResult1(){
        return result1;
    }
    public void setResult1(List<RegistrationResult> result1){
        this.result1=result1;
    }
}
