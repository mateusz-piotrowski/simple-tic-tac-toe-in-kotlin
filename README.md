# Simple Tic-Tac-Toe (Kotlin)

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](#)
[![License](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

## Overview

Simple Tic-Tac-Toe is a console-based implementation of the classic two-player game. This project is part of the Hyperskill (JetBrains Academy) Kotlin curriculum, guiding through the process of building a functional game with board rendering, move validation, and win condition checking.

## Features

- Render a 3x3 game board.
- Support for 'X' and 'O' players.
- Input validation (checking for occupied cells, non-numeric input).
- Win and draw condition detection.

## Stack & Requirements

- **Language:** Kotlin
- **Build System:** Gradle
- **JDK:** 17 or higher (recommended)

## Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your system.

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd "Simple Tic-Tac-Toe (Kotlin)"
   ```

### Running the Application

To run the game, use the Gradle wrapper:

```bash
./gradlew run
```

*Note: On Windows, use `gradlew.bat run`.*

## Scripts & Commands

- `./gradlew build`: Compiles the project and runs tests.
- `./gradlew run`: Executes the main application.
- `./gradlew test`: Runs the automated test suite.
- `./gradlew clean`: Deletes the build directory.

## Tests

The project includes tests powered by the `hs-test` framework. To run tests:

```bash
./gradlew test
```

## Project Structure

```text
.
├── Simple Tic-Tac-Toe (Kotlin)
│   ├── task
│   │   ├── src/tictactoe/Main.kt  # Main entry point
│   │   └── test/TicTacToeTest.java # Project tests
│   └── ... (stage-specific task files)
├── build.gradle                   # Gradle build configuration
├── settings.gradle                # Gradle project settings
└── ...
```

## Environment Variables

No specific environment variables are required for this project.

## Code of Conduct

Please review our [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for expected behavior.

## Contributing

Please see our [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute to this project.

## Contributor

Mateusz Piotrowski

## License

This project is licensed under the [MIT License](LICENSE).
