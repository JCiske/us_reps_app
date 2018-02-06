package com.jeremyciske.rainassignment.model

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.jeremyciske.rainassignment.R
import com.jeremyciske.rainassignment.adapter.RepsAndSensAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun sendRequest(searchType: Call<ResultList>, view: View) {

    /*Call the method with parameter in the interface to get the rep data*/
    val theCall: Call<ResultList> = searchType

    theCall.enqueue(object : Callback<ResultList> {
        override fun onResponse(call: Call<ResultList>, response: Response<ResultList>) {
            generateRepList(response.body().getRepsAndSensList()!!, view)
        }

        override fun onFailure(call: Call<ResultList>, t: Throwable) {
            Toast.makeText(view.context, "Error: ${t.printStackTrace()}", Toast.LENGTH_SHORT).show()
        }
    })
}

/*Method to generate List of reps and sens using RecyclerView with custom adapter*/
private fun generateRepList(repDataList: ArrayList<RepsAndSens>, view: View) {

    val adapter = RepsAndSensAdapter(repDataList)
    val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view_rep_list)
    val layoutManager = LinearLayoutManager(view.context)

    recyclerView.layoutManager = layoutManager
    recyclerView.adapter = adapter
}