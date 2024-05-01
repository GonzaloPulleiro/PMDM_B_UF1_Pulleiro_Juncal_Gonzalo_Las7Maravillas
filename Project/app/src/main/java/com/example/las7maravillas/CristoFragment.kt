package com.example.las7maravillas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.las7maravillas.databinding.FragmentCristoBinding
import com.example.las7maravillas.databinding.FragmentMachupicchuBinding

class CristoFragment : Fragment() {

    private var _binding: FragmentCristoBinding? = null
    private val binding: FragmentCristoBinding
        get() = _binding!!

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCristoBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.vista.setOnClickListener {
             view.findNavController().navigate(R.id.action_cristoFragment_to_cristo_img_Fragment)
         }

         return view
    }


}