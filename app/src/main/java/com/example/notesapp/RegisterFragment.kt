package com.example.notesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.notesapp.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private var _binding : FragmentRegisterBinding ?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(layoutInflater , container , false )

        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_mainFragment)
        }

        binding.btnLogin.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}