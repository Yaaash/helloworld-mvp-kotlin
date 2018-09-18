package com.example.helloworld.contract

interface HelloContract {

    /**
     * in this project we call Model - View - Presenter, View as View
     * where as default views of Android are called AndroidView
     */
    interface View {

        fun initView()

        fun setView(data: String)
    }

    interface Model {

        fun getData(): String

    }

    interface Presenter {

        fun onClick()
    }
}