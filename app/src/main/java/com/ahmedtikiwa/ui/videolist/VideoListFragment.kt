package com.ahmedtikiwa.ui.videolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ahmedtikiwa.liam.databinding.FragmentVideoListBinding

class VideoListFragment : Fragment() {

    private lateinit var binding: FragmentVideoListBinding

    private val viewModel: VideoListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentVideoListBinding.inflate(inflater)

        binding.lifecycleOwner = viewLifecycleOwner

        binding.viewModel = viewModel

        return binding.root
    }
}