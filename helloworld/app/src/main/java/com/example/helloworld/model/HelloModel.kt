package com.example.helloworld.model

import com.example.helloworld.contract.HelloContract

/**
 * Get all data from Database, SQL or any other medium from this class
 */
class HelloModel : HelloContract.Model {

    override fun getData(): String = "Hello World"
}