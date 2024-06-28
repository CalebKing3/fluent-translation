# Fluynt

Welcome to **Fluynt**, a cutting-edge language learning app designed to compete with Duolingo. Fluynt aims to provide a seamless and engaging learning experience across iOS, Android, and Desktop platforms using Kotlin Multiplatform.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Preferred Editors](#preferred-editors)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

Fluynt is a Kotlin Multiplatform project designed to offer a comprehensive language learning experience. By leveraging shared business logic and UI components, we aim to provide a consistent user experience across multiple platforms, reducing development time and maintenance overhead.

## Features

- **Interactive Lessons**: Engaging lessons with audio, visual, and interactive elements.
- **Progress Tracking**: Monitor your learning progress and achievements.
- **Gamification**: Earn points, badges, and compete with friends.
- **Multiplatform Support**: Available on iOS, Android, and Desktop.
- **Offline Mode**: Continue learning without an internet connection.

## Getting Started

### Prerequisites

To build and run Fluynt, you'll need:

- **JDK 11** or higher
- **Git** (for version control)
- 
This is a Kotlin Multiplatform project targeting Android, iOS, Desktop, Server.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/server` is for the Ktor server application.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…