package Settings;

import javax.swing.*;
import java.util.ArrayList;

public class Address {


    private static ArrayList<String> cityList = new ArrayList<>();

    public void SetCity() {

        cityList.add("New York");
        cityList.add("New Jersey");
        cityList.add("Ohio");
        cityList.add("Pennsylvania");
        cityList.add("Washington");
        cityList.add("Atlanta");


    }

    /*
        Create three private  String variables
        Address1
        City
        ZipCode
     */


    /*
        Üç tane  private  String variables oluştur
        Address1
        City
        ZipCode
     */

    private String Address1;
    private String City;
    private String ZipCode;




    /*
    Create a method name is Address1
    Return type is String
    Parameter is String(myAddress)

    private Address1 equal to myAddress
     */


     /*
    Address1  methodunu oluştur
    Return türü String
    Parameter  String(myAddress) olmalı

    private Address1 eşittir myAddress
     */


   public String Address1(String myAddress) {
        Address1 = myAddress;

        return Address1 ;

    }







    /*
        Create a method name is City
        return type is String
        parameter is String(myCity)

        if cityList does NOT contains myCity
        return We are not able to ship to your location

        if the first condition is false
        private City equal to myCity
     */

     /*
         City methodunu olustur
        return türü String
        parameter  String(myCity) olmalı

        if cityList  myCity  içermiyorsa
         We are not able to ship to your location  return et

        Eger ilk condition false ise
        private City  myCity ye eşittir
     */


   public String City(String myCity) {
        if (!cityList.contains(myCity))
            return "We are not able to ship to your location";
        else City = myCity;
        return City;

    }



    /*
        Create a method name is Zipcode
        Return type is String
        Parameter is String(myZipcode)

        if myZipcode length is NOT 5
        return Zip code length should be 5

        If the first condition is false
        private ZipCode equal to myZipcode

     */

    /*
       ZipCode methodunu oluşturun
       Return türü String
       Parameter  String(myZipcode) olmalı

       if myZipcode length 5 e eşit değilse
       Zip code length should be 5  return et

        Eger ilk condition false ise
        private ZipCode  myZipcode ye eşittir


    */

    public String ZipCode(String myZipcode){
        if (myZipcode.length()!=5)
            return "Zip code length should be 5";
        else ZipCode=myZipcode;
        return ZipCode;

    }


}
