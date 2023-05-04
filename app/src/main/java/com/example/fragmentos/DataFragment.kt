package com.example.fragmentos


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class DataFragment : Fragment() {// se hereda de clase Fragment

    private lateinit var txtInfo :EditText
    private lateinit var btnEnviar :Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_data, container, false);
        txtInfo = view.findViewById(R.id.txtInfo)
        btnEnviar = view.findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener(object  :View.OnClickListener{
            override fun onClick(view: View?) {
                TODO("Not yet implemented")
            }

        })
        return view
    }

}