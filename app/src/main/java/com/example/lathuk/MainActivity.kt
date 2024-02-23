package com.example.lathuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lathuk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var find: ActivityMainBinding
    private var bio = mutableListOf<DataA>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        find = ActivityMainBinding.inflate(layoutInflater)
        setContentView(find.root)

        find.listData.layoutManager = LinearLayoutManager(this)
        find.btnSmpan.setOnClickListener {

            val inputNis = find.inNis.text.toString()

            if (
                find.inNis.text.isNotEmpty()&&
                find.inNma.text.isNotEmpty()&&
                find.inKlas.text.isNotEmpty()&&
                find.inJurus.text.isNotEmpty()
            ){
                if (isNisUnique(inputNis)){
                    bio.add(
                        DataA(
                        find.inNis.text.toString(),
                        find.inNma.text.toString(),
                        find.inKlas.text.toString(),
                        find.inJurus.text.toString()
                    )
                    )
                }
            }

        }
    }

    private fun isNisUnique(newNis: String): Boolean{
        return bio.none { it.nis == newNis }
    }

}