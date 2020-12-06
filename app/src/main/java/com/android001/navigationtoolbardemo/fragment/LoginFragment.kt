package com.android001.navigationtoolbardemo.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.android001.navigationtoolbardemo.R
import com.android001.navigationtoolbardemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment: BaseFragment() {


    override fun getLayoutResId(): Int {
        return R.layout.fragment_login
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toRegisterPage.setOnClickListener {
            findNavController().navigate(R.id.to_register_fragment)
        }

        rootView.toForgetPage.setOnClickListener {
            findNavController().navigate(R.id.to_forget_fragment)
        }
    }
}