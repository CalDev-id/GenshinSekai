package com.example.gensinsekai

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GachaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tabgacha)

        val rollbutton: Button = findViewById(R.id.tombolgacha) //mencari id button
        rollbutton.setOnClickListener { //sett button

            //execute
            rollDice()
        }

    }
    //Roll the dice and update the screen with the result.
    private fun rollDice() {
        //Create new
        val dice = Dice(25)
        val diceRoll = dice.roll()

        //cari gambar di layout
        val diceImage: ImageView = findViewById(R.id.gambargacha)
        //diceImage.setImageResource(R.drawable.dice_2) gw apus karna kan gacha

        //ganti gambar gacha tiap angka
        when(diceRoll){
            1 -> diceImage.setImageResource(R.drawable.s1)
            2 -> diceImage.setImageResource(R.drawable.s2)
            3 -> diceImage.setImageResource(R.drawable.s3)
            4 -> diceImage.setImageResource(R.drawable.s4)
            5 -> diceImage.setImageResource(R.drawable.s5)
            6 -> diceImage.setImageResource(R.drawable.s6)
            7 -> diceImage.setImageResource(R.drawable.s7)
            8 -> diceImage.setImageResource(R.drawable.s8)
            9 -> diceImage.setImageResource(R.drawable.s9)
            10 -> diceImage.setImageResource(R.drawable.s10)
            11 -> diceImage.setImageResource(R.drawable.sacrificial)
            12 -> diceImage.setImageResource(R.drawable.sayu)
            13 -> diceImage.setImageResource(R.drawable.witsith)
            14 -> diceImage.setImageResource(R.drawable.rosaria)
            15 -> diceImage.setImageResource(R.drawable.razor)
            16 -> diceImage.setImageResource(R.drawable.monabanner)
            17 -> diceImage.setImageResource(R.drawable.ayakabanner)
            18 -> diceImage.setImageResource(R.drawable.s1)
            19 -> diceImage.setImageResource(R.drawable.s2)
            20 -> diceImage.setImageResource(R.drawable.s3)
            21 -> diceImage.setImageResource(R.drawable.s4)
            22 -> diceImage.setImageResource(R.drawable.s5)
            23 -> diceImage.setImageResource(R.drawable.s6)
            24 -> diceImage.setImageResource(R.drawable.razor)
            25 -> diceImage.setImageResource(R.drawable.rosaria)
        }

        //deleted view cok
        //Update the screen with the dice roll
        //val resultTextView:TextView = findViewById(R.id.textView)
        //resultTextView.text = diceRoll.toString()
    }
}

fun main() {
    val myFirstDice = Dice(25)
    val rollResult = myFirstDice.roll()
    // println("Your ${myFirstDice.numSides} sided dice rolled ${rollResult}!")
    /* val luckynumber = 4
    when(rollResult){
        luckynumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }

     */
}
// class rolls gacha
class Dice(val numSides: Int) { //privat biar ga kemana mana
    fun roll(): Int {
        return (1..numSides).random()
    }
}