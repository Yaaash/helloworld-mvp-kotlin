package com.example.helloworld.presenter

import com.example.helloworld.contract.HelloContract
import com.example.helloworld.model.HelloModel

class HelloPresenter(private val view: HelloContract.View) : HelloContract.Presenter {

    private var model: HelloModel

    init {
        // initialise everything here
        view.initView()
        model = HelloModel()
    }

    override fun onClick() {
        this.view.setView(model.getData())
    }
}