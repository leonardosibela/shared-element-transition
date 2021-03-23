package com.sibela.sharedelementtransition

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.sibela.sharedelementtransition.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        binding.image.setOnClickListener {
            val extras = FragmentNavigatorExtras(binding.image to "image_big")
            findNavController().navigate(
                R.id.action_mainFragment_to_imageFragment,
                null,
                null,
                extras
            )
        }
    }

}