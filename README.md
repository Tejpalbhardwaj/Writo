📝 Writo

Writo is a clean and minimal Android note-taking application designed to help users quickly capture, edit, and manage their thoughts. Built with modern Android tools, the app focuses on simplicity, offline reliability, and smooth performance for everyday use.

📱 Features

✍️ Create, edit, and delete notes

💾 Offline data storage using Room Database

⚡ Smooth and responsive UI with Jetpack Compose

🔄 Automatic UI updates using state management

🎯 Simple and distraction-free experience

🛠 Tech Stack

Language: Kotlin

UI: Jetpack Compose

Architecture: MVVM (Model-View-ViewModel)

Database: Room Database

State Management: ViewModel + State

Build System: Gradle

🧱 Architecture

Writo follows the MVVM architecture pattern to ensure a clean separation of concerns:

Model: Room (Entity, DAO, Database)

View: Jetpack Compose UI components

ViewModel: Handles business logic and UI state

This structure makes the codebase scalable, maintainable, and easy to test.

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

🚀 Getting Started

Clone the repository

git clone https://github.com/your-username/Writo.git


Open the project in Android Studio

Sync Gradle and run on an emulator or physical device

📸 Screenshots

Add screenshots of the app UI here

/screenshots/home.png
/screenshots/editor.png

🔮 Future Enhancements

🔍 Search notes

🏷 Tags and categories

🌙 Dark mode support

☁️ Cloud backup & sync

👨‍💻 Developer

Tejpal Bhardwaj
Android Developer | Kotlin | Jetpack Compose

GitHub: https://github.com/Tejpalbhardwaj
