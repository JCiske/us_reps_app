package com.jeremyciske.rainassignment.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Jeremy Ciske on 1/28/2018.
 * Used to access the results Object to access the list of Reps and sens
 */
open class ResultList {
    @SerializedName("results")
    private var results: ArrayList<RepsAndSens>?=null

    open fun getRepsAndSensList(): ArrayList<RepsAndSens>? {
        return results
    }
}