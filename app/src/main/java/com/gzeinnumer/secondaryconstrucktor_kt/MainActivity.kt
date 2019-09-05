package com.gzeinnumer.secondaryconstrucktor_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// extend == :
// implement == ,
class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1 = Authlog("Password")
    }

}

open class Log{
    var data: String = ""
    var numberOfData = 0
    constructor(data: String){
        //code
    }

    constructor(data1: String, data2: Int){
        //code
        data = data1
        numberOfData = data2

        println("$data : $numberOfData X")
    }
}

open class Authlog: Log{
    constructor(data:String): super("dari AuthLog -> " + data){

    }

    constructor(data1: String, data2: Int): super(data1,data2){
        //code
    }
}