package com.sibela.sharedelementtransition

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater

class ImageFragment : Fragment(R.layout.fragment_image) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val animation = TransitionInflater.from(requireContext()).inflateTransition(
            android.R.transition.move
        )
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
    }

}