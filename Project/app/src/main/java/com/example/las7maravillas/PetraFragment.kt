package com.example.las7maravillas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.las7maravillas.databinding.FragmentMachupicchuBinding
import com.example.las7maravillas.databinding.FragmentPetraBinding

class PetraFragment : Fragment() {


    private var _binding: FragmentPetraBinding? = null
    private val binding: FragmentPetraBinding
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
        _binding = FragmentPetraBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.vista.setOnClickListener {
            view.findNavController().navigate(R.id.action_petraFragment_to_petra_img_Fragment)
        }

        return view
    }


}