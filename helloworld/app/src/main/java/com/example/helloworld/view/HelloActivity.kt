package com.example.helloworld.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import com.example.helloworld.R
import com.example.helloworld.contract.HelloContract
import com.example.helloworld.presenter.HelloPresenter

class HelloActivity : AppCompatActivity(), HelloContract.View {

    private var presenter: HelloPresenter? = null
    private var helloTextView: TextView? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        // Now we make presenter the boss of everything
        presenter = HelloPresenter(this)
        // first step of presenter is to initialise all the view
    }

    override fun initView() {
        helloTextView = findViewById(R.id.helloTextView)
        button = findViewById(R.id.button)

        // now if button is clicked it will handled by presenter, as UI is not directly accessing data
        // presenter acts as a medium between the both
        button?.setOnClickListener { presenter?.onClick() }
    }

    override fun setView(data: String) {
        // Now when clicked on button, presenter onClick event is fired.
        // Where presenter gets data from model and set view of View is called to publish
        // that data here
        helloTextView?.text = data
    }
}
