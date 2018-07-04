package com.binding.invictus.navigationsample

import android.content.Context
import android.databinding.DataBindingUtil
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.binding.invictus.navigationsample.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    lateinit var binding: FragmentOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.nextFragment.setOnClickListener{
            val action = OneFragmentDirections.action_one_to_two()
            action.setAmount(10)
            it.findNavController().navigate(action)
        }
    }

}
