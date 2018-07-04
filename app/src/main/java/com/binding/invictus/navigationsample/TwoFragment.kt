package com.binding.invictus.navigationsample


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.binding.invictus.navigationsample.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {

    lateinit var binding: FragmentTwoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_two, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val amount: Int = TwoFragmentArgs.fromBundle(arguments).amount
        binding.tvHello.text = amount.toString()
    }

}
