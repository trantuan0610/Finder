package com.tuantran.finder.fragment.Home

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.lorentzos.flingswipe.SwipeFlingAdapterView
import com.tuantran.finder.databinding.FragmentFinderBinding


class FinderFragment : Fragment() {

    private var i = 0
    private lateinit var binding : FragmentFinderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFinderBinding.inflate(layoutInflater)
     return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    }



