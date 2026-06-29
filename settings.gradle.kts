pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
    id("com.gradle.develocity") version "4.3"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"
    id("com.fueledbycaffeine.spotlight") version "1.4.1"
}
rootProject.name = "DriverApp"
develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}

buildCache {
    remote(develocity.buildCache) {
        isPush = true
       
    }
}


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
} 
include (":core:push")
include (":core:contact")
include (":core:login")
include (":core:identity")
include (":core:checkout")
include (":core:cart")
include (":core:user")
include (":core:profile")
include (":core:feed")
include (":core:comment")
include (":core:post")
include (":core:search")
include (":core:location")
include (":core:network")
include (":core:sync")
include (":core:share")
include (":core:group")
include (":core:message")
include (":core:notification")
include (":core:setting")
include (":feature:account")
include (":feature:session")
include (":feature:analytics")
include (":feature:report")
include (":feature:log")
include (":feature:status")
include (":feature:metric")
include (":feature:task")
include (":feature:calendar")
include (":feature:event")
include (":feature:alarm")
include (":feature:timer")
include (":feature:file")
include (":feature:document")
include (":feature:note")
include (":feature:todo")
include (":feature:list")
include (":feature:map")
include (":feature:weather")
include (":feature:forecast")
include (":domain:news")
include (":domain:article")
include (":domain:podcast")
include (":domain:video")
include (":domain:photo")
include (":domain:gallery")
include (":domain:media")
include (":domain:audio")
include (":domain:playlist")
include (":domain:push-contact")
include (":domain:contact-contact")
include (":domain:login-contact")
include (":domain:identity-contact")
include (":domain:checkout-contact")
include (":domain:cart-contact")
include (":domain:user-contact")
include (":domain:profile-contact")
include (":domain:feed-contact")
include (":domain:comment-contact")
include (":domain:post-contact")
include (":repository:search-contact")
include (":repository:location-contact")
include (":repository:network-contact")
include (":repository:sync-contact")
include (":repository:share-contact")
include (":repository:group-contact")
include (":repository:message-contact")
include (":repository:notification-contact")
include (":repository:setting-contact")
include (":repository:account-contact")
include (":repository:session-contact")
include (":repository:analytics-contact")
include (":repository:report-contact")
include (":repository:log-contact")
include (":repository:status-contact")
include (":repository:metric-contact")
include (":repository:task-contact")
include (":repository:calendar-contact")
include (":repository:event-contact")
include (":repository:alarm-contact")
include (":model:timer-contact")
include (":model:file-contact")
include (":model:document-contact")
include (":model:note-contact")
include (":model:todo-contact")
include (":model:list-contact")
include (":model:map-contact")
include (":model:weather-contact")
include (":model:forecast-contact")
include (":model:news-contact")
include (":model:article-contact")
include (":model:podcast-contact")
include (":model:video-contact")
include (":model:photo-contact")
include (":model:gallery-contact")
include (":model:media-contact")
include (":model:audio-contact")
include (":model:playlist-contact")
include (":model:push-login")
include (":model:contact-login")
include (":app:app")