package com.example.fragmentlearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class VerifyDetailsFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_verify_details, container, false)
//        val name = arguments?.getString("name")
//        val mobile = arguments?.getLong("mobile")
        val args: VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobile = args.mobile
       val textName = rootView.findViewById<TextView>(R.id.tv_name)
        textName.setText(name)
        val textMobile = rootView.findViewById<TextView>(R.id.tv_mobile_number)
        textMobile.setText(mobile.toString())
        return rootView
    }


}