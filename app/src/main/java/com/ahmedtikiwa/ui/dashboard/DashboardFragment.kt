package com.ahmedtikiwa.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ahmedtikiwa.liam.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var binding : FragmentDashboardBinding

    private val viewModel : DashboardViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDashboardBinding.inflate(inflater)

        binding.lifecycleOwner = viewLifecycleOwner

        binding.viewModel = viewModel

        return binding.root
    }
}