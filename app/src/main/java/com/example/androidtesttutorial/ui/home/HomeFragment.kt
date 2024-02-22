package com.example.androidtesttutorial.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.androidtesttutorial.R
import com.example.androidtesttutorial.databinding.FragmentHomeBinding
import com.example.androidtesttutorial.utils.getPureText
import com.example.androidtesttutorial.utils.pretty

class HomeFragment : Fragment() {
    @Suppress("ktlint:standard:property-naming")
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        viewModel.result.observe(viewLifecycleOwner) {
            binding.resultTV.text = it.pretty()
        }
        return root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.calculateBtn.setOnClickListener {
            operate(binding.firstET.getPureText(), binding.secondET.getPureText())
        }
    }

    private fun operate(
        text1: String,
        text2: String,
    ) {
        if (viewModel.isValid(text1, text2)) {
            viewModel.calculate(text1.toDouble(), text2.toDouble())
        } else {
            binding.resultTV.text = getString(R.string.invalid_input)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
