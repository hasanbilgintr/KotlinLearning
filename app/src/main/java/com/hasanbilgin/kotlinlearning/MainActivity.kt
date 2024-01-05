package com.hasanbilgin.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //javadaki  System.out.println(); eşdeğerdir
        //sout diyede çıkar
        println("hello kotlin")
        println("******************integer*************")
        println(4 * 5)

        //Variables(değişkenler) & Constans(sabitler)
        //Variables
        var x = 4
        var y = 5

        println(x * y)
        var age = 35
        println(age / 7 * 5)

        //javadaki final diyebiliriz
        //Constans
        val name = "hasan"

        //defining(tanımlamak)
        val myInteger: Int


        //yukarda Int atadığımız için sadece sayı atanabilir
        //myInteger="sdf"
        //Initialize(başlatmak,ilk değerini atamak)
        myInteger = 50

        val a: Int = 5

        //kotlin resmi sitesi kotlinlang.org

        //long

        var myLong: Long = -5//vs..

        println("***************double &float***************")
        //double &float
        val pi = 3.14;
        println("pi" + pi * 2);// pi6.28
        val myFloat = 3.14f;
        println("myFloat" + myFloat * 2);//myFloat6.28
        var myAge: Double
        myAge = 30.0;
        println("myAge" + myAge / 2)// myAge15.0

        //değişken yazım şekillleri
        //camleCase //genelde kullanılır //layout hariç
        //snake_case

        println("***************string***************")

        val name2: String = "hasan"
        println(name2.capitalize())//illk harfini büyülten metot
        println(name2)//ama name2 hala hasan

        println("***************boolean***************")
        var myBoolean: Boolean = true


        println("***************conversion***************")

        var myNumber = 5;
        var myLongNumber = myNumber.toLong()
        println(myLongNumber) //longtur

        var input = "10"
        println(input.toInt() * 2)//20

        println("***************Collection***************")
        println("***************array***************")

        //normal dizi
        var myArray = arrayOf("hasan", "esra", "mustafa", "nisa")
        println(myArray[0])//hasan
        myArray[0] = "HasanB"
        println(myArray[0])//HasanB

        println(myArray.size)//4
        myArray.get(1)//esra
        myArray.set(2, "mustafaB")//
        println(myArray[2])//mustafaB

//        myArray[4]="kamil"
//        println(myArray[4])//yazdırmaz ilk başta belirttiğimiz için / hatta hata verir  ondna dolayı list kullanırız

        val numberArray = arrayOf(1, 2, 3, 4, 5)
        println(numberArray[3])//4
//        println(numberArray[5])// sonuç vermez hatta hata verir

        val myNewArray = doubleArrayOf(1.0, 2.0, 5.0)

        val mixedArray = arrayOf("atıl", 5)
        println(mixedArray[0])//atıl
        println(mixedArray[1])//5

        println("*************** List - ArrayList ***************")

        val myMusician = arrayListOf<String>("murat", "filiz", "amina")
        println(myMusician[0])//murat
        //eklemek
        myMusician.add("lale");
        println(myMusician[3])//lale

        myMusician.add(0, "selim")
        println(myMusician[0])//selim


        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        //ArrayList kotlin collection küütüpahnes
        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("atil")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)
        myMixedArrayList.add(1)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])
        println(myMixedArrayList[3])

        println("*************** Set / HashSet***************")
        //setlerin içinde aynı değer bulunmaz yada işlem görmez

        val myExampleArray = arrayOf(1, 1, 2, 3, 5)

        println("eleman 1: ${myExampleArray[0]}")//eleman 1: 1
        println("eleman 2: ${myExampleArray[1]}")//eleman 2: 1


        val mySet = setOf<Int>(1, 1, 2, 3, 5)
        println(mySet.size)//4

        //ForEach
        mySet.forEach { println(it) }
        //1
        //2
        //3
        //5 veir

        //setin setOf dizi gibi  //HashSet<String>() ise list yada arraylist gibi
        val myStringSet = HashSet<String>()
        myStringSet.add("atil")
        myStringSet.add("samancioglu")
        myStringSet.add("atil")
        println(myStringSet.size)//2

        println("*************** Map / HashMap***************")
        //key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100, 150)
        println("${fruitArray[0]} : ${caloriesArray[0]}")//Apple : 100

        // map kullancaz

        //<k , v> olanı kullanıcaz
        //en fazla 2 değişken fazla olamaz (Int,Boolean,String...)
        val fruitCalorieMap = hashMapOf<String, Int>()
        fruitCalorieMap.put("Apple", 100)
        fruitCalorieMap.put("Banana", 150)
        println(fruitCalorieMap["Apple"])//100

        val myNewMap = HashMap<String, String>()
        myNewMap.put("şifre", "12345")

        val myHashMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)

        myHashMap.put("D", 4)
        println(myHashMap["D"])//4


        println("***************Operatör***************")

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)
        var n = 7
        println(n > m)

        println(n > m && 1 > 2)
        println(n > m || 1 > 2)

        //Remainder
        println(10 % 4)

        println("***************if control***************")

        val myNumberAge = 52
        if (myNumberAge < 30) {
            println("< 30")
        } else if (myNumberAge >= 30 && myNumberAge < 40) {
            println("30 - 40")
        } else if (myNumberAge >= 40 && myNumberAge < 50) {
            println("40 - 50")
        } else {
            println(">=50")
        }

        //Switch - When
        println("------- Switch - when----------")
        val day = 3
        var dayString = ""
        /*
        if (day == 1) {
            dayString = "Monday"
        } else if (day == 2) {
            dayString = "Tuesday"
        } else if (day == 3) {
            dayString = "Wednesday"
        }
        println(dayString)
        */

        when (day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)

        //Loops
        //For Loop

        val myArrayofNumbers = arrayOf(12, 15, 18, 21, 24, 27, 30, 33)
        val q = myArrayofNumbers[0] / 35
        println(q)
        for (num in myArrayofNumbers) {
            val z = num / 3 * 5
            println(z)
        }
        //aynı
        for (i in myArrayofNumbers.indices) {
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }
        for (b in 0..9) {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Samancioglu")
        myStringArrayList.add("Bar")
        for (str in myStringArrayList) {
            println(str)
        }
        myStringArrayList.forEach { println(it) }

        var j = 0
        while (j < 10) {
            println(j)
            j = j + 1
        }

    }
}