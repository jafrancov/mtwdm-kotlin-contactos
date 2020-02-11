package dev.alexfranco.mtw.contactos

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNombre1.text = contacto1.nombre
        txtPuesto1.text = contacto1.puesto
        txtNombre2.text = contacto2.nombre
        txtPuesto2.text = contacto2.puesto
        txtNombre3.text = contacto3.nombre
        txtPuesto3.text = contacto3.puesto

        rowContacto1.setOnClickListener(this)
        rowContacto2.setOnClickListener(this)
        rowContacto3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intentContactoDetalle = Intent(this, ContactoDetalle::class.java)
        when(v?.id){
            R.id.rowContacto1->intentContactoDetalle.putExtra("contacto", "contacto1")
            R.id.rowContacto2->intentContactoDetalle.putExtra("contacto", "contacto2")
            R.id.rowContacto3->intentContactoDetalle.putExtra("contacto", "contacto3")
        }
        startActivity(intentContactoDetalle)
    }
}
