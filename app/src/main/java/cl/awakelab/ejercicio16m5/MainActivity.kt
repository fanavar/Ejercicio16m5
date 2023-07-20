package cl.awakelab.ejercicio16m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.awakelab.ejercicio16m5.databinding.ActivityMainBinding

/* Pasos para crear un recycler view
* [x] item layout
* [x] agregar constraints
* [x] cambiar altura de constraints layout de item layout a wrap content
* [x] definir ID
* [x] layout con recycler view
* [x] asignar layout manager
[ x] implementar clase Adapter
[ x]  heredar RecyclerView.Adapter
[ x] creaciones de los métodos: onCreateViewHolder, getItemCount y onBindViewHolder
[ x] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[x ] Agregar constructor
[x ] crear objeto, data class
[ x] Crear lista
[ x] asignar tamaño de la lista en getItemCount
[ x] definir Binding Class del Item
[ x] cambiar view por el binding
[ x] declarar variable item en onBindViewHolder
[x ] implementar binding en clase viewHolder
 */
/* [ x] Adapter+ view holder
* [ x] obtener los datos
* /*

* */
* */

class MainActivity : AppCompatActivity(), PaisCallback {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        adapter.setPaisCallback(this)
        adapter.setData(PaisesLatam.paises)
        binding.recyclerView.adapter = adapter

    }

    override fun showCountry(s: String) {
        binding.textView.text = s
    }
}