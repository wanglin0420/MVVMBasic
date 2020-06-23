package com.matthew.basiclib.x

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider

/**
 *Author:wangling
 *Date:2020/6/23 10:04 AM
 */
abstract class XActivity<T : ViewDataBinding, VM : XViewModel> : FragmentActivity(), V<VM> {
    lateinit var viewModel: VM
    lateinit var binding: T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getContentView())
        viewModel = ViewModelProvider(this).get(getViewModelClass())
        //关联ViewModel
        binding.setVariable(initVariableId(), viewModel)
    }


}