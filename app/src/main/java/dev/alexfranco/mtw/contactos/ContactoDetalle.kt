package dev.alexfranco.mtw.contactos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_contacto_detalle.*

class ContactoDetalle : AppCompatActivity() {

    var telefono: String = ""
    var email: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto_detalle)

        val contacto = intent.getStringExtra("contacto")
        when (contacto) {
            "contacto1" -> actualizarDetalle(contacto1)
            "contacto2" -> actualizarDetalle(contacto2)
            "contacto3" -> actualizarDetalle(contacto3)
            else -> { // Note the block
                Log.e("CDetalle", "No existe contacto")
            }
        }

        btnLlamar.setOnClickListener(View.OnClickListener {
            hacerLlamada()
        })

        btnEmail.setOnClickListener(View.OnClickListener {
            enviarEmail()
        })
    }

    private fun actualizarDetalle(contacto: Contacto) {
        txtNombre.text = "Nombre: ".plus(contacto.nombre)
        txtPuesto.text = "Puesto: ".plus(contacto.puesto)
        txtArea.text = "Area: ".plus(contacto.area)
        txtDomicilio.text = "Domicilio: ".plus(contacto.domicilio)
        txtCiudad.text = "Ciudad: ".plus(contacto.ciudad)
        txtCorreo.text = "Correo: ".plus(contacto.correo)
        txtTelefono.text = "Telefono: ".plus(contacto.telefono)

        // Variables para botones
        this.telefono = contacto.telefono
        this.email = contacto.correo
    }

    private fun hacerLlamada() {
        val Uri = Uri.parse("tel:".plus(telefono))
        val intent = Intent(Intent.ACTION_DIAL, Uri)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    private fun enviarEmail() {
        val intEmail = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:".plus(email))
            putExtra(Intent.EXTRA_SUBJECT,"Email de prueba")
            putExtra(Intent.EXTRA_TEXT,"Cuerpo del correo")
        }
        if( intent.resolveActivity(packageManager) != null )
            startActivity(intEmail)
    }
}
