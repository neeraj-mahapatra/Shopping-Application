package com.example.shoppingapplication.trackOrder.view

/**
 * This is the product tracking fragment.
 * @author Neeraj Mahapatra
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppingapplication.databinding.FragmentTrackOrderBinding

class TrackOrderFragment : Fragment() {
    private var _binding: FragmentTrackOrderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentTrackOrderBinding.inflate(inflater, container, false)
        return binding.root
    }

}