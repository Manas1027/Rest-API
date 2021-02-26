package com.example.rest_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.restapi.NetworkHelper
import com.example.restapi.NetworkListener
import com.example.restapi.SchoolClassAdapter
import com.example.rest_api.model.SchoolClass
import com.example.restapi.retrofit.ApiClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NetworkListener {

    private val adapter = SchoolClassAdapter()
    lateinit var networkHelper: NetworkHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList.adapter = adapter
        mList.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        networkHelper = NetworkHelper(ApiClient.getClient())
        setData()
    }

    private fun setData(){
        networkHelper.getClasses(this)
    }

    override fun onSchollClassesResponse(models: List<SchoolClass>?) {
        adapter.models = models?
    }

    override fun onSchollClassesFailure(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}