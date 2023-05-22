package com.example.a00109220_parcial.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.a00109220_parcial.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment1 : Fragment() {
    private lateinit var floatingActionButton: FloatingActionButton
    private lateinit var CardView: CardView
    private lateinit var Button: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_first1,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        bindFloating()
        bindCard()
        bindButton()
        floatingActionButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment1_to_secondFragment)
        }

        CardView.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment1_to_secondFragment)
        }

        Button.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment1_to_secondFragment)
        }
    }

    private fun bindFloating(){
        floatingActionButton = view?.findViewById(R.id.floatingActionButton) as FloatingActionButton
    }

    private fun bindCard(){
        CardView = view?.findViewById(R.id.cardView) as CardView
    }

    private fun bindButton(){
        Button = view?.findViewById(R.id.button) as Button

    }
}