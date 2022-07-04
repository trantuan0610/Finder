package com.tuantran.finder.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.tuantran.finder.R
import com.tuantran.finder.databinding.FragmentHomeBinding
import com.tuantran.finder.databinding.FragmentProfileBinding
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment : Fragment() {
    private var binding : FragmentProfileBinding ? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding?.root
}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.imgSettings?.setOnClickListener{
            Toast.makeText(context,"abc",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_profileFragment_to_settingsFragment)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }



    }
