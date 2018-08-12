package me.toptas.rssreader.features.main

import me.toptas.rssreader.base.BasePresenter
import me.toptas.rssreader.di.RssService
import java.util.*
import javax.inject.Inject

/**
 * Created by ftoptas on 28/01/17.
 */

class MainPresenter @Inject constructor(val service: RssService) : BasePresenter<MainContract.View>(), MainContract.Presenter {

    private val helloTexts = listOf("BONJOUR", "HOLA", "HALLO", "MERHABA", "HELLO", "CIAO", "KONNICHIWA")

    override fun loadHelloText() {
        val random = Random()
        val hello = helloTexts[random.nextInt(helloTexts.size)]
        view?.onTextLoaded(hello)
    }
}
