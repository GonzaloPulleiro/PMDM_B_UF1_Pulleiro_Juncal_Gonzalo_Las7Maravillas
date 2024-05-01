package com.example.las7maravillas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController
import com.example.las7maravillas.databinding.FragmentInicioBinding


class InicioFragment : Fragment() {
    private var _binding:FragmentInicioBinding? = null
    private val binding: FragmentInicioBinding
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
        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.b1.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_machuPicchuFragment)
        }
        binding.b2.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_chichenFragment)
        }
        binding.b3.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_coliseoFragment)
        }
        binding.b4.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_tajFragment)
        }
        binding.b5.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_petraFragment)
        }
        binding.b6.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_murallaFragment)
        }
        binding.b7.setOnClickListener {
            view.findNavController().navigate(R.id.action_inicioFragment_to_cristoFragment)
        }



        return view
    }


}
