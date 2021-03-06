package me.toptas.rssreader.di

import dagger.Component
import me.toptas.rssreader.features.main.MainActivity
import me.toptas.rssreader.features.main.MainContract
import me.toptas.rssreader.features.rss.RssFragment

/**
 * Created by ftoptas on 24/07/18.
 */
@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun mainPresenter(): MainContract.Presenter

    fun inject(mainActivity: MainActivity)

    fun inject(rssFragment: RssFragment)
}