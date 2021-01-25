package org.s097t0r1.telegram.notifier

import com.github.kotlintelegrambot.bot
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class TelegramNotifierPluginTask : DefaultTask() {

    @Input
    var token: String? = null

    @Input
    var chatId: Long? = null


    @TaskAction
    fun telegramNotificator() {
        val bot = bot {
            token = this@TelegramNotifierPluginTask.token!!
        }

        bot.sendMessage(chatId = chatId!!, text = "Build Success")

        println("Message was sent")
    }

}