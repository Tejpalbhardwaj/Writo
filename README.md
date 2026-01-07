📝 Writo

Writo is a lightweight and efficient note-taking Android application built using Kotlin and Jetpack Compose.
It follows MVVM architecture and uses Room Database for reliable offline data storage.

✨ Features

✍️ Create, update, and delete notes

💾 Offline-first storage using Room DB

⚡ Smooth and responsive UI with Jetpack Compose

🧠 Clean architecture using MVVM

🔄 Real-time UI updates via state management

🛠 Tech Stack

Language: Kotlin

UI Toolkit: Jetpack Compose

Architecture: MVVM

Database: Room Database

State Management: ViewModel + State

Build System: Gradle

🧱 Architecture

The project is structured using MVVM (Model–View–ViewModel):

Model: Room (Entity, DAO, Database)

View: Jetpack Compose UI

ViewModel: Handles business logic and app state

This approach ensures scalability, testability, and maintainable code.

📂 Project Structure
com.example.writo
│
├── data
│   ├── NoteEntity.kt
│   ├── NoteDao.kt
│   └── NoteDatabase.kt
│
├── ui
│   ├── screens
│   └── components
│
├── viewmodel
│   └── NoteViewModel.kt
│
└── MainActivity.kt

🚀 Setup & Run

Clone the repository

git clone https://github.com/your-username/writo.git


Open in Android Studio

Sync Gradle and run on a device or emulator

📸 Screenshots

Add app screenshots here

/screenshots/home.png
/screenshots/editor.png

🔮 Planned Enhancements

🔍 Note search functionality

🏷 Tags and categories

🌙 Dark mode support

☁️ Cloud backup

👨‍💻 Author

Tejpal Bhardwaj
Android Developer | Kotlin | Jetpack Compose
