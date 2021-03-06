package com.magrathea.awesomerecipes.di

import android.app.Activity
import com.magrathea.awesomerecipes.helper.PermissionManager
import com.magrathea.awesomerecipes.helper.PermissionManagerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class ViewModule {

    @Provides
    @ActivityScoped
    fun providePermissionManager(
        activityContext: Activity
    ): PermissionManager {
        return PermissionManagerImpl(activity = activityContext)
    }
}