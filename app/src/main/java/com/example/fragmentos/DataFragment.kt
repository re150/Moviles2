package com.example.fragmentos


import android.content.Context
import android.os.Bundle
import android.os.ProxyFileDescriptorCallback
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class DataFragment : Fragment() {// se hereda de clase Fragment

    private lateinit var txtInfo :EditText
    private lateinit var btnEnviar :Button
    private  lateinit var callback: DataListener

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

            }

        })
        return view
    }

    interface  DataListener{
        fun enviarinfo(info: String)
    }

    override  fun onAttach(context : Context){
        super.onAttacH(context)
        callback = try {
            context as DataListener
        }catch (ex : Exception){
           throw  java.lang.ClassCastException(context.toString())
                    + "se debe implementar la interfaz DataListener"
        }
    }
}