package com.example.tobis;

public class ObjectFactory {

    public PaymentService paymentSerivce(){
        return new PaymentService(exRateProvider());
    }

    public ExRateProvider exRateProvider(){
        return new WebApiExRateProvider();
    }
}
