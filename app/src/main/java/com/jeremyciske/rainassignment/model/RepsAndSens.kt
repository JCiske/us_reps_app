package com.jeremyciske.rainassignment.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Jeremy Ciske on 1/27/2018.
 * Data we want to extract from the whoisyourrepresentative api
 */
open class RepsAndSens {

    @SerializedName("name")
    val name: String? = null

    @SerializedName("party")
    val party: String? = null

    @SerializedName("state")
    val state: String? = null

    @SerializedName("phone")
    val phone: String? = null

    @SerializedName("office")
    val office: String? = null

    @SerializedName("link")
    val link: String? = null
}