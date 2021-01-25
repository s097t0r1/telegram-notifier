package org.s097t0r1.telegram.notifier

import org.gradle.api.tasks.Input

open class TelegramNotifierPluginExtension {
    var token: String? = null
    var chatId: Long? = null
}