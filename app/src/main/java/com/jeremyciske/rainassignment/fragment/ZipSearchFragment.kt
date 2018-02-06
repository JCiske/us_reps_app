package com.jeremyciske.rainassignment.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.jeremyciske.rainassignment.R
import com.jeremyciske.rainassignment.model.ResultList
import com.jeremyciske.rainassignment.model.sendRequest
import com.jeremyciske.rainassignment.network.RepsAndSensService
import com.jeremyciske.rainassignment.network.RetrofitInstance
import retrofit2.Call

class ZipSearchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val fragment = inflater.inflate(R.layout.fragment_zip_search, container, false)

        val etZipSearch = fragment.findViewById<EditText>(R.id.et_zip)
        val subBtn = fragment.findViewById<Button>(R.id.submit_btn)

        subBtn.setOnClickListener {
            // Hide the keyboard from the user after clicking submit.
            fragment.hideKeyboard()

            // Get the data from the input field
            val zipText: String = etZipSearch.text.toString()

            if ( zipText.isNotEmpty() ) {

                /*Create handle for the RetrofitInstance interface*/
                val service = RetrofitInstance.getRetrofitInstance().create(RepsAndSensService::class.java)

                // Type of search we want
                // In this case we are looking for zip code
                val zipSearch: Call<ResultList> = service.getRepZip(zipText)

                // Send the request to retrieve requested information
                sendRequest(zipSearch, fragment)

            } else {
                Toast.makeText(this.context, "Please enter a valid zip code", Toast.LENGTH_SHORT).show()
            }
        }
        return fragment
    }

    private fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}
