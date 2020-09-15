package qboinstitute.com.miprimeraappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvtitulo.text = "Hola Mundo"
    }


    override fun onStart() {
        super.onStart()
        Log.i("TAGCicloVida", "Ingresó al onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAGCicloVida", "Ingresó al onPause")
    }




    fun DeclaracionVariables(){
        var nombre : String = "Luis"
        val apellido : String = "Salvatierra"
        nombre = "Luis Angel"
        var precio = 31
        var preciofinal = precio * 3
        var peso : Double
        peso = 1.3 * 3
        var edad : Int = 9
        edad = edad * peso.toInt()
    }

    fun DeclaracionValoresNulos(){
        var nombrenulo: String?
        nombrenulo = null
    }

    fun DeclaracionArrayList(){
        val arrayList = ArrayList<String>()
        arrayList.add("Luis")
        arrayList.add("Miguel")
        arrayList.add("Prakash")
        arrayList.add("Rohan")
        arrayList.add("Vijay")
        for (i in arrayList) {
            if(i == "Luis"){
                Log.i("TAGArray", i)
            }else{
                Log.i("TAGArray", "No tiene Apellido")
            }

        }
    }

    fun MetodoSinReturn(a: Int, b: Int){
        var suma = a + b
        var resta = a - b
        var multi = a * b
        var divi = a / b
    }

    fun MetodoConReturn(a : Int, b: Int): Int{
        return a * 100 / b
    }



}