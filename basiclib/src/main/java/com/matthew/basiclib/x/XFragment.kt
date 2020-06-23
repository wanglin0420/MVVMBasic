package com.matthew.basiclib.x

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


/**
 *Author:wangling
 *Date:2020/6/23 9:35 AM
 */
abstract class XFragment<T : ViewDataBinding, VM : XViewModel> : Fragment(), V<VM> {
    lateinit var viewModel: VM
    lateinit var binding: T
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, getContentView(), container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(getViewModelClass())
    }
}