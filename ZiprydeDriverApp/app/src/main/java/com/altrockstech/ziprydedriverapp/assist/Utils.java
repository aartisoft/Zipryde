package com.altrockstech.ziprydedriverapp.assist;

import com.altrockstech.ziprydedriverapp.modelget.ListOfPercentage;
import com.altrockstech.ziprydedriverapp.modelget.SingleInstantResponse;
import com.google.android.gms.maps.model.LatLng;

import java.util.LinkedList;

/**
 * Created by Hari on 08-06-2017.
 */

public class Utils {

    public static final int REQUEST_GET_PLACES_DETAILS = 101;

    public static LatLng location;

    public static boolean fromSplash = true;

    public static SingleInstantResponse getOTPByMobileInstantResponse;
    public static SingleInstantResponse verifyOTPByMobileInstantResponse;
    public static SingleInstantResponse saveUserMobileInstantResponse;
    public static SingleInstantResponse verifyLogInUserMobileInstantResponse;
    public static LinkedList<ListOfPercentage> getAllNYOPListInstantResponse;

    public static LatLng startingLatLan;
    public static String startingPlaceAddress = "";
    public static LatLng endingLatLan;
    public static String endingPlaceAddress = "";
    public static LatLng backchkendingLatLan;
    public static String backchkendingPlaceAddress = "";

    public static String parsedDistance = "";
}
