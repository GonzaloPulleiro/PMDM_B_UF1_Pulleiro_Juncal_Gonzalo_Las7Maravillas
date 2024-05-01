package com.example.las7maravillas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.las7maravillas.databinding.FragmentInicioBinding
import com.example.las7maravillas.databinding.FragmentMachupicchuBinding

class MachuPicchuFragment : Fragment() {

    private var _binding: FragmentMachupicchuBinding? = null
    private val binding: FragmentMachupicchuBinding
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
       _binding = FragmentMachupicchuBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.vista.setOnClickListener {
            view.findNavController().navigate(R.id.action_machuPicchuFragment_to_mp_img_Fragment)
        }

        return view
    }

}