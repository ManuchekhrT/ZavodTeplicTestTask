package ru.zavodteplictesttask.ui.routes

sealed class ScreenRoutes(val route: String) {
    object PhoneNumberScreen : ScreenRoutes("phone_number")
    object SmsCodeScreen : ScreenRoutes("sms_code/{phone}")
    object RegisterScreen : ScreenRoutes("register/{phone}")

    object ProfileScreen : ScreenRoutes("profile")
    object ChatsScreen : ScreenRoutes("chats")
    object ChatMessagesScreen : ScreenRoutes("chat_messages")
}