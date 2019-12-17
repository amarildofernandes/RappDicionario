package com.example.rappdicionario.fragmentos.splash


import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.rappdicionario.R


class SplashFragment : Fragment() {


    val TEMPO_SPLASH = 3000

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        lancarJanelaHome()

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun lancarJanelaHome() {
        Handler().postDelayed(object : Runnable {
            override fun run() {
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeHostFragment())
            }
        }, TEMPO_SPLASH.toLong())
    }


}
